import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,M,min,gcd=0;
        N=sc.nextInt();
        M=sc.nextInt();
       
        if(N<M)
          min=N;
        else
          min=M;

       for(int i=min;i>0;i--)
        {
              if(N%i==0 && M%i==0)
               {
                  gcd=i;
                  break;
                }
        }
        System.out.println(gcd);
        sc.close();        
    }
}
