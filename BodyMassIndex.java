

import java.util.Scanner;
class BodyMassIndex{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            double weight , height,BMI;
            System.out.print(" Enter your weight : ");
            weight = sc.nextDouble();
            System.out.print(" Enter your height : ");
            height = sc.nextDouble();
            BMI = weight / (Math.pow(height,2));
            
            if(BMI < 18.5){
                  System.out.print(" You are underweight ");
            } else if ( BMI >= 18.5 && BMI <=24.9 ) {
                  System.out.print(" You are normal ");
            } else if ( BMI >= 25 && BMI <= 29.9 ) {
                  System.out.print(" You are overweight ");
            } else {
                  System.out.print(" You are obese ");
            }
     }
}
            