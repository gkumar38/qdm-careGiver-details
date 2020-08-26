package com.qdm.careGiver.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qdm.careGiver.Response.NotificationResponse;
import com.qdm.careGiver.Service.CGHomeServiceImpl;

@RestController
@RequestMapping("/careGiver/home")
public class CGHomeController {
	
	@Autowired
	CGHomeServiceImpl cghomeService;
	
	
	@GetMapping(path = "/nudges", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getCGNudgesListt(){
		
		return ResponseEntity.ok().body("I am here");
	}
	
	@GetMapping(path = "/notifications/get/{userId}",
			produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<NotificationResponse> getCgNotifications(@PathVariable("userId")Long userId){
		NotificationResponse notified= null;
		notified = cghomeService.getCgNotifications(userId,notified);
        return ResponseEntity.ok().body(notified);
		
	}
	
	
}