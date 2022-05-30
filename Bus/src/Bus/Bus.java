package Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {
	private int id; // ������ ID
	private String type; // ������ ����
	private int number; // ���� ��ȣ
	private int passengers; // �°�
	Route_map rm; // �뼱
	staff st;
	List<Route_map> route; 
	List<staff> staff;
	
	public Bus(int id , String type , int number,  int passengers) {
		if(this.passengers < 10) {
			this.passengers = passengers;
			this.id = id;
			this.type = type;
			this.number = number;
		}else {
		 	System.out.println("�°� ���� ���� á���ϴ�");
		}
	}
	
	public List<Route_map> getRoute_map() {
		return route;
	}
	public List<staff> getStaff() {
		return staff;
	}

	public String setRoute_map(Route_map rm) {
		route = new ArrayList<Route_map>();
		route.add(rm);
		return ("number : " + rm.getNumber() + " ID : " + rm.getId() + " ��� : " + rm.getRoute());
	}
	
	public String setstaff(staff st) {
		staff = new ArrayList<staff>();
		staff.add(st);
		return ("�̸� : " + st.getName() + " ID : " + st.getID() + " ���� : " + st.getRank() + " ���� : " + st.getSalary());
	}

	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		if(this.passengers < 10) {
			this.passengers += passengers;
		}else {
		 	System.out.println("�°� ���� ���� á���ϴ�");
		}
	}
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Route_map getRm() {
		return rm;
	}
	public void setRm(Route_map rm) {
		this.rm = rm;
	}
	public List<Route_map> getRoute() {
		return route;
	}
	public void setRoute(List<Route_map> route) {
		this.route = route;
	}
	
	
	
	
	
	
}
