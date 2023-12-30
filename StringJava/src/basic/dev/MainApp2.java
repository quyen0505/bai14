package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String str = sc.nextLine();

		int count = 0;
		boolean notCounted = true;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (notCounted) {
					count++;
					notCounted = false;
				}

			} else {
				notCounted = true;

			}
		}

		System.out.println("Chuỗi có " + count + " từ.");
	}

}
