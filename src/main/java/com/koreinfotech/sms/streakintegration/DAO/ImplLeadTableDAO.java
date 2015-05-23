package com.koreinfotech.sms.streakintegration.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.koreinfotech.sms.streakintegration.domain.LeadTable;
import com.koreinfotech.sms.streakintegration.utils.HibernateUtils;

public class ImplLeadTableDAO implements LeadTableDAO {

	@Override
	public boolean addLead(LeadTable leadTable) {
		System.out.println("Adding a new Lead: " + leadTable.getLeadName());
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(leadTable);
		tx.commit();
		HibernateUtils.closeSession(session);
		return false;
	}

}
