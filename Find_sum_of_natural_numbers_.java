import java.util.Scanner;
public class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.printf("%d",n*(n+1)/2);
    }
}