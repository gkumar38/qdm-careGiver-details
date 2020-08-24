package com.qdm.careGiver.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.qdm.careGiver.Entity.Notifications;
import com.qdm.careGiver.Entity.Nudges;
import com.qdm.careGiver.Entity.TotalCount;
import com.qdm.careGiver.Repository.CGNudgeRepository;
import com.qdm.careGiver.Repository.NotificationDetailsRepository;
import com.qdm.careGiver.Repository.TotalCountRepository;



public class CGHomeServiceImpl implements CGHomeService{
	
	@Autowired
	CGNudgeRepository cgNudgeRepo;
	
	@Autowired 
	NotificationDetailsRepository notificationDetails;
	
	@Autowired
	TotalCountRepository totalCountAll;
	
	public List<String> getCgNotifications(){
		Notifications notifications = new Notifications();
		List<String> notified= null;
		notificationDetails.getAllNotifications();
		notifications.setNotifications(notified);
		return notified;
	}
	
	public Integer totalCount(String type) {
		Integer totalCountClient =  0;
		TotalCount total = new TotalCount();
		totalCountClient = totalCountAll.getTotalClientCount();
		total.setTotalClient(totalCountClient);
		return totalCountClient;
		
	}
	
	public List<String> getNudges(int size){
		Nudges nudges = new Nudges();
		List<String> nudgeList= null;
		nudgeList = cgNudgeRepo.getNudge(size);
		nudges.setNudges(nudgeList);
		return nudgeList;
		
		
	}

	public List<String> getNudgesDetails() {
		Nudges nudges = new Nudges();
		List<String> totalNudges= null;
		totalNudges = cgNudgeRepo.getAllNudges();
		nudges.setNudges(totalNudges);
		return totalNudges;
	}

	public Integer totalFeedbackCount(String type) {
		Integer totalCountFeedback =  0;
		TotalCount total = new TotalCount();
		totalCountFeedback = totalCountAll.getTotalFeedBackCount();
		total.setTotalFeedBack(totalCountFeedback);
		return totalCountFeedback;
	}

}
