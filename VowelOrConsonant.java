
  
import java.util.Scanner;
class VowelOrConsonant{
      public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             char ch;
             System.out.print(" Enter a character : ");
             ch = sc.nextLine().charAt(0);
             switch( ch ){
                  case 'a' :
                       System.out.println( ch + " is a vowel ");
                       break;
                  case 'A' :
                       System.out.println( ch + " is a vowel ");
                       break;
                   case 'e' :
                       System.out.println( ch + " is a vowel ");
                       break;
                  case 'E' :
                       System.out.println( ch + " is a vowel ");
                       break;
                  case 'i' :
                       System.out.println( ch + " is a vowel ");
                       break;
                  case 'I' :
                       System.out.println( ch + " is a vowel ");
                       break;
                   case 'o' :
                       System.out.println( ch + " is a vowel ");
                       break;
                   case 'O' :
                       System.out.println( ch + " is a vowel ");
                       break;
                   case 'u' :
                       System.out.println( ch + " is a vowel ");
                       break;
                  case 'U' :
                       System.out.println( ch + " is a vowel ");
                       break;
                  default : 
                       System.out.println( ch + " is a consonant ");
              }
              
                       
       }
}
                       
      
