package com.qdm.careGiver.Response;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CGCareGiverDetailsResponse {
	
	private int careGiverId;
	
	private int mobIsdCode;
	
	private String status;
	
	private String address;
	
	private Timestamp createdDate;
	
	private String emailId;
	
	private Timestamp updatedDate;
	
	private int mobNo;
	
	private String name;
	
	private int clientCount;
	
	private int photoId;
	
	private int feedbackCount;
	
	private NotificationResponse notification;
	
	private NudgeResponse nudge;

}
