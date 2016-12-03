package main;

import java.util.*;

import mood.Happy;
import mood.Sad;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		boolean exit_flag = false;
		while(!exit_flag) {
			System.out.println("How is your Mood today ? Select any option from the list :-");
			System.out.println("Select 1. for happy mood");
			System.out.println("Select 2. for sad mood");
			System.out.println("Select 3. for Romantic mood");
			System.out.println("Select 4. for Empty feeling");
			System.out.println("Select 5. for Energetic feel");
			System.out.println("Select 6. for exit");
			int mood_num = input.nextInt();
			switch(mood_num) {
			case 1:
				Happy happy = new Happy();
				Random randHappy = new Random();
				int randomHappyIndex = randHappy.nextInt(5);
				System.out.println(happy.get_happy_mood_statement(randomHappyIndex));
				System.out.println();
				break;
			case 2:
				Sad sad = new Sad();
				Random randSad = new Random();
				int randomSadIndex = randSad.nextInt(5);
				System.out.println(sad.get_sad_mood_statement(randomSadIndex));
				System.out.println();
				break;
			case 3:
				// will call Romantic mood class method;
				System.out.println();
				break;
			case 4:
				// will call Empty feeling class method;
				System.out.println();
				break;
			case 5:
				// will call Energetic feel class method;
				System.out.println();
				break;
			case 6:
				exit_flag = true;
				break;
			}
		}
	}
}
