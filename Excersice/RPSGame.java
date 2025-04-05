import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        // System.out.println("Computer Input "+comInput);

        byte user = 0;
        byte com = 0;
        byte round = 1;
        while (round <= 5) {

            System.out.println("Choose your choice : Rok = 1, Paper =2, sizer =3");
            byte userInput = sc.nextByte();
            int comInput = rand.nextInt(3) + 1;

            if (userInput == comInput) {
                System.out.println("Tie");
                round++;
            } else {
                switch (userInput) {
                    case 1:
                        if (comInput == 2) {
                            System.out.println("Lose");
                            com++;
                            round++;
                        } else {
                            System.out.println("Won!");
                            user++;
                            round++;
                        }
                        break;
                    case 2:
                        if (comInput == 1) {
                            System.out.println("Won");
                            user++;
                            round++;
                        } else {
                            System.out.println("Lose!");
                            com++;
                            round++;
                        }
                        break;
                    case 3:
                        if (comInput == 2) {
                            System.out.println("Won");
                            user++;
                            round++;
                        } else {
                            System.out.println("Lose!");
                            com++;
                            round++;
                        }
                        break;

                    default:
                        System.out.println("Invalid Input .");
                        break;
                }
            }
        }
        if (com == user) {
            System.out.println("serise Tie");
        } else if (com > user) {
            System.out.println("Computer won!" + com);
        } else {
            System.out.println("User won : " + user);
        }

    }
}
