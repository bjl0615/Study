package Bus;

public class Route_map {
	private int number; // ��� ��ȣ
	private int id; // ��� ���̵�
	private String route; // ���
	
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
		return ("��� ��ȣ : " + this.getNumber() + " ��� ���̵� : " + this.getId() + " ��� : " + this.route);
	}
	
}
