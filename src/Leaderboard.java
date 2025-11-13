import java.util.ArrayList;
public class Leaderboard {
	private int capacity;
	private ArrayList<Score> scoreboard;
	public Leaderboard(int cap) {
		capacity = cap;
		scoreboard = new ArrayList<>(cap);
		sort();
	}
	public void addScore(String name, int score) {scoreboard.add(new Score(name, score)); sort();}
	public void sort() {
		for(int i = 1; i < scoreboard.size(); i++) {
			Score s = scoreboard.get(i);
			Score t = scoreboard.get(i);
			for(int j = 0; j <= i; j++) {
				if(s.getScore() < scoreboard.get(j).getScore()) {
					t = new Score(scoreboard.get(j).getName(), scoreboard.get(j).getScore());
					scoreboard.set(j, new Score(s.getName(), s.getScore()));
					s = new Score(t.getName(), t.getScore());
				}
				if(i==j) {scoreboard.set(i, new Score(t.getName(), t.getScore()));}	
			}
		}
	}
	public int getHighScore() {return scoreboard.get(scoreboard.size()-1).getScore();}
	public int getAverageScore() {
		int total = 0;
		for(Score s : scoreboard) {total+=s.getScore();}
		return total/capacity;
	}
	public boolean break1000() {return scoreboard.get(scoreboard.size()-1).getScore() >= 1000;}
	public void printLeaderboard() {
		for(Score s : scoreboard) {System.out.print(s);}
	}
}
