package me.shinsunyoung;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleTest {
	
	@BeforeAll // 전체 테스를 시작하기 전에 1회 실행 하므로 메서드는 static 선언
	static void beforeAll() {
		System.out.println("@BeforAll");
	}
	
	@BeforeEach //  테스트 케이스를 시작하기 전마다 실행
	public void beforeEach() {
		System.out.println("@BeforeEach");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	@AfterAll // 전체 테스를 마치고 종료하기 전에 1회 실행되므로 메서드는 static 선언
	static void afterAll() {
		System.out.println("@AfterAll");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("@AfterEach");
	}
	
}
