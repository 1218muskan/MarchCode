import java.util.Scanner;
public class DayTwentySix
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        System.out.print(x+" "+y);
        System.out.println();
        swap(x,y);
    }
    static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.print(a+" "+b);
        System.out.println();
    }
} 
