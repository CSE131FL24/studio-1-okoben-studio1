package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("the first of two ints to be scanned");
		int n1 = in.nextInt();
		System.out.println("the second of two ints to be scanned");
		int n2 = in.nextInt();
		System.out.println("the average of " + n1 + " and " + n2 + " is " + ((n1 + n2)/2.0));
	}

}
