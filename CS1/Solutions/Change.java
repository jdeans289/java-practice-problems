import java.util.Scanner;
import java.io.*;
public class Change{
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(new File("change.txt"));
    int tc, cost, paid;
    double change;
    tc = sc.nextInt();
    
    for(int i = 0; i < tc; i++){
        cost = sc.nextInt();
        paid = sc.nextInt();
        change = paid - cost;
        System.out.print("Change: ");
        System.out.printf("$%.2f%n", change);        
    }
    }
}
