package madlibs;

import java.util.Scanner;

public class Madlibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String noun = "", verb = "", adj = "", color = "", place = "";
		Scanner reader = new Scanner(System.in);
		System.out.println("welcome to my mad libs program!");
		System.out.print("Give me a noun:");
		noun = reader.next();
		System.out.println("Give me a verb:");
		verb = reader.next();
		System.out.println("Give me a adj:");
		adj = reader.next();
		System.out.println("Give me a color:");
		color = reader.next();
		System.out.println("Give me a place:");
		place = reader.next();
		String Bingo = ("house, walk, hot, blue, University");
		reader.close();
		
		// Paragraph
		System.out.println("I am preparing my morning with a " + adj + "coffee and I also will wear my favorite " + color + "shirt. Once I am ready, I will leave my " + noun + " and go for a " + verb + "to" + place + "and get readt to learn!" + Bingo );
	}

}
