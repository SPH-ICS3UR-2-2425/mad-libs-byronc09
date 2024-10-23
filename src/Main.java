import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program Author: Class: ICS3U Date: Sept. 16, 2024 Make a program that
		 * asks for 10 inputs reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Give me a number");
		int num1 = in.nextInt();
		System.out.println("Give me your favourite colour: ");
		in.nextLine();
		String colour = in.nextLine();

		System.out.println("Give me a saying you would say when you are happy:");
		String phrase = in.nextLine();
		System.out.println("One day, " + name + " wrote a Mad Lib in class!");
		System.out.println(" The next day " + name + " went to math class and has the equation " + num1 + " x 45");
		System.out.println("He then was having trouble with this equation and grabbed his " + colour + " calculator ");
		System.out.println(" " + name + " was happy after getting it right, he says " + phrase + " ");

		;
	}

}
