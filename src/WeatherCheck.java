public class WeatherCheck {

    public static void main(String[] args) {

        int temperature = 17; // Example temperature value
        boolean currentlyRaining = false; //Example weather condition

        if (temperature >20 && !currentlyRaining){
            System.out.println("It is warm and not raining. Wear shorts and sunscreen.");
        } else if (temperature <=20 && currentlyRaining) {
            System.out.println("It is cold and raining. Wear a waterproof coat.");
        } else if (temperature > 20 && currentlyRaining) {
            System.out.println("It is warm but raining. Wear appropriate clothes.");
        } else if (temperature <20 && !currentlyRaining) {
            System.out.println("It is cold but not raining. Wear appropriate clothes.");
        } else {
            System.out.println("Wear appropriate clothing for the current weather conditions.");
        }

    }
}
