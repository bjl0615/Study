package Bus;

public class staff {
	private String name; // 이름
	private int ID; // 직원 고유 ID
	private int salary; // 월급
	private String rank; // 직급
	private int age; // 나이
	private Bus bs; // 버스
	
	public staff(String name , int id , int salary , String rank , int age) {
		this.name = name;
		this.ID = id ;
		this.salary = salary;
		this.rank = rank;
		this.age = age;
	}
	
	public void setBus(int id, String type , int number , int passengers) {
		bs = new Bus(id, type, number, number);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "나이 : " + age + " ID : " + ID + " 월급 : " + salary + " 직급 : " + rank;
	}
	
}
