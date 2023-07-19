import java.util.Scanner;
public class Disk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.printf("%d",a*b*c*1024);
    }
}