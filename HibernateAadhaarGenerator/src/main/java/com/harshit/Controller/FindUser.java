package com.harshit.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.harshit.DAO.AadhaarDAO;
import com.harshit.DAO.AadhaarDAOImp;
import com.harshit.model.AadhaarDetails;
/**
 * Servlet implementation class FindUser
 */
@WebServlet("/FindUser")
public class FindUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	long aadrno=Long.parseLong(request.getParameter("aadhaarnumber")) ;
	AadhaarDAO addr = new AadhaarDAOImp();
	AadhaarDetails aadhaar = new AadhaarDetails();
	
	aadhaar= addr.findById(aadrno);
	
	if(aadhaar!=null)
	{
		 HttpSession session = request.getSession();
	  	  session.setAttribute("aadhaar",aadhaar);
	  	  response.sendRedirect("Aadhaar.jsp");
	}
	else
	{
		response.sendRedirect("failure.jsp");
	}
	System.out.println(aadhaar.toString());
	
	}

	

}
