package model;

public class Tasklist {
	private String name;
	private Entity fromEntity;
	private int instanceId;
	protected static int idController = 0;
	
	public Tasklist(String name, Entity fromEntity) {
		this.name = name;
		this.fromEntity = fromEntity;
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
	
	public Entity getFromEntity() {
		return fromEntity;
	}

}
