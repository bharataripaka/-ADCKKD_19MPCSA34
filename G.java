import java.util.*;
 class G { 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a input..");
        int n = sc.nextInt();
        for(int i = 0;i<=n-1;i++){
          for(int j =0;j<=i;j++){
            System.out.print("*"+" ");
        }
    System.out.println();    
      } 
      for(int i = n-2;i>=0;i--){
        for(int j =0;j<=i;j++){
          System.out.print("*"+" ");
      }
  System.out.println();
        
    } 
      sc.close(); 
        }  
    }
    