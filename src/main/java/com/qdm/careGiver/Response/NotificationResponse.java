package com.qdm.careGiver.Response;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationResponse {
	private List<String> notificationUserId;
}
