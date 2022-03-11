import java.util.*;
import java.io.*;
 class Assignment
 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        sc.close();
       String[] nameArray = s1.split(" ");
       String name=nameArray[0];
       String lastName = s1.substring(s1.indexOf(" ") + 1).toUpperCase();
        String n=name.substring(0, 1).toUpperCase();
        String s3=n+name.substring(1);
      String s4=s3+" "+lastName;
        System.out.println(s4);
    }
}
