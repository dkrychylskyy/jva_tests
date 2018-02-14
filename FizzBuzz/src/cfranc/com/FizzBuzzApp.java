package cfranc.com;

public class FizzBuzzApp {
	
	public String fizzBuzzMessqge(int nb) {
		
		if ((nb % 3 == 0) && (nb % 5 == 0)) {
			return "Fizz, Buzz";	
		} else if (nb % 5 == 0) {
			return "Buzz";
		} else if (nb % 3 == 0) {
			return "Fizz";
		} else {
			return nb + "";
		}

	}
}
