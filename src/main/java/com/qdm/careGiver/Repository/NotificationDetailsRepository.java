package com.qdm.careGiver.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.careGiver.Entity.Notifications;

@Repository
public interface NotificationDetailsRepository extends JpaRepository<Notifications, Integer>{
	
	public List<String> getAllNotifications();

}
