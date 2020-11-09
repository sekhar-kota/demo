package info.inetsolve.demo;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.jdbc.core.JdbcTemplate;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@Configuration

public class DemoDao {
@Resource
	private JdbcTemplate jdbcTemplate;

public void save (Employee employee) {
	
	String sql ="insert into emp values(?,?,?)";
	jdbcTemplate.update(sql, employee.getName(),employee.getSalary(),employee.getId());
}
	
}
