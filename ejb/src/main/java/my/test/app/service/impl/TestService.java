package my.test.app.service.impl;

import javax.ejb.Stateless;

import my.test.app.service.TestServiceLocal;
import my.test.app.service.TestServiceRemote;
import my.test.app.service.TestServiceUnknown;

@Stateless
public class TestService implements TestServiceLocal, TestServiceRemote, TestServiceUnknown {

	public void sayHello(String name) {
		System.out.println("\n\n========================\nhello " + name + "\n========================\n\n");
	}
		
}


