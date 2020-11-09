package info.inetsolve.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoServices<employee> {
@Autowired	
private DemoDao demoDao;
private void saveempdata(Employee employee) {
	demoDao.save(employee);
}
public void saveempdata(employee employee) {
	// TODO Auto-generated method stub
	
}
}
