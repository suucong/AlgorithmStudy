import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int result;
		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			result = 1;
			for (int j = 0; j < n; j++) {
				result = result * (m - j) / (j + 1);
			}
			System.out.println(result);

		}
    }
}