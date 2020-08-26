package com.qdm.careGiver.Service;



import com.qdm.careGiver.Response.NotificationResponse;





public interface CGHomeService {
	
	public NotificationResponse getCgNotifications(Long userId,NotificationResponse notificationResp);
	
	//public Integer totalCount(String userId, String type);
	
	//public List<String> getNudges(String userId,int size);

	//public List<String> getNudgesDetails(String userID);

	//public Integer totalFeedbackCount(String userId, String type); 
	

}