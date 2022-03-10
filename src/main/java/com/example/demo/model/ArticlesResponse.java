package com.example.demo.model;

import java.util.List;

public class ArticlesResponse {
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	private String status;
	private int totalResults;
	private List<Article> articles;
	@Override
	public String toString() {
		return "ArticlesResponse [status=" + status + ", totalResults=" + totalResults + ", articles=" + articles + "]";
	}
	
	
}
