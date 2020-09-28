package com.training.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FooterServlet
 */

@WebServlet(urlPatterns="/footer",initParams= {@WebInitParam(name = "adminId", value = "admin@abc.com")})

public class FooterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FooterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
					
		boolean admin=request.getParameter("admin")!=null;
		boolean designer=request.getParameter("designer")!=null;
		
		if(admin)
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("/admin.jsp");
			dispatch.forward(request, response);
			System.out.println(getInitParameter("adminId"));
		}
		else if(designer)
		{
			request.setAttribute("designerName", "Paragon");
			RequestDispatcher dispatch=request.getRequestDispatcher("designer.jsp");
			dispatch.forward(request, response);
		}
		
		
		
		doGet(request, response);
	}

}
