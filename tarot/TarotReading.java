package tarot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TarotReading {

	public static void main(String[] args) {
		ArrayList<TarotCard> tarotCards = new ArrayList<TarotCard>();
		TarotDeckDao tarotDeckDao = new TarotDeckDao();
		tarotCards = tarotDeckDao.getCards();
		ArrayList<TarotDeck> tarotDeck = new ArrayList<TarotDeck>();
		tarotDeck = tarotDeckDao.getDeck();

		ArrayList<ReadingCard> readCardDeck = new ArrayList<ReadingCard>();
		readCardDeck = tarotDeckDao.getReadingPositions(tarotCards, tarotDeck);

		Iterator<ReadingCard> iterator = readCardDeck.iterator();
		while (iterator.hasNext()) {

			ReadingCard readCard = (ReadingCard) iterator.next();
			Random rand = new Random(System.currentTimeMillis());
			// Generate random integers in range 1 to 100
			int rand_int = rand.nextInt(100) + 1;
			if (rand_int > 90) {
				System.out.println(readCard.getCardIndex() + ": " + readCard.getCardTitle() + " --  selected card: "
						+ readCard.getSelectedCard().getName() + " - Reversed");
			} else {
				System.out.println(readCard.getCardIndex() + ": " + readCard.getCardTitle() + " --  selected card: "
						+ readCard.getSelectedCard().getName());
			}
			System.out.println();
			System.out.println("In this position: " + readCard.getCardExplanation());
			System.out.println();
			System.out.println("Fortune Telling: " + readCard.getSelectedCard().getFortuneTelling());
			System.out.println();
			if (rand_int > 90) {
				System.out.println("Card Meaning:: " + readCard.getSelectedCard().getMeaningsShadow());
			} else {
				System.out.println("Card Meaning: " + readCard.getSelectedCard().getMeaningsLight());
			}
			System.out.println();
			System.out.println("Questions for Querent: " + readCard.getSelectedCard().getQuestionsToAsk());
			System.out.println();
		}

	}
}