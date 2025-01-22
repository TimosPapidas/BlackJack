import java.util.Scanner;

public class Main{
    public static void main(){

        System.out.println("Welcome to Blackjack!");
        while(true){
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("To start playing, enter 'Play'\n");
            System.out.println("To see a list of available commands, enter 'Help'\n");
            String input = inputScanner.nextLine();
            switch (input) {
                case "Play":
                        
                    break;
            
                default:
                    break;
            }
            continue;
        }
    }
}