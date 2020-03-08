package com.mahima.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mahima.web.Dao.MahimaDao;
import com.mahima.web.model.Mahima;

/**
 * Servlet implementation class GetMahimaController
 */
public class GetMahimaController1 extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int aid = Integer.parseInt(request.getParameter("aid"));
		MahimaDao dao=new MahimaDao();
		Mahima m1=dao.getMahima(aid);
		
		request.setAttribute("Mahima", m1);
		
		RequestDispatcher rd=request.getRequestDispatcher("showMahima.jsp");
		rd.forward(request, response);
	}

	
}
