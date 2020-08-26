package com.qdm.careGiver.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qdm.careGiver.Entity.Notifications;

@Repository
public interface CGNotificationRepository extends JpaRepository<Notifications, Long>{
	@Query(value = "Select notification_desc from caregiver_notifications",nativeQuery = true)
	public List<String> getNotificationDetails(Long userId);

}
