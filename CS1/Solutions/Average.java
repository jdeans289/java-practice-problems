import java.util.*;
import java.io.*;

public class Average {
    public static void main (String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("averageJudge.dat"));
        int probs = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < probs; i++)
        {
            int sum = 0;
            sum += scan.nextInt();
            sum += scan.nextInt();
            sum += scan.nextInt();
            sum += scan.nextInt();
            double average = sum / 4.0;
            System.out.println(average);
        }
    }
}
