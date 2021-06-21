package day3;

public class Prob31 {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 10) + 1;
		if ( num >= 5) {
			System.out.println(num);
			System.out.println("5以上です。");
		} else {
			System.out.println(num);			
			System.out.println("5以下です。");
		}
	}
}
