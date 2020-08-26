package com.qdm.careGiver.Service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qdm.careGiver.Repository.CGNotificationRepository;
import com.qdm.careGiver.Response.NotificationResponse;

@Service
public class CGHomeServiceImpl implements CGHomeService{
	
	@Autowired
	CGNotificationRepository cgNotificationRepo;
	
	public NotificationResponse getCgNotifications(Long userId, NotificationResponse
			notificationResp){
		List<String> notified= null;
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		notified = cgNotificationRepo.getNotificationDetails(userId);
		notificationResp.setNotificationUserId(notified);
		return notificationResp;
	}
}	
