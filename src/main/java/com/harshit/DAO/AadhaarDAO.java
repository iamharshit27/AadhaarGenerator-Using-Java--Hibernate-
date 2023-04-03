package com.harshit.DAO;

import com.harshit.model.AadhaarDetails;

public interface AadhaarDAO {
	
	AadhaarDetails findById(long number);
	String addAadhaar(AadhaarDetails aadhaar);
	

}
