import  java.util.*;
public class Pb5 {
   public static void main(String[] args) {
       //Check is a given num N is a prime or not.
       Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int factor = 0;
         for(int i=1; i<=n; i++){
                if(n%i == 0){
                    factor++;
                }
         }
         if(factor == 2){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
         }

   }
}