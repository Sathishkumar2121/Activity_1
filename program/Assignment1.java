import java.util.*;
import java.io.*;
 class Assignment1
 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sc.close();
       String[] nameArray = s1.split(" ");
       String[] nameArray1 = s2.split(" ");
       String name=nameArray[1];
       String name2=nameArray1[1];
       if(name.equals(name2))
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}

