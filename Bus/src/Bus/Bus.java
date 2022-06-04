package Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus /* extends Employee */{
	enum type {
		out_of_town,
		downtown,
		town,
		tour,
		limousine
	}
	type type; // ���� ����
	int number; // ���� ��ȣ
	int id; // ���� ID
	int passenger; // �°� �� 
	List<Route> route; // ���
	
	public Bus(type type, int number , int id , int passenger , Route rt) {
			this.type = type;
			this.number = number;
			this.id = id;
			this.passenger = passenger;
			route = new ArrayList<Route>();
			route.add(rt);
	}
	
	public void addRoute(Route rt) {
	}
	
	
	public void getRoute(List<Route> rt) {
		route = rt;
	}
	public type getType() {
		return type;
	}
	public void setType(type type) {
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public List<Route> getRoute() {
		return route;
	}
	public void setRoute(List<Route> route) {
		this.route = route;
	}
	
	@Override
	public String toString() {
		return "���� Ÿ�� : " + type + " ��ȣ : " + number + " ID : " + id + " ���� �� : " + passenger; 
	}
}
