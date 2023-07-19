import java.util.Scanner;
public class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0,i,a;
        n=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a%k!=0)
            {
                c++;
            }
    }
    System.out.print(c);
    }
}