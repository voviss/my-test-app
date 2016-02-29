package my.test.app.service;

import javax.ejb.Local;

@Local
public interface TestServiceLocal {
	void sayHello(String name);
}
