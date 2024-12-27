
import java.util.Scanner;


public class PhoneNumber {

  
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
         System.out.println("please Enter a phoneNumber");
         String number = input.nextLine();
         if (number.length() != 10){
             System.out.println("the Number is wrong");
         }if (number.length()==10){
             System.out.println("the Number is correct");
         }if(number.startsWith("079")|| number.startsWith("072")){
             System.out.println("this is a ROSHAN number");
         }else if (number.startsWith("070")|| number.startsWith("071")){
             System.out.println("this is an AWCC number");
         }else if (number.startsWith("078")|| number.startsWith("073")){
             System.out.println("this is an ETISALAT nubmer");
         } else if (number.startsWith("074")){
             System.out.println("this is a SALAAM number");
         }else if (number.startsWith("076")|| number.startsWith("077")){
             System.out.println("this is a MTN number");
         }else if (number.startsWith("075") ){
             System.out.println("this Number is not found in system");
         }
        
         
             
         
    }
    
}
