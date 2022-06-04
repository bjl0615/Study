package Bus;

import java.util.ArrayList;
import java.util.List;

public class Employee{
	enum rankType{
		employee,
		deputy,
		exaggeration,
		conductor,
		director
	}
	String name; // 직원 이름
	int id; // 직원 ID
	int age;	// 직원 나이
	int salary; // 직원 월급
	List<Bus> bus; // 버스 list
	rankType rank; // 직원 직급
	
	public Employee(String name, int id, int age , int salary , rankType rank) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.rank = rank;
		bus = new ArrayList<Bus>();
	}
	
	public void addBus(Bus bs) {
		bus.add(bs);
	}
	
	public String getName() {
		return name;
	}
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public rankType getRank() {
		return rank;
	}
	public void setRank(rankType rank) {
		this.rank = rank;
	}
	
	
	@Override
	public String toString() {
		return "이름 : " + name + " ID : " + id + " 나이 : " + age + " 월급 : " + salary + " 직급 : " + rank;
	}
}
