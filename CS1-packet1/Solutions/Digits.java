import java.util.*;
import java.io.*;

public class Digits {
    public static void main (String[] args) throws Exception
    {
        Scanner scan = new Scanner (new File ("digits.in"));
        int probs = scan.nextInt();
        for (int i = 0; i < probs; i++)
        {
            String str = scan.next();
            
            if (str.charAt(0) == '-')
                str = str.substring(1);
            
            System.out.println(str.length());
        }
    }
}
