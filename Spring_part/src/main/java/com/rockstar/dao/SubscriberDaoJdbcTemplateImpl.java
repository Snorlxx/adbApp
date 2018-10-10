package com.rockstar.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rockstar.model.SubscriberInfo;

@Repository
public class SubscriberDaoJdbcTemplateImpl implements SubscriberDao {

	private JdbcTemplate jdbctemplate;
	
	@Autowired
	public SubscriberDaoJdbcTemplateImpl(DataSource datasource){
		this.jdbctemplate=new JdbcTemplate(datasource);
	}
	
	/*@Override
	public Book addBook(Book book) {
		int count=jdbctemplate.update(IQueryMapper.INS_BOOK_QRY,
				book.getBcode(),
				book.getTitle(),
				book.getPrice(),
				book.getCategory(),
				book.getType());
		
		if(count<1){
			book=null;
		}
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		int count=jdbctemplate.update(IQueryMapper.UPDATE_BOOK_QRY,
				book.getTitle(),
				book.getPrice(),
				book.getCategory(),
				book.getType(),
				book.getBcode());
		
		if(count<1){
			book=null;
		}
		return book;
	}

	@Override
	public Book getBookById(int bcode) {
		List <Book> books=jdbctemplate.query(
				IQueryMapper.GET_BOOK_QRY,
				new Object[]{bcode}, new BookRowMapper());
		Book book=null;
		
		if(books!=null && books.size()==1){
			book=books.get(0);
		}
		return book;
	}

	@Override
	public boolean deleteBookById(int bcode) {
		boolean isDeleted=false;
		
		int count=jdbctemplate.update(IQueryMapper.DEL_BOOK_QRY,bcode);
				
		if(count>=1){
			isDeleted=true;
		}
		return isDeleted;
	}

	@Override
	public List<Book> getAllBooks() {
		List <Book> books=jdbctemplate.query(
				IQueryMapper.GET_ALL_BOOKS_QRY,
				 new BookRowMapper());
		
		return books;
	}*/

	@Override
	public SubscriberInfo addSubscriberInfo(SubscriberInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriberInfo updateSubscriberInfo(SubscriberInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubscriberInfo getSubscriberInfoByRmn(int rmn) {
		List <SubscriberInfo> subscribers=jdbctemplate.query(
				IQueryMapper.GET_SUBSCRIBER_QRY,
				new Object[]{rmn}, new SubscriberInfoRowMapper());
		SubscriberInfo subscriber=null;
		
		if(subscribers!=null && subscribers.size()==1){
			subscriber=subscribers.get(0);
		}
		return subscriber;
	}

	@Override
	public boolean deleteSubscriberInfoByRmn(int rmn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SubscriberInfo> getAllSubscriberInfos() {
		// TODO Auto-generated method stub
		return null;
	}

}
