import java.util.Scanner;
import java.text.NumberFormat;

public class monthlyCharge
{
   public static void main (String[] args)
   {
           double previousBalance;   
           double additionalCharges;               
           double interest;          
           double newBalance;             
           double minimumPayment =0;
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter any additional charges: ");
           additionalCharges = scan.nextDouble();
 
           if (previousBalance==0){
               interest=0;
            }
           else{
               interest= 0.02*(previousBalance+additionalCharges);
            }
           newBalance=(interest+previousBalance+additionalCharges);
           if (newBalance<50){
               minimumPayment=newBalance;
            }
           else if((newBalance>=50)&&(newBalance<=300)){
               minimumPayment=50;
            }
           else if(newBalance>300){
               minimumPayment=(0.02*newBalance);
            }
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Previous Balance:           " + money.format(previousBalance));
           System.out.println("Additional Charges: " + money.format(additionalCharges));
           System.out.println("Interest:          " + money.format(interest));
           System.out.println("New Balance:          " + money.format(newBalance));
           System.out.println("Minimum Payment:          " + money.format(minimumPayment));
           System.out.println();
        }
}