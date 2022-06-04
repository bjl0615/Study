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
	String name; // ���� �̸�
	int id; // ���� ID
	int age;	// ���� ����
	int salary; // ���� ����
	List<Bus> bus; // ���� list
	rankType rank; // ���� ����
	
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
		return "�̸� : " + name + " ID : " + id + " ���� : " + age + " ���� : " + salary + " ���� : " + rank;
	}
}
