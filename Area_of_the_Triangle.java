import java.util.Scanner;
class Area
{
    public static void main(String args[])
{
    int a,b,c;
    double s,t,ar;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    t=a+b+c;
    s=t/2;
    ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.format("%.2f",ar);
    sc.close();
}
}