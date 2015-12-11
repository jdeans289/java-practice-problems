<<<<<<< HEAD
import java.io.*;
import java.util.Scanner;
public class Dragons {
    public static void main (String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("dragons.in"));
            while(scan.hasNext())
            {
                System.out.println(scan.nextLine());
            }
    }
=======
import java.util.*;
import java.io.*;

public class Dragons
{
	public static void main (String[] args) throws Exception
	{
		Scanner scan = new Scanner (new File ("dragons.in"));
		while (scan.hasNext())
		{
			System.out.println(scan.nextLine());
		}
	}
>>>>>>> 209944ceb8f0116c3183751e6ea75dcdebacbcd1
}
