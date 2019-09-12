package com.ssi.FirstMVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class BookDAO {

	private Connection con;

	public void saveBook(Book book) {
		try {
			String sql = "insert into booksentry values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, book.getId());
			ps.setString(2, book.getB_name());
			ps.setString(3, book.getB_subject());
			ps.setInt(4, book.getB_price());
			ps.setString(5, book.getB_author());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Book searchBook(int code) {
		Book book = null;
		String sql = "SELECT * FROM booksentry WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, code);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				book = new Book();
				book.setId(rs.getInt(1));
				book.setB_name(rs.getString(2));
				book.setB_subject(rs.getString(3));
				book.setB_price(rs.getInt(4));
				book.setB_author(rs.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	public Book deleteBook(int code) {
		Book book = null;
		String sql = "DELETE  FROM booksentry WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, code);
			int x = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	public List<Book> getAllBooks() {
		return null;
	}

	public BookDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
