package Bus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company{
	String area;
	String c_name;
	int id;
	List<Employee> employee;
	List<Bus> bus;
	
	
	public Company(String area, String c_name, int id , List<Employee> employee , List<Bus> bus) {
		this.area = area;
		this.c_name = c_name;
		this.id = id;
		this.employee = employee;
		this.bus = bus;
	}	
	
	public void addBus(Bus bus) {
		this.bus.add(bus);
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
		return "지역 : " + area + " 회사 이름 : " + c_name + " ID : " + id;
	}
}
