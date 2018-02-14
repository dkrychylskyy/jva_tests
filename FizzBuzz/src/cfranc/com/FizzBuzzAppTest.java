package cfranc.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzAppTest {

	FizzBuzzApp app = new FizzBuzzApp();
	
	@Test
	void testFizzBuzzMessqge1_1() {
		String expected = "1";
		String actual = app.fizzBuzzMessqge(1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFizzBuzzMessqge3_Fizz() {
		String expected = "Fizz";
		String actual = app.fizzBuzzMessqge(3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFizzBuzzMessqge5_Buzz() {
		String expected = "Buzz";
		String actual = app.fizzBuzzMessqge(5);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFizzBuzzMessqge15_FizzBuzz() {
		String expected = "Fizz, Buzz";
		String actual = app.fizzBuzzMessqge(15);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFizzBuzzMessqge100_Buzz() {
		String expected = "Buzz";
		String actual = app.fizzBuzzMessqge(100);
		assertEquals(expected, actual);
	}

}
