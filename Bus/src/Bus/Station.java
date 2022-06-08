package Bus;

public class Station /* extends Route */{
	String name;
	int id;
	
	public Station(String name , int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
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
	
	@Override
	public String toString() {
		return "역 이름 : " + name + " 역 id : " + id;
	}
}
