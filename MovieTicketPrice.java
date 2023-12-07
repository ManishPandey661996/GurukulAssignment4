

import java.util.Scanner;
class MovieTicketPrice{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int age,time;
            double ticketPrice =0.0;
            System.out.print(" Enter the age : ");
            age= sc.nextInt();
            System.out.print(" Enter the time : ");
            time= sc.nextInt();
            if ( age <= 12 ) {
                  ticketPrice = 5.00  ;
            } else if ( age >= 12 && age < 60) {
                  ticketPrice = 10.00  ;
            } else {
                  ticketPrice = 7.50  ;
            }
            if ( time > 15 && time < 18 ){
                  ticketPrice = ticketPrice - 2.00;
            }
            if ( time > 18 ){
                  ticketPrice = ticketPrice - 3.00;
            }
            System.out.println(" Final ticket price : " + ticketPrice );
      }
}
            