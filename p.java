import java.util.*;
class  P {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a input..");
    int n = sc.nextInt();
    for(int i = n-1;i>=0;i--){
      for(int j =0;j<=i;j++){
        System.out.print("*"+" ");
    }
System.out.println();
      
  } 
  sc.close(); 
    }  
}