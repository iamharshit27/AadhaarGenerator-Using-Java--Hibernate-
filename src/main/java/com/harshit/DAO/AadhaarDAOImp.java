package com.harshit.DAO;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.harshit.model.AadhaarDetails;
import com.harshit.util.HibernateUtil;

public class AadhaarDAOImp implements AadhaarDAO{
	HibernateUtil hibernateUtil = new HibernateUtil();
	@Override
	public AadhaarDetails findById(long number) {
		Session session = null;
		AadhaarDetails aadr = new AadhaarDetails();
		session = hibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		aadr =(AadhaarDetails)session.load(AadhaarDetails.class, number);
		tx.commit();
		return aadr;
	}

	@Override
	public String addAadhaar(AadhaarDetails aadhaar) {
		Session session = null;
		String result="failure";
		Transaction tx = null;
		session = hibernateUtil.getSession();
		tx =session.beginTransaction();
		Serializable obj =  session.save(aadhaar);
		tx.commit();
		
		if(obj!=null)
		{
			result="success";
		}
		return result;
	}



}
