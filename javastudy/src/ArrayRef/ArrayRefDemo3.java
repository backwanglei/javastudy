package ArrayRef;

public class ArrayRefDemo3 {
	public static void main(String[] args) {
		int[] age = { 52, 85, 64, 94, 63 };
		int[] score = { 23, 64, 82, 46, 97, 85 };
		sort(age);
		print(age);
		System.out.println("\n  -----------");
		sort(score);
		print(score);

	}
public static void sort(int x[]) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (x[i] < x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

	}

	public static void print(int x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
	}
}
