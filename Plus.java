import java.util.Random;
import java.util.Scanner;

public class Plus {
    public static char add (){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int number3 = number1 + number2;
        System.out.println("Please calculate the result of the following expression:");
        System.out.println(number1 + " + " + number2 + " = ?");
        int result = input.nextInt();
        if (number3 == result){
            System.out.println("Well done!");
            return '+';
        } else {
            System.out.println("Unfortunately you are wrong! The right answer is" + number3 );
            return '-';
        }
    }
}
