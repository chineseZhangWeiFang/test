package hsbc;


import org.junit.jupiter.api.Test;

public class Minicode {
	public static void main(String[] args) {
		String s = "abcdef";
		int n = s.indexOf("c");
		System.out.println(n);
	}

	@Test
	public void fan1() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
				continue;
			}
			if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");
				continue;
			}
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
				continue;
			} else {
				System.out.println(i);
			}
		}
	}

	@Test
	public void fan2() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || (i + "").indexOf("3") >= 0) {
				if (i % 5 == 0 || (i + "").indexOf("5") >= 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");
				}
				continue;
			}
			if (i % 5 == 0 || (i + "").indexOf("5") >= 0) {
				if (i % 3 == 0 || (i + "").indexOf("3") >= 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Buzz");
				}
			} else {
				System.out.println(i);
			}
		}
	}
}
