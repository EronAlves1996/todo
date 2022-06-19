package model;

public class Entity {
	private String name;
	private int instanceId;
	protected static int idController = 0;
	
	public Entity(String n) {
		this.name = n;
		this.instanceId = ++idController;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInstanceId() {
		return instanceId;
	}
	
}
