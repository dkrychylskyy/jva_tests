package cfranc.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumerationRomainAppTest {

	NumerationRomainApp app = new NumerationRomainApp();

	// Cycle 1: nombres 1 à 3
	@Test
	public void testNumerationRomainReady1_I() {
		String expected = "I";
		String actual = app.NumerationRomainReady(1);
		assertEquals(expected, actual);
	}

	@Test
	public void testNumerationRomainReady2_II() {
		String expected = "II";
		String actual = app.NumerationRomainReady(2);
		assertEquals(expected, actual);
	}

	@Test
	public void testNumerationRomainReady3_III() {
		String expected = "III";
		String actual = app.NumerationRomainReady(3);
		assertEquals(expected, actual);
	}

	// Cycle 2: le nombre 5

	@Test
	public void testNumerationRomainReady5_V() {
		String expected = "V";
		String actual = app.NumerationRomainReady(5);
		assertEquals(expected, actual);
	}

	// Cycle 3: 6 à 8
	@Test
	public void testNumerationRomainReady6_VI() {
		String expected = "VI";
		String actual = app.NumerationRomainReady(6);
		assertEquals(expected, actual);
	}

	@Test
	public void testNumerationRomainReady7_VII() {
		String expected = "VII";
		String actual = app.NumerationRomainReady(7);
		assertEquals(expected, actual);
	}

	@Test
	public void testNumerationRomainReady8_VIII() {
		String expected = "VIII";
		String actual = app.NumerationRomainReady(8);
		assertEquals(expected, actual);
	}

	// Cycle 4: le nombre 4
	@Test
	public void testNumerationRomainReady4_IV() {
		String expected = "IV";
		String actual = app.NumerationRomainReady(4);
		assertEquals(expected, actual);
	}

	// Cycle 5: le nombre 9
	@Test
	public void testNumerationRomainReady9_IX() {
		String expected = "IX";
		String actual = app.NumerationRomainReady(9);
		assertEquals(expected, actual);
	}

	// Cycle 6: nombres 10, 20 et 30
	@Test
	public void testNumerationRomainReady10_X() {
		String expected = "X";
		String actual = app.NumerationRomainReady(10);
		assertEquals(expected, actual);
	}

	@Test
	public void testNumerationRomainReady20_XX() {
		String expected = "XX";
		String actual = app.NumerationRomainReady(20);
		assertEquals(expected, actual);
	}

	@Test
	public void testNumerationRomainReady30_XXX() {
		String expected = "XXX";
		String actual = app.NumerationRomainReady(30);
		assertEquals(expected, actual);
	}

	// @Test
	// public void testNumerationRomainReady50_L() {
	// String expected = "L";
	// String actual = app.NumerationRomainReady(50);
	// assertEquals(expected, actual);
	// }
	//
	// @Test
	// public void testNumerationRomainReady100_C() {
	// String expected = "C";
	// String actual = app.NumerationRomainReady(100);
	// assertEquals(expected, actual);
	// }
	//
	// @Test
	// public void testNumerationRomainReady500_D() {
	// String expected = "D";
	// String actual = app.NumerationRomainReady(500);
	// assertEquals(expected, actual);
	// }
	//
	// @Test
	// public void testNumerationRomainReady1000_M() {
	// String expected = "M";
	// String actual = app.NumerationRomainReady(1000);
	// assertEquals(expected, actual);
	// }
	//
	//// Cycle 8: zéro
	// @Test
	// public void testNumerationRomainReadyZero_ChaineVide() {
	// String expected = "";
	// String actual = app.NumerationRomainReady(0);
	// assertEquals(expected, actual);
	// }

}
