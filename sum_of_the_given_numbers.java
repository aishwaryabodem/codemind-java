 import java.util.Scanner;
 class sum
 {
     public static void main(String args[])
     {
         int t,n1,n2,sum;
         Scanner sc=new Scanner(System.in);
         t=sc.nextInt();
         while(t>0)
         {
             n1=sc.nextInt();
             n2=sc.nextInt();
             sum=n1+n2;
             System.out.println(sum);
         }
     }
 }