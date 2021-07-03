import java.util.Scanner;
 
public class A
 {
 
    public static void main(String args[]){
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
 
        int c=0, sqr = num*num;
        int t =num; 
 
        
        while(t>0)
		{
            c++;
            t=t/10;
        }
 
        int a = (int) (sqr%(Math.pow(10,c)));
 
        if(num == a)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
    }
}