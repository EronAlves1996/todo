package model;

import java.util.Date;

public class Task {
	private String associatedEntity;
	private String associatedTasklist;
	private String name;
	private boolean done = false;
	private Date createdAt;
	private Date doneAt;
	
	public Task(String associatedEntity, String associatedTasklist, String name, Date createdAt) {
		this.associatedEntity = associatedEntity;
		this.associatedTasklist = associatedTasklist;
		this.name = name;
		this.createdAt = createdAt;
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
		if(done) {
			setDoneAt(new Date());
		}
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

	public String getAssociatedEntity() {
		return associatedEntity;
	}

	public void setAssociatedEntity(String associatedEntity) {
		this.associatedEntity = associatedEntity;
	}

	public String getAssociatedTasklist() {
		return associatedTasklist;
	}

	public void setAssociatedTasklist(String associatedTasklist) {
		this.associatedTasklist = associatedTasklist;
	}
}
