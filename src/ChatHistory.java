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
		for(int i = 0; i < chat.size(); i++) {
			if(!(chat.get(i).equals(chat.get(i).toLowerCase()))) lower = false;
			if(chat.get(i).length() > max.length()) max = chat.get(i);
			if(chat.get(i).toLowerCase().equals("the")) the++;
			if(words.indexOf(chat.get(i).toLowerCase()) == -1) words.add(chat.get(i).toLowerCase());
		}
		System.out.println("Chat report: \n" +
						 "You used " + chat.size() + " words.\n" +
						 "You used " + words.size() + " unique words.\n" +
						 "You used \'the\' " + the + " time(s).\n" + 
						 "Your longest word was: " + max + "\n" +
						 "Your words where all lowercase? " + lower + "\n" +
						 "Condesed Chat History: \n");
	
		for(int i = 0; i < words.size(); i++) {
			System.out.print(words.get(i) + " ");
		}
	}
}
