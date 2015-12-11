import java.util.Scanner;
import java.io.*;
public class exactChange{
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(new File("exchange.txt"));
    int tc = sc.nextInt();
    double cost, paid, change;
    double dollar, quarter, dime, nickel, penny;
    
    for(int i = 0; i < tc; i++){
        cost = sc.nextDouble();
        paid = sc.nextDouble();
        change = paid - cost;
        System.out.println("+-----------------------+");
        System.out.print("| Change:\t");
        System.out.printf("$%.2f", change);
        System.out.println("\t|");
        
        dollar = (int)change;
        System.out.println("| Dollars:\t" + (int)dollar + "\t|");        
        change = change - dollar;
        
        quarter = change/.25;
        System.out.println("| Quarters:\t" + (int)quarter +"\t|"); 
        change = change - ((int)quarter*.25);
        
        
        dime = change/.10;
        change = change -((int)dime*.10);
        System.out.println("| Dimes:\t" + (int)dime +"\t|");
        
        nickel = change/.05;
        change = change -((int)nickel*.05);
        System.out.println("| Nickels:\t" + (int)nickel +"\t|");
        
        penny = change/.01;
        change = change -((int)penny*.01);
        System.out.println("| Pennies:\t" + (int)penny +"\t|");
        System.out.println("+-----------------------+");
        System.out.println();
    }
    }
}
