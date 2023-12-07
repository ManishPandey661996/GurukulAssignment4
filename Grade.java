

import java.util.Scanner;
class Grade{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           char g ;
           System.out.print(" Enter the grade ");
           g= sc.nextLine().charAt(0);
           switch( g ) {
               case 'A' :
                  System.out.println(" A : "+ "4.0");
                  break;
               case 'B' :
                  System.out.println(" B : "+ "3.0");
                  break;
               case 'C' :
                  System.out.println(" C : "+ "2.0");
                  break;
               case 'D' :
                  System.out.println(" D : "+ "1.0");
                  break;
               case 'F' :
                  System.out.println(" F : "+ "0.0");
                  break;
               default  :
                  System.out.println(" Invalid Grade ");
          }
      }
}