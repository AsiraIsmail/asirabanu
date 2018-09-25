import java.util.Scanner;

class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
  

    //The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Even");
     else if( num<0 )
        System.out.println("invalid");
        
        else 
        System.out.println("odd");
        
        
  }
}
