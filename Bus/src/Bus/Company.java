package Bus;

import java.util.ArrayList;
import java.util.List;

public class Company {
	String area;
	String c_name;
	int id;
	List<Employee> employee;
	
	public Company(String area, String c_name, int id) {
		this.area = area;
		this.c_name = c_name;
		this.id = id;
		employee = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		this.employee.add(employee);
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "���� : " + area + " ȸ�� �̸� : " + c_name + " ID : " + id;
	}
}
