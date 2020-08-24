package com.qdm.careGiver.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdm.careGiver.Service.CGHomeService;

@RestController
@RequestMapping("/careGiver/home")
public class CGHomeController {
	
	@Autowired
	CGHomeService cgHomeservice;
	
	
	@GetMapping(path = "/nudges", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getCGNudgesListt(){
		
		return ResponseEntity.ok().body("I am here");
	}
	
	@GetMapping(path = "/notifications/get/{userId}",
			produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<String>> getCgNotifications(@PathVariable("userId")String userId){
		List<String> notified= null;
		notified = cgHomeservice.getCgNotifications();
        return ResponseEntity.ok().body(notified);
		
	}
	
	@GetMapping(path = "/clientCount/get/{userId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Integer> getCGClientsCount(@PathVariable("userId")String userId){
		Integer totalClientCount = 0;
		String type = "client";
		totalClientCount = cgHomeservice.totalCount(type);
		return ResponseEntity.ok().body(totalClientCount);
	}
	
	@GetMapping(path = "/feedbackCount/get/{userId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Integer> getFeedbackCount(@PathVariable("userId")String userId){
		Integer totalFeedbackCount = 0;
		String type = "feedback";
		totalFeedbackCount = cgHomeservice.totalFeedbackCount(type);
		return ResponseEntity.ok().body(totalFeedbackCount);
	}
	
	@GetMapping(path = "/nudges/get/{userId}/size", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<String>> getCGNudges(@PathVariable("userId")String userId,
			@PathVariable("size")int size){
		size = 2;
		List<String> nudge= null;
		nudge = cgHomeservice.getNudges(size);
		return ResponseEntity.ok().body(nudge);
	}
	@GetMapping(path = "/nudges/get/{userId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<String>> getCGNudgesList(@PathVariable("userId")String userId){
		List<String> nudge= null;
		nudge = cgHomeservice.getNudgesDetails();
		return ResponseEntity.ok().body(nudge);
	}
}