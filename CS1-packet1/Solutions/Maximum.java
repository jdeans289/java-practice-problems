import java.io.*;
import java.util.Scanner;

public class Maximum {
    public static void main (String[] args) throws Exception
    {
        Scanner scan = new Scanner (new File("maximum.in"));
        
        int max = 0;
        int curr;
        while (scan.hasNextInt())
        {
            curr = scan.nextInt();
            max = Math.max(curr, max);
        }
        System.out.println(max);
    }
}
