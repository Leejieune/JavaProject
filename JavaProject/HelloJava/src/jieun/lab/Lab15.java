package jieun.lab;

public class Lab15 {
	// 7-1,7-3
	// 연습문제 6-22,23,24
}

// 7-1
class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

class CaptionTv extends Tv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello,World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");

	}
}

class DeckTest {
	public static void main(String args[]) {
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);

		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
	}
}

class Deck {
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM];
	private Card[] pick;

	Deck() {
		int i = 0;
		for (int k = Card.KIND_MAX; k > 0; k--)
			for (int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n + 1);
	}

	Card pick(int index) {
		return pick[index];
	}

	Card pick() {
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

class Card {

	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789CJQK";
		return "Card [kind=" + kind + ", number=" + number + "]";
	}

}
