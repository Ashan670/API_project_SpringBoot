package com.api.model;

public class Endpoint {

	private int id;
	private int status;
	private String endpoint;

	public Endpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public Endpoint() {
	}

	public Endpoint(int id, int status, String endpoint) {
		this.id = id;
		this.status = status;
		this.endpoint = endpoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

}
