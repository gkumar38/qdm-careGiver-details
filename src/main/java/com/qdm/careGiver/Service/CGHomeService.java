package com.qdm.careGiver.Service;

import java.util.List;
import org.springframework.stereotype.Service;




@Service
public interface CGHomeService {
	
	public List<String> getCgNotifications();
	
	public Integer totalCount(String type);
	
	public List<String> getNudges(int size);

	public List<String> getNudgesDetails();

	public Integer totalFeedbackCount(String type); 
	

}