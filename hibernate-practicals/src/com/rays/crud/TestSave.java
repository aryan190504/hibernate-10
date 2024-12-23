package com.rays.crud;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.rays.user.UserDTO;

public class TestSave {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("aryan ");
		dto.setLastName("shrivastav");
		dto.setLoginId("aryan@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		session.close();

	}

}
