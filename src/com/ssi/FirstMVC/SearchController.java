package com.ssi.FirstMVC;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SearchController")
public class SearchController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// reads the request
		int bookId = Integer.parseInt(request.getParameter("bookId"));

		// process it using dao/service classes
		BookDAO dao = new BookDAO();
		Book book = dao.searchBook(bookId);

		// store the model in scope object
		HttpSession session = request.getSession();
		session.setAttribute("bookinfo", book);

		// forwards the request to view
		RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);

	}

}
