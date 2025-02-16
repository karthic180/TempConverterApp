public class TemperatureConverter {

    public static void main(String[] args) {
        // Hardcoded values for testing the conversion
        double celsius = 25.0;  // Example Celsius value
        double fahrenheit = 77.0;  // Example Fahrenheit value

        // Convert from Celsius to Fahrenheit
        double fahrenheitResult = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        // Convert from Fahrenheit to Celsius
        double celsiusResult = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
