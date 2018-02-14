package cfranc.com;

public class NumerationRomainApp {
	
	String base;
	
	public String NumerationRomainReady(int nb) {
		if (nb == 5) {
			return "V";
		}
		// Compter de 6 á 8
		if (nb >=5) {
			return roman_units("V", nb-5);
		}
		// Compter de 1 á 3
		return roman_units("", nb);
	}
	
	public String roman_units(String base, int nb) {
		StringBuilder sb = new StringBuilder(base);
		for (int i = 0; i < nb; i++) {
			sb.append("I");
		}
		String result = sb.toString();
		return result;
		
	}

}