package InterviewQuestionScenarioBased.BandhanLife;

import java.util.Scanner;

public class ProductNameValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter your product name");
            String input = sc. next();
            boolean isValid = checkProductName(input);
            System.out.println(isValid);
            System.out.println("Press Yes to continue or No to exit. Yes/No? ");
            String choice = sc.next();
            if(!choice.equalsIgnoreCase("Yes")){
                System.out.println("Exiting application...");
                break;
            }
        }
        sc.close();

    }
    public static boolean checkProductName(String input){

        int len = input.length();

        if(input == null || len == 0)
            return false;

        if(!Character.isAlphabetic(input.charAt(0)))
            return false;

        if(!Character.isDigit(input.charAt(len - 1)))
            return false;

        int letterCount = 0;
        for(int i = 0; i <= len-1; i++){
            if(Character.isAlphabetic(input.charAt(i)))
                letterCount++;
            if(letterCount >= 3)
                return true;
        }

        return false;
    }
}
