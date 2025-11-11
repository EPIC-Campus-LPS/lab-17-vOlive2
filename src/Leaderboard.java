import java.util.ArrayList;
public class Leaderboard {
	private int capacity;
	private ArrayList<Score> scoreboard;
	public Leaderboard(int cap) {
		capacity = cap;
		scoreboard = new ArrayList<>(cap);
	}
	public void addScore(String name, int score) {scoreboard.add(new Score(name, score));}
	private void sort() {
		for(int i = 1; i < scoreboard.size(); i++) {
			Score s = scoreboard.get(i);
			Score t = s;
			for(int j = 0; j <= i; j++) {
				if(s.getScore() < scoreboard.get(j).getScore()) {
					t = scoreboard.get(j);
					scoreboard.set(i, s);			
					s = t;
				}
				if(i==j) {scoreboard.set(i, t);}

			}
		}
	}
	public int getHighScore() {}
	public int getAverageScore() {}
	public boolean break1000() {}
	public void printLeaderboard() {}
}
