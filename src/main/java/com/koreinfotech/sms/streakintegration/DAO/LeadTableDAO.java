package com.koreinfotech.sms.streakintegration.DAO;

import com.koreinfotech.sms.streakintegration.domain.LeadTable;

public interface LeadTableDAO {
	/**
	 * Adds a LeadTable entry to the Lead-Table
	 * @param leadTable
	 * @return
	 */
	public boolean addLead(LeadTable leadTable);
	
}
