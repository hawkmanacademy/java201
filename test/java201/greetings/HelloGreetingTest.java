package java201.greetings;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloGreetingTest {

	private HelloGreeting hello;
	
	@Before
	public void setUp() throws Exception {
		hello = new HelloGreeting();
	}

	@Test
	public void test() {
		String expectedResult = "Hello, TDD!";
		String actualResult = hello.sayHello();
		
		assertEquals(expectedResult,actualResult);
	}
	
	@After
	public void teardown(){
		hello = null;
	}

}
