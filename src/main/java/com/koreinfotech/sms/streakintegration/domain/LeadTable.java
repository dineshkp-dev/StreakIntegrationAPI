package com.koreinfotech.sms.streakintegration.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="LeadTable")
public class LeadTable {
	@Id
	@Column(name="leadtable_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int leadId;
	@Column
	private String streakBoxKey;
	@Column
	private String leadName;
	@Column
	private String courseName;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String notes;
	@Column
	private Date meetingOn;
	@Column
	private Date meetingTime;
	@Column
	private double dealSize;
	@Column
	private String assignedTo;
	@Column
	private Date lastUpdateTime;
	
	/**
	 * @return the leadId
	 */
	public int getLeadId() {
		return leadId;
	}
	/**
	 * @return the streakBoxKey
	 */
	public String getStreakBoxKey() {
		return streakBoxKey;
	}
	/**
	 * @return the leadName
	 */
	public String getLeadName() {
		return leadName;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @return the meetingOn
	 */
	public Date getMeetingOn() {
		return meetingOn;
	}
	/**
	 * @return the meetingTime
	 */
	public Date getMeetingTime() {
		return meetingTime;
	}
	/**
	 * @return the dealSize
	 */
	public double getDealSize() {
		return dealSize;
	}
	/**
	 * @return the assignedTo
	 */
	public String getAssignedTo() {
		return assignedTo;
	}
	/**
	 * @return the lastUpdateTime
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	/**
	 * @param leadId the leadId to set
	 */
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	/**
	 * @param streakBoxKey the streakBoxKey to set
	 */
	public void setStreakBoxKey(String streakBoxKey) {
		this.streakBoxKey = streakBoxKey;
	}
	/**
	 * @param leadName the leadName to set
	 */
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * @param meetingOn the meetingOn to set
	 */
	public void setMeetingOn(Date meetingOn) {
		this.meetingOn = meetingOn;
	}
	/**
	 * @param meetingTime the meetingTime to set
	 */
	public void setMeetingTime(Date meetingTime) {
		this.meetingTime = meetingTime;
	}
	/**
	 * @param dealSize the dealSize to set
	 */
	public void setDealSize(double dealSize) {
		this.dealSize = dealSize;
	}
	/**
	 * @param assignedTo the assignedTo to set
	 */
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	/**
	 * @param lastUpdateTime the lastUpdateTime to set
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LeadTable [leadId=");
		builder.append(leadId);
		builder.append(", streakBoxKey=");
		builder.append(streakBoxKey);
		builder.append(", leadName=");
		builder.append(leadName);
		builder.append(", courseName=");
		builder.append(courseName);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", email=");
		builder.append(email);
		builder.append(", notes=");
		builder.append(notes);
		builder.append(", meetingOn=");
		builder.append(meetingOn);
		builder.append(", meetingTime=");
		builder.append(meetingTime);
		builder.append(", dealSize=");
		builder.append(dealSize);
		builder.append(", assignedTo=");
		builder.append(assignedTo);
		builder.append(", lastUpdateTime=");
		builder.append(lastUpdateTime);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * Constructor using the default fields (except for the Id)
	 * @param streakBoxKey
	 * @param leadName
	 * @param courseName
	 * @param phone
	 * @param email
	 * @param notes
	 * @param meetingOn
	 * @param meetingTime
	 * @param dealSize
	 * @param assignedTo
	 * @param lastUpdateTime
	 */
	public LeadTable(String streakBoxKey, String leadName, String courseName,
			String phone, String email, String notes, Date meetingOn,
			Date meetingTime, double dealSize, String assignedTo,
			Date lastUpdateTime) {
		super();
		this.streakBoxKey = streakBoxKey;
		this.leadName = leadName;
		this.courseName = courseName;
		this.phone = phone;
		this.email = email;
		this.notes = notes;
		this.meetingOn = meetingOn;
		this.meetingTime = meetingTime;
		this.dealSize = dealSize;
		this.assignedTo = assignedTo;
		this.lastUpdateTime = lastUpdateTime;
	}
	
	//Default constructor for Hibernate
	public LeadTable() {
		super();
	}
	
}
