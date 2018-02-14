package cfranc.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumerationRomainAppTest {

	NumerationRomainApp app = new NumerationRomainApp();
	
	@Test
	public void testNumerationRomainReadyZero_ChaineVide() {
		String expected = "";
		String actual = app.NumerationRomainReady(0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumerationRomainReady1_I() {
		String expected = "I";
		String actual = app.NumerationRomainReady(1);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumerationRomainReady5_V() {
		String expected = "V";
		String actual = app.NumerationRomainReady(5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumerationRomainReady10_X() {
		String expected = "X";
		String actual = app.NumerationRomainReady(10);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumerationRomainReady50_L() {
		String expected = "L";
		String actual = app.NumerationRomainReady(50);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumerationRomainReady100_C() {
		String expected = "C";
		String actual = app.NumerationRomainReady(100);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumerationRomainReady500_D() {
		String expected = "D";
		String actual = app.NumerationRomainReady(500);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumerationRomainReady1000_M() {
		String expected = "M";
		String actual = app.NumerationRomainReady(1000);
		assertEquals(expected, actual);
	}

}
