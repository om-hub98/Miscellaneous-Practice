package DataStructure.String;

public class PalindromeNumber {
    public static void main(String[] args) {
        //int x=252;
        //String str = new String(String.valueOf(x));
        String str = "MOM";
        System.out.println(str);
        int len = str.length()-1;
        boolean flag=true;
        for(int i=0; i<=len/2; i++){
            if(str.charAt(i)==(str.charAt(len-i))){
                flag=true;
            }else{
                flag=false;
                break;
            }
        }
        if(flag==false) System.out.println("Not Palindrome");
        else System.out.println("It's a Palindrome");
    }
}
