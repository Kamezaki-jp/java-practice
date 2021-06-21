package day3;

public class Prob317 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random() * 100) + 1;
		if (num <= 50 && num % 2 == 0) {
			System.out.println("値：" + num);
			System.out.println("50以下の偶数です。");
		} else if (num <= 50) {
			System.out.println("値：" + num);
			System.out.println("50以下です。");
		} else if (num % 2 == 0) {
			System.out.println("値：" + num);
			System.out.println("偶数です。");
		} else {
			System.out.println("値：" + num);
			System.out.println("それ以外です。");
		}
	}
}
