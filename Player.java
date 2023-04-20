import java.util.Random;
import java.util.Scanner;

public class Player {

    public static String enterYourName (){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name:");
        String name = input.next();
        return name;
    }
    public static int playMyQuiz (){
        int score = 0;
        for (int i=0; i<5; i++) {
            Random random = new Random();
            int mathRandomNumber = random.nextInt(4);
            if (mathRandomNumber == 0){
                char writeOrWrong = Plus.add();
                switch (writeOrWrong){
                    case '+':
                        score = score + 5;
                        break;
                    case '-':
                        score = score - 5;
                        break;

                }
            }
            else if (mathRandomNumber == 1){
                char writeOrWrong = Minus.substract();
                switch (writeOrWrong){
                    case '+':
                        score = score + 5;
                        break;
                    case '-':
                        score = score - 5;
                        break;

                }
            }
            else if (mathRandomNumber == 2){
                char writeOrWrong = Increase.substract();
                switch (writeOrWrong){
                    case '+':
                        score = score + 5;
                        break;
                    case '-':
                        score = score - 5;
                        break;

                }
            }
            else if (mathRandomNumber == 3){
                char writeOrWrong = Division.substract();
                switch (writeOrWrong){
                    case '+':
                        score = score + 5;
                        break;
                    case '-':
                        score = score - 5;
                        break;

                }
            }

        }
        return score;
    }
}