public class GuessingGame {

    public static void main(String[] args) {

        int secretNumber = 7;
        int guess =7;

        if(guess == secretNumber){
            System.out.println("The guess is correct");
        } else if (guess > secretNumber) {
            System.out.println("The guess is too high");
        } else {
            System.out.println(guess < secretNumber);{
                System.out.println("The guess is too low");
            }
        }

    }

}

