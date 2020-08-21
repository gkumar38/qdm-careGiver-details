package com.qdm.cg.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.qdm.cg.Entity.Notifications;
import com.qdm.cg.Entity.Nudges;
import com.qdm.cg.Entity.TotalCount;

@Service
public class CGHomeService {
	
	public List<String> getCgNotifications(){
		Notifications notifications = new Notifications();
		List<String> notified= null;
		//Call DB Classes
		notifications.setNotifications(notified);
		return notified;
	}
	
	public Integer totalCount(String type) {
		Integer totalCount =  0;
		TotalCount total = new TotalCount();
		if(type == null) {
			//Call DB on totalCount 
			total.setTotalClient(totalCount);
			return 0;
		}else if(type.equals("feedback")){
			//Call DB on totalCount
			total.setTotalClient(totalCount);
		return totalCount;
		}else if(type.equals("client")) {
			//Call DB on totalCount
			total.setTotalClient(totalCount);
			return totalCount;
		}
		return totalCount;
	}
	
	public List<String> getNudges(){
		Nudges nudges = new Nudges();
		List<String> nudgeList= null;
		nudges.setNudges(nudgeList);
		return nudgeList;
		
		
	}

	public List<String> getNudgesDetails() {
		Nudges nudges = new Nudges();
		List<String> totalNudges= null;
		nudges.setNudges(totalNudges);
		return totalNudges;
	}
	

}