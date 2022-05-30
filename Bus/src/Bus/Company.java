package Bus;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private List<Bus> buses; // ����(��)
	private int ID; // ���� ȸ���� ���� ��ȣ
	private String area; // ����
	private String companyName; // ȸ�� �̸� 
	private String type; // ���� ȸ�� Ÿ��
	private Bus bus;
	
	public Company(int id , String area , String companyName , String type) {
		this.ID = id;
		this.area = area;
		this.companyName = companyName;
		this.type = type;
	}
	
	public List<Bus> getBuses() {
		return buses;
	}
	
	public void setBuses(int id , String type , int number,  int passengers) {
		bus = new Bus(id , type , number , passengers);
		buses = new ArrayList<Bus>();
		buses.add(bus);
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
