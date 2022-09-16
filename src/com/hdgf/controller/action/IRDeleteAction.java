package com.hdgf.controller.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hdgf.dao.IR_Center_DAO;


public class IRDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String url = "HdgfServlet?command=notice";
		
		int IR_Id = Integer.parseInt(request.getParameter("id"));
		IR_Center_DAO IRDAO = IR_Center_DAO.getInstance();
		IRDAO.delete(IR_Id);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}