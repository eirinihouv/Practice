package Eirini.euler;

public class Problem2 {
	public static void main(String[] args) {
		int sum = 0;
		int a = 0;
		int b = 1;
		int c = 0;

		while (c < 4000000) {

			c = a + b;
			a = b;
			b = c;

			if (c % 2 == 0) {
				sum += c;
			}

		}

		System.out.print(sum);

	}
}