package Bus;

public class staff {
	private String name; // �̸�
	private int ID; // ���� ���� ID
	private int salary; // ����
	private String rank; // ����
	private int age; // ����
	private Bus bs; // ����
	
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
		return "�̸� : " + name + "���� : " + age + " ID : " + ID + " ���� : " + salary + " ���� : " + rank;
	}
	
}
