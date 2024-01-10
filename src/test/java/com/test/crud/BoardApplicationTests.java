package com.test.crud;

import com.test.crud.model.User;
import com.test.crud.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.DriverManager;

@WebAppConfiguration
@SpringBootTest
class BoardApplicationTests {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:5252/userdb";
	private static final String USER = "root";
	private static final String PASSWORD = "12345678";

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testConnection() throws Exception {
		// DBMS에게 DB 연결 드라이버의 위치를 알려주기 위한 메소드
		Class.forName(DRIVER);
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Transactional
	@Rollback
	@DisplayName("mybatis 회원가입 테스트")
	public void memberSaveTest1() {
		userRepository.save(new User(5, "mybatis회원비밀번호", 10));
	}
}
