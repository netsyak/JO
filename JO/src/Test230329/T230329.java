package Test230329;

import java.util.Scanner;

public class T230329 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		sc.close();
		
		double x = (x1+x2+x3);
		double y = (y1+y2+y3);
		
		
	System.out.printf("(%.1f, %.1f)", x/3, y/3);
		
	}
}
