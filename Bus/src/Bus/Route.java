package Bus;

import java.util.ArrayList;
import java.util.List;

public class Route{
	List<Station> route;
	
	public Route(List<Station> rt) {
		this.route = rt;
	}
	
	public void addStation(Station st) {
		route.add(st);
	}
	
//	public void removeStaion(Station st) {
//		route.remove(st);
//	}
//	
//	public void updateStaion(String st1 , Station st2) {
//			
//	}
	public List<Station> getRoute() {
		return route;
	}
	public void setRoute(List<Station> route) {
		this.route = route;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "역이 " + Integer.toString(route.size()) + "개 있습니다.";
		
	}
}
