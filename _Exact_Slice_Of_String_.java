import java.util.Scanner;
public class Slice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int a,b;
        s=sc.nextLine();
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print(s.substring(a,b+1));
    }
}