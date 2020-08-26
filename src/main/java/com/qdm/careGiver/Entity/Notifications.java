package com.qdm.careGiver.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "caregiver_notifications")
public class Notifications implements Serializable{
	
	@ManyToOne
	private CareGiver careGiver;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
	private Long notificationId;
	
	
    @Column(name = "caregiver_id")
    private Long careGiverId;
	
	@Column(name = "notification_desc")
	private String notificationDesc;
	

}
