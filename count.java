import java.util.Scanner;

class count
{
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, Count=0;
		sc = new Scanner(System.in);		
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.format( Count);
	}
}
