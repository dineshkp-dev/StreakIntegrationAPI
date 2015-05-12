package com.koreinfotech.sms.streakintegration.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.koreinfotech.sms.streakintegration.domain.LeadTable;
import com.koreinfotech.sms.streakintegration.utils.HibernateUtils;

public class ImplLeadTableDAO implements LeadTableDAO {

	@Override
	public boolean addLeadTable(LeadTable leadTable) {
		System.out.println("Adding LeadTable: " + leadTable.getLeadName());
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(leadTable);
		tx.commit();
		HibernateUtils.closeSession(session);
		return false;
	}

}
