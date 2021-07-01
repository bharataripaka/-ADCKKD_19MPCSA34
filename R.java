import java.util.*;
 class R { 
     public static void main(String[] args) {
		  System.out.println("enter a input..");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 65;
        for(int i = 0;i<=n-1;i++){
            int x = i;
          for(int j =0;j<=i;j++){
            System.out.print((char)(a+x)+" ");
            x +=1;
        }
    System.out.println();    
      } 
      sc.close(); 
        }  
    }