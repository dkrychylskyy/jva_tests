package cfranc.com;

public class NumerationRomainApp {
	
	public String NumerationRomainReady(int nb) {
		switch (nb) {
		case 0:
			return "";
		case 1:
			return "I";
		case 5:
			return "V";
		case 10:
			return "X";
		case 50:
			return "L";
		case 100:
			return "C";
		case 500:
			return "D";
		case 1000:
			return "M";
		default:
			return null;
		}
	}
	
}