package day3;

public class Prob315 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random() * 3) + 1;
		switch (num) {
		case 1:
			System.out.println("グー");
			break;
		case 2:
			System.out.println("パー");
			break;
		case 3:
			System.out.println("チョキ");
			break;
		default:
			System.out.println("値の範囲外です。");
		}
	}
}
