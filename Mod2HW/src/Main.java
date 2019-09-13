import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int winningNum = (int)(Math.random() * 1000);
        int lotteryNum;
        int digit1;
        int digit2;
        int digit3;
        int winDig1;
        int winDig2;
        int winDig3;

        while (winningNum < 100) {
            winningNum = (int)(Math.random() * 1000);
        }

        System.out.println("Enter a 3-digit lottery number: ");
        lotteryNum = in.nextInt();
        digit1 = lotteryNum/100;
        digit2 = (lotteryNum % 100)/10;
        digit3 = lotteryNum % 10;

        winDig1 = winningNum/100;
        winDig2 = (winningNum % 100)/10;
        winDig3 = winningNum % 10;


        if (lotteryNum == winningNum){
            System.out.println("The winning number is '" + winningNum + "'. You won $10,000!");
        }
        else if ((winDig1 == digit1 || winDig1 == digit2 || winDig1 == digit3)
                && (winDig2 == digit1 || winDig2 == digit2 || winDig2 == digit3)
                && (winDig3 == digit1 || winDig3 == digit2 || winDig3 == digit3)){
            System.out.println("The winning number is '" + winningNum + "'. You won $3,000!");
        }
        else if ((winDig1 == digit1 || winDig1 == digit2 || winDig1 == digit3)
                || (winDig2 == digit1 || winDig2 == digit2 || winDig2 == digit3)
                || (winDig3 == digit1 || winDig3 == digit2 || winDig3 == digit3)){
            System.out.println("The winning number is '" + winningNum + "'. You won $1,000!");
        }
        else {
            System.out.println("The winning number is '" + winningNum + "'. Try again!");
        }

    }
}
