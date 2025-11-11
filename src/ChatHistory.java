import java.util.ArrayList;
import java.util.Scanner;
public class ChatHistory {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> chat = new ArrayList<>();
		ArrayList<String> words = new ArrayList<>();
		while(true) {
			System.out.print("Enter a sentence: ");
			String line = scan.nextLine();
			if(line.equals("STOP")) break;
			String[] splitline = line.split(" ");
			for(String s : splitline) {
				chat.add(s);
			}
		}
		int the = 0;
		String max = "";
		boolean lower = true;
		for(String s : chat) {
			if(!(s.equals(s.toLowerCase()))) lower = false;
			if(s.length() > max.length()) max = s;
			if(s.toLowerCase().equals("the"))
			if(words.indexOf(s.toLowerCase()) == -1) chat.add(s.toLowerCase());
		}
		for(String s : words) {
			System.out.print(s + " ");
		}
		System.out.print("Chat report: \n" +
						 "You used " + chat.size() + " words." +
						 "You used " + words.size() + " unique  words." +
						 "You used \'the\' " + the + " many time(s)." + 
						 "Your longest word was: " + max +
						 );

		
	}
}
