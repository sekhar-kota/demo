package info.inetsolve.demo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Employee {
	
	public Employee(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String id;
	private String salary;
}