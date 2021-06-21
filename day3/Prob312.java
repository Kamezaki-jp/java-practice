package day3;


import java.util.Random;

public class Prob312 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(20) - 10;
		System.out.println(num);
		
		if (num < 0) {
			System.out.println("負の値です。");
		} else if (num > 0) {
			System.out.println("正の値です。");
		} else if (num == 0) {
			System.out.println("0です。");
		}
	}
}
