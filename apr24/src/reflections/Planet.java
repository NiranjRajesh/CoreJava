package reflections;

import java.util.List;

public class Planet {
	private String Name;
	private List<String> moon;
	private Integer  satellites;
	@nasa
	public Planet() {
		
	}
	@nasa
	public Planet(String name, List<String> moon, Integer satellites) {
		super();
		Name = name;
		this.moon = moon;
		this.satellites = satellites;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getMoon() {
		return moon;
	}
	public void setMoon(List<String> moon) {
		this.moon = moon;
	}
	public Integer getSatellites() {
		return satellites;
	}
	public void setSatellites(Integer satellites) {
		this.satellites = satellites;
	}
	
	
	private void hiddenMethod1() {
		
	}
	protected void hiddenOutPac() {
		
	}
	
	
	

}
