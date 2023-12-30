package basic.dev;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào một chuỗi: ");
		String input = sc.nextLine();
		String reversedString = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reversedString += input.charAt(i);
		}
		System.out.println("Chuỗi đảo ngược: " + reversedString);

	}

}
