package com.ssi.FirstMVC;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/AddBookController")
public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// reads the request
		int book_Id = Integer.parseInt(request.getParameter("bookid"));
		String bookName = request.getParameter("bookname");
		String bookSubject = request.getParameter("booksubject");
		int bookPrice = Integer.parseInt(request.getParameter("bookprice"));
		String bookAuthor = request.getParameter("bookauthor");

		// process it using dao/service classes
		BookDAO dao = new BookDAO();
		Book book = new Book();
		book.setId(book_Id);
		book.setB_name(bookName);
		book.setB_subject(bookSubject);
		book.setB_price(bookPrice);
		book.setB_author(bookAuthor);

		HttpSession session = request.getSession();
		session.setAttribute("showbook", book);
		dao.saveBook(book);
		book = dao.searchBook(book_Id);

		// forwards the request to view
		RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
		rd.forward(request, response);

	}
}
