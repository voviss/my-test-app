package my.test.app.test;

import javax.annotation.Resource;
import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import my.test.app.service.TestServiceLocal;
import my.test.app.service.TestServiceRemote;
import my.test.app.service.TestServiceUnknown;
import my.test.app.service.impl.TestService;

@RunWith(Arquillian.class)
public class TestServicesTest {
	@Deployment
	public static Archive<?> createTestArchive() {
		return ShrinkWrap.create(WebArchive.class, "test.war")
				.addClasses(TestService.class, TestServiceLocal.class, TestServiceRemote.class,
						TestServiceUnknown.class, Resource.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	}

	@EJB
	private TestServiceUnknown testService;

	@Test
	public void testService() throws Exception {
		testService.sayHello("Vladimir");
	}

}
