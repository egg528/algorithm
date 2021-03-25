import java.util.Scanner;
import java.io.FileInputStream;

class Main
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min = Math.min(x, Math.min(y, Math.min(h-y, w-x)));
		
		System.out.println(min);
		
    }
}