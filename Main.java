import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Do you want to play a math quiz? (yes/no)");
        String answer = input.next();
        if (answer.equals("yes")){
            System.out.println("Player1");
            String name1 = Player.enterYourName();
            System.out.println("Player2");
            String name2 = Player.enterYourName();
            System.out.println(name1 + ", could you please answer to next 5 questions.");
            int totalScore1 = Player.playMyQuiz();
            System.out.println(name2 + ", could you please answer to next 5 questions.");
            int totalScore2 = Player.playMyQuiz();
            if (totalScore2 > totalScore1){
                System.out.println("There is a result of our math quiz:");
                System.out.println(name2 + ", you have reached " + totalScore2 + " points.");
                System.out.println(name1 + ", you have reached " + totalScore1 + " points.");
            } else {
                System.out.println("There is a result of our math quiz:");
                System.out.println(name1 + ", you have reached " + totalScore1 + " points.");
                System.out.println(name2 + ", you have reached " + totalScore2 + " points.");
            }

        } else if (answer.equals("no")){
            System.out.println("All right, than good bye!");
        } else {
            System.out.println("It's not very clear if want or not...");
        }


    }
}