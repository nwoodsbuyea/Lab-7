
import java.util.Scanner;


public class BankInsurance {
   public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = keyboard.nextInt();

        try { double lifeInsuranceCost = calculateLifeInsurance(age);
        
            System.out.println("Your estimate is " + lifeInsuranceCost);
        
        } catch (InvalidAgeException ex) {
            
            System.out.println("Invalid age enetered.");
        }
    }
    
    public static double calculateLifeInsurance(int age) throws InvalidAgeException{
        if (age > 4 && age < 111 ) {
            double insuranceCost = (5 * age) + 300;
            return insuranceCost;  
        } else {
            throw new InvalidAgeException("Invalid age.");
        }
        
    }
} 
