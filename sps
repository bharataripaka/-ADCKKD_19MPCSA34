import java.util.*;
class Solution
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(subtractProductAndSum(n));
    }
    static int subtractProductAndSum(int n)
    {
        int product = 1 , sum = 0;
        while(n > 0)
        {
            
            product *= (n % 10);
            sum += (n % 10);
            n /= 10;
        }
        return product - sum;
    }
}
