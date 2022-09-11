import java.util.Scanner;
class LCM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max,Icm;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>=b)
        max=a;
        else
        max=b;
        for(int i=max;;i++)
        {
            if(i%a==0&&i%b==0)
            {
                Icm=i;
                break;
            }
        }
        System.out.println(Icm);
        sc.close();
    }
}