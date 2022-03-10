package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ArticlesResponse;
import com.example.demo.model.SourceResponse;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("Hello");

		
		  RestTemplate restTemplate = new RestTemplate();
		  
		  ArticlesResponse articlesResponse = restTemplate.getForObject(
		  "https://newsapi.org/v2/top-headlines?country=us&apiKey=bc061124abe7407693e880f36524040e",
		  ArticlesResponse.class);
		  
		  System.out.println(articlesResponse); model.addAttribute("resp",
		  articlesResponse);
		 
		return "index.html";
	}

	@RequestMapping("/search")
	public String search(@RequestParam("search") String searchedKey, Model model) {
		System.out.println(searchedKey);

		
		  RestTemplate restTemplate = new RestTemplate();
		  
		  ArticlesResponse articlesResponse = restTemplate.getForObject("https://newsapi.org/v2/everything?q=" + searchedKey +"&apiKey=bc061124abe7407693e880f36524040e", ArticlesResponse.class);
		  
		  System.out.println(articlesResponse); 
		  model.addAttribute("resp", articlesResponse);
		 
		return "search.html";
	}
	
	@RequestMapping("/category/{category}")
	public String category(@PathVariable("category") String searchedKey, Model model) {
		System.out.println(searchedKey);

		
		  RestTemplate restTemplate = new RestTemplate();
		  
		  SourceResponse sourceResponse = restTemplate.getForObject("https://newsapi.org/v2/top-headlines/sources?category=" + searchedKey +"&apiKey=a452e70494b549908bca7f31ed64c144", SourceResponse.class);
		  
		  System.out.println(sourceResponse); 
		  model.addAttribute("resp", sourceResponse);
		 
		  return "category.html";
		//return articlesResponse.toString();
//		  return restTemplate.getForObject("https://newsapi.org/v2/top-headlines/sources?category=" + searchedKey +"&apiKey=a452e70494b549908bca7f31ed64c144", String.class);
	}
	
}
/*
 * https://newsapi.org/v2/top-headlines/sources?category=business&apiKey=API_KEY
 * bc061124abe7407693e880f36524040e
 * 
 */
