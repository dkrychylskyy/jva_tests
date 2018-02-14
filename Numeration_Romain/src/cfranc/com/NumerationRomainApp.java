package cfranc.com;

public class NumerationRomainApp {
	
	String base;
	
	public String NumerationRomainReady(int nb) {
		if (nb == 5) {
			return "V";
		}
		if (nb == 4) {
			return "IV";
		}
		if (nb == 9) {
			return "IX";
		}
		// Compter de 10 á 30
		if (nb >=9) {
			return roman_units(nb/10, "X");
		}
		// Compter de 6 á 8
		if (nb >=5) {
			return "V"+ roman_units(nb-5, "I");
		}
		// Compter de 1 á 3
		return roman_units(nb, "I");
	}
	
	public String roman_units(int nb, String symbol) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < nb; i++) {
			sb.append(symbol);
		}
		String result = sb.toString();
		return result;
		
	}

}