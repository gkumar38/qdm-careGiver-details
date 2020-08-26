package com.qdm.careGiver.Entity;



import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_care_giver")

public class CareGiver implements Serializable{
	
	/**
	 * It will be contatining notification associated with
	 * particular users
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "caregiver_id")
	private long careGiverId;
	@Column(name="mobile_no_isdcode")
	private int mobIsdCode;
	@Column(name="availability_status")
	private String status;
	@Column(name="address")
	private String address;
	@Column(name= "created_date")
	private Timestamp createdDate;
	@Column(name ="email_id")
	private String emailId;
	@Column(name="modified_date")
	private Timestamp updatedDate;
	@Column(name = "mobile_no")
	private int mobNo;
	@Column(name="caregiver_name")
	private String name;
	@Column(name="clients_count")
	private int clientCount;
	@Column(name="upload_photo_id")
	private int photoId;
	@Column(name = "feedback_count")
	private int feedbackCount;
	@OneToMany(mappedBy= "tb_care_giver")
	private Notifications notification;
}
