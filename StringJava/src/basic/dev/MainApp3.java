package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String str = sc.nextLine();

		String maxWord = "";
		int maxCount = 0;
		for (String word : str.split(" ")) {
			int count = str.split(" ").length - str.replace(word, "").split(" ").length;
			if (count > maxCount) {
				maxWord = word;
				maxCount = count;

			}
		}

		System.out.println("Từ xuất hiện nhiều nhất trong chuỗi là: " + maxWord);
	}

}
