package my.test.app.service;

import javax.ejb.Remote;

@Remote
public interface TestServiceRemote {
	void sayHello(String name);
}
