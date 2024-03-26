package com.SpringAssignment5.SpringAssignment5;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int id;
    private String name;
    private List<SessionClass> sessions;

    public Trainer(int id, String name) {
        this.id = id;
        this.name = name;
        this.sessions = new ArrayList<>();
    }

    public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
	        return id;
	}
	public String getName() {
	        return name;
	}

	public void setSessions(List<SessionClass> sessions) {
		this.sessions = sessions;
	}

    public List<SessionClass> getSessions() {
        return sessions;
    }
}