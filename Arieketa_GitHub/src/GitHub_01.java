
public class GitHub_01 {

	public static void main(String[] args) {
	        // Fahrenheit-etik Celsius-era konbertitu
	        double[] celsiusak = {0, 17, 20};
	        System.out.println("Fahrenheit-etik Celsius-era konbertitzen:");
	        for (double fahrenheit : celsiusak) {
	            double celsius = celsiusToFahrenheit(fahrenheit);
	            System.out.println(fahrenheit + " Celsius = " + celsius + " Fahrenheit");
	        }

	        // Celsius-etik Fahrenheit-era konbertitu
	        double[] Fahrenheit = {0, 40, 70};
	        System.out.println("Celsius-etik Fahrenheit-era konbertitzen:");
	        for (double celsius : Fahrenheit) {
	            double fahrenheit = fahrenheitToCelsius(celsius);
	            System.out.println(celsius + " Fahrenheit = " + fahrenheit + " Celsius");
	        }
	    }

	    // Fahrenheit-etik Celsius-era konbertitzeko metodoa
	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) / 1.8;
	    }

	    // Celsius-etik Fahrenheit-era konbertitzeko metodoa
	    public static double celsiusToFahrenheit(double celsius) {
	        return 1.8 * celsius + 32;
	    }
	}