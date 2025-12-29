package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser browse = new Browser();
		System.out.println(browse.loadUrl());
		browse.launchBrowser("SAFARI");
	}

}
