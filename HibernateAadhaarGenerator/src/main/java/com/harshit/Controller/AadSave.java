package com.harshit.Controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import com.harshit.DAO.AadhaarDAO;
import com.harshit.DAO.AadhaarDAOImp;
import com.harshit.model.AadhaarDetails;

/**
 * Servlet implementation class AadSave
 */
@WebServlet("/AadSave")
@MultipartConfig
public class AadSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     long num = Long.parseLong(request.getParameter("number"));
	String name = request.getParameter("name");
	String dob = request.getParameter("dob");
	String gender = request.getParameter("gender");
	String address = request.getParameter("address");
	Part photoPart = request.getPart("photo");
	 InputStream photoInputStream = photoPart.getInputStream();
     byte[] photoBytes = IOUtils.toByteArray(photoInputStream);
      AadhaarDAO addr = new AadhaarDAOImp();
      AadhaarDetails aadhaar = new AadhaarDetails();
      aadhaar.setAadhaarNo(num);
      aadhaar.setName(name);
      aadhaar.setAddress(address);
      aadhaar.setDob(dob);
      aadhaar.setGender(gender);  
      aadhaar.setPhoto(photoBytes);
      String res = addr.addAadhaar(aadhaar);
      if(res=="success")
      {
    	  response.sendRedirect("success.html");
      }
     
	  System.out.println(res);
	  

    
	}

	
	
}
