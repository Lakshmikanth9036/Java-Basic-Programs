package java8;

import java.util.stream.IntStream;

public class Palindrome {

	public static boolean isPalin(String str){
		return IntStream.range(0, str.length() / 2)
        .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
	}
	
	public static void main(String[] args) {
		System.out.println(isPalin("madama"));
	}
}
