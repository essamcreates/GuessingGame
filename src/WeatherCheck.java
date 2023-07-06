public class WeatherCheck {

    public static void main(String[] args) {

        int temperature = 18; // Example temperature value
        boolean currentlyRaining = true; //Example weather condition

        if (temperature > 20 && !currentlyRaining){
            System.out.println("Wear shorts and suncreen.");
        } else if (temperature < 20 && currentlyRaining) {
            System.out.println("Wear a waterproof coat.");
        } else {
            System.out.println("Wear appropriate clothing for the current weather conditions.");
        }

    }
}
