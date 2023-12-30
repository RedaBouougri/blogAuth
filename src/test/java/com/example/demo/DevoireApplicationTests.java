package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.security.springjwt.models.User;
import com.example.demo.security.springjwt.repository.UserRepository;
import com.example.demo.security.springjwt.security.jwt.services.UserService;

@SpringBootTest
class DevoireApplicationTests {

	@Test
	void contextLoads() {
	}


	
}
