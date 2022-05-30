package Bus;

public class Route_map {
	private int number; // 경로 번호
	private int id; // 경로 아이디
	private String route; // 경로
	
	public Route_map(int number, int id , String route) {
		this.number = number;
		this.id = id;
		this.route = route;
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
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	
	@Override
	public String toString() {
		return ("경로 번호 : " + this.getNumber() + " 경로 아이디 : " + this.getId() + " 경로 : " + this.route);
	}
	
}
