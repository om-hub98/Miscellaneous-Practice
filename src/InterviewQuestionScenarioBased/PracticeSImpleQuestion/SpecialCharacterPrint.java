package InterviewQuestionScenarioBased.PracticeSImpleQuestion;

public class SpecialCharacterPrint {
    public static void main(String[] args) {
         String input = "Omraj@123#$%";
         int count=0;
         String str ="";
         char[] chararr=input.toCharArray();
         for(char ch : chararr){
             if(Character.isDigit(ch) || Character.isAlphabetic(ch) || Character.isWhitespace(ch)){
                 str+=ch;
             }
         }
        System.out.print("New String : "+str);
    }
}
