import java.util.Scanner;
public class largest
{
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println(x);
        }
        else if(y > z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
 
    }
}
