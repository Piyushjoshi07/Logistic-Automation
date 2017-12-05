package com.Application.Model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

public class Node implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private long nodeId;
	
private static AtomicLong COUNTER = new AtomicLong(0L);
    
    @PersistenceConstructor
    public Node() throws Exception {
        this.nodeId = COUNTER.incrementAndGet();
    }
	
	private String nodeName;
	
	private int startNode;
	
	private int endNode;
	
	private String dropTime;
	
	private Location location;

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public int getStartNode() {
		return startNode;
	}

	public void setStartNode(int startNode) {
		this.startNode = startNode;
	}

	public int getEndNode() {
		return endNode;
	}

	public void setEndNode(int endNode) {
		this.endNode = endNode;
	}

	public String getDropTime() {
		return dropTime;
	}

	public void setDropTime(String dropTime) {
		this.dropTime = dropTime;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
