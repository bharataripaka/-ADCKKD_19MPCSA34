

import java.util.Scanner;
public class rev
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Intial Value:");
        int n = sc.nextInt();
           System.out.println("Enter Range Value:");
        int m = sc.nextInt();
         int i = n;
        while(i>=m){
               System.out.println(i);
               i=i-2;

        }
		
	}
}
OUTPUT:
Enter Intial Value: 50
Enter Range Value: 40
  50
  48
  46
  44
  42
  40
