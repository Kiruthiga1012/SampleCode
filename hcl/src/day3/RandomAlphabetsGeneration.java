package day3;

import java.util.*;

public class RandomAlphabetsGeneration {
	char[] alp;
	int num;

	public void randomAlphabetsGeneration() {
		System.out.println("how many times the random class should generate alphabets?");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		alp = new char[num];
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			alp[i] = (char) (random.nextInt(26) + 65);
			System.out.print(alp[i] + "\t");
		}
		scanner.close();

	}

	public void sorting() {
		Arrays.sort(alp);
		System.out.println("\nAfter sorting");
		for (int i = 0; i < num; i++) {
			System.out.print(alp[i] + "\t");
		}
	}

	public void removeDuplicate() {
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (alp[i] == alp[j]) {
					for (int k = j + 1; k < num; k++) {
						alp[k - 1] = alp[k];
					}
					num--;
					j--;
				}
			}
		}
		System.out.println("\nAfter removing duplicate");
		for (int i = 0; i < num; i++) {
			System.out.print(alp[i]+ "\t");
		}

	}

	public static void main(String[] args) {
		RandomAlphabetsGeneration obj = new RandomAlphabetsGeneration();
		obj.randomAlphabetsGeneration();
		obj.sorting();
		obj.removeDuplicate();

	}

}
