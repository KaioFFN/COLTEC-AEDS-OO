public class Fibonacci {
   public static void main(String[] args) {
      int num = 0 , num2 = 1;
      do 
      {
         System.out.println(num2);
         num2 = num + num2 ;
         num = num2 - num;
      } while (num2 < 100);
      System.out.println(num2);  
       
   } 
}
