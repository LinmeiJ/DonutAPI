package com.api.DonutAPI.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.api.DonutAPI.entity.Details;
import com.api.DonutAPI.entity.Donut;


@Controller
public class DonutController {
	
	RestTemplate rt = new RestTemplate();
	@RequestMapping("/")
	public ModelAndView home() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT,"donut testing" );
		
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		ResponseEntity<Donut> donut = rt.exchange(url,HttpMethod.GET, new HttpEntity<>("paramaters", headers), Donut.class);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("NumOfDonuts", donut.getBody());
		mv.addObject("names",donut.getBody().getResults());
		return mv;
	}
	
 
	@RequestMapping("details")
	public ModelAndView getDetails(@RequestParam("id") Integer id) {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT,"donut testing" );
		
		String url = "https://grandcircusco.github.io/demo-apis/donuts/"+id+".json";
		ResponseEntity<Details> donutDetails = rt.exchange(url,HttpMethod.GET, new HttpEntity<>("paramaters", headers), Details.class);
		ModelAndView mv = new ModelAndView("detail-page");
		mv.addObject("donutInfo",donutDetails.getBody());
		mv.addObject("extra", donutDetails.getBody().getExtras());
		return mv;
	}
	
}
