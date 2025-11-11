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
		for(String s : chat) {
			if(s.toLowerCase().equals("the"))
			if(words.indexOf(s.toLowerCase()) == -1) chat.add(s.toLowerCase());
		}
	}
}
