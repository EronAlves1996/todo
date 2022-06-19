package model;

import java.util.Date;

public class Task {
	private Tasklist fromTasklist;
	private int instanceId;
	protected static int idController = 0;
	private String name;
	private boolean done = false;
	private Date createdAt;
	private Date doneAt;
	
	public Task(Tasklist fromTasklist, String name, Date createdAt) {
		this.fromTasklist = fromTasklist;
		this.name = name;
		this.createdAt = createdAt;
		this.instanceId = ++idController;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isDone() {
		return done;
	}
	
	public void setDone(boolean done) {
		this.done = done;
		if(done) setDoneAt(new Date());
		else setDoneAt(null);
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public Date getDoneAt() {
		return doneAt;
	}
	
	private void setDoneAt(Date doneAt) {
		this.doneAt = doneAt;
	}

	public Tasklist getFromTasklist() {
		return fromTasklist;
	}

	public int getInstanceId() {
		return instanceId;
	}
}
