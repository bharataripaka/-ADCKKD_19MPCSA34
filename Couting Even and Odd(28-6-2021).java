

import java.util.Scanner;
public class OandE
{
    public static void main(String[] args) {
        System.out.println("enter a number...");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even=0;int odd=0;
        while(n > 0){
int rem = n%10;
if(rem%2==0){
    even++;
}
else{
    odd++;
}
n = n/10;
        }
System.out.println("No of Even numbers:"+even);
System.out.println("No of Odd numbers:"+odd);	
	}
}

OUTPUT :
enter a number..
56881
No of Even numbers:3
No of Odd numbers: 2