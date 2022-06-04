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
	type type; // 버스 종류
	int number; // 버스 번호
	int id; // 버스 ID
	int passenger; // 승객 수 
	List<Route> route; // 경로
	
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
		return "버스 타입 : " + type + " 번호 : " + number + " ID : " + id + " 숭객 수 : " + passenger; 
	}
}
