import java.util.Scanner;

class power
{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int temp = base;
      
      int exp = sc.nextInt();

      for (int i=1; i<exp; i++){
         temp = temp*temp;
      }
      System.out.println(temp);
   }
}
