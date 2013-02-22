public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's a meh grade ");
		else if (score > 40)
			System.out.println("F is for Fun right?");
			System.out.println("No... you just failed");
		else
			System.out.println("Well, what can I say?");
	}

	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}
