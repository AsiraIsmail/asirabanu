import java.util.*;

class Vowel
{
public static void main(String []s)
{
char ch;
//Scanner class to read value
Scanner sc=new Scanner(System.in);


ch=sc.next().charAt(0);

if( (ch>='A' && ch<='Z') || ch>='a' && ch<='z')
{
switch(ch)
{
//Check for vowel
case 'a':case 'e':case 'i':case 'o':case 'u':
case 'A':case 'E':case 'I':case 'O':case 'U':
System.out.println("vowel.");
break;

////all others are alphabet
default:
System.out.println("Consonant.");
break;
}
} 
else
{
System.out.println("invalid");
}

}
}
