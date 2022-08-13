import java.util.Scanner;
class tri
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int a,b,c;
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     float s,area;
     s=(float)(a+b+c)/2;
     area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
     System.out.format("%.2f",area);
   }
}



