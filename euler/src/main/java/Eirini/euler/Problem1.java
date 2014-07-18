package Eirini.euler;

public class Problem1 {
	public static void main(String[] args) {

		int sum = 0;
		int a = 3;
		int b = 5;
		int c = 1000;
		
		sum = multiplesOfaAndb(sum, a, b, c);
		

		System.out.print(sum);
	}

	public static int multiplesOfaAndb(int sum, int a, int b, int c) {

		for (int i = 0; i < c; i++) {
			if (i % a == 0 || i % b == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

