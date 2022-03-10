package com.example.demo.model;

import java.util.List;

public class SourceResponse {
	private String status;
	private List<UtilSource> sources;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<UtilSource> getSources() {
		return sources;
	}
	public void setSources(List<UtilSource> sources) {
		this.sources = sources;
	}
	@Override
	public String toString() {
		return "SourceResponse [status=" + status + ", sources=" + sources + "]";
	}
	
}
