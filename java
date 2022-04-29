import java.util.*
public class Reversestring   
{    
    public static void main(String[] args) {    
        String string = "swamy srinivas";    
        String reversedStr = "";     
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    

        System.out.println("Original string: " + string);      
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}    
 Java-cp /tmp/YcnTmTfUep Reversestring
Original string: swamy srinivas
Reverse of given string: savinirs ymaws
