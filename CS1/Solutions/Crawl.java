import java.util.*;
import java.io.*;

public class Crawl {
    public static void main (String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("crawl.dat"));
        while(scan.hasNext())
        {
            System.out.println(scan.nextLine());
        }
    }
}