import java.util.*;
class v {
    public static void main(String[] args) {
         Scanner x=new Scanner(System.in);
         System.out.print("enter the number");
         int n=x.nextInt();
         int r,sum=0;
         String s="",y="";
         while(n>0)
         {
             r=n%10;
             if(r%2==0)
             {
                 s=String.valueOf(r)+s;
             }
             else
             {
                 y=String.valueOf(r)+y;
             }
             n=n/10;
         }
         System.out.print(s+"  "+y);
         
    }
}