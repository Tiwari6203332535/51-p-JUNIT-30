package com.demo.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyfirstprojectApplicationTests {

	@Test
	void test1() {
		System.out.println("from test1");
	}

	@Test
	void test2() {
		System.out.println("from test2");
	}

	@BeforeEach
	void befortest() {
		System.out.println("before each test");
	}

	@AfterEach
	void aftertest() {
		System.out.println("after each test");
	}

	@BeforeAll
	static void beforalltest() {
		System.out.println("before all test");
	}

	@AfterAll
	static void Afteralltest() {
		System.out.println("After all test");
	}

}
