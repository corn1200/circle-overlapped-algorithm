import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int d = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int d1 = sc.nextInt();
		
		if ((x - x1)*(x - x1) <= (d + d1)*(d + d1) && (y - y1)*(y - y1) <= (d + d1)*(d + d1)) {
			System.out.println("overlapped");
		}
		else {
			System.out.println("not overlapped");
		}
	}

}
