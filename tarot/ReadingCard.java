package tarot;

public class ReadingCard {
	private String readingType;
	private Integer cardIndex;
	private String cardTitle;
	private String cardExplanation;
	private String cardNotes;
	private TarotCard selectedCard;
	private TarotDeck selectedDeck;
	
	public String getReadingType() {
		return readingType;
	}
	public void setReadingType(String readingType) {
		this.readingType = readingType;
	}
	public Integer getCardIndex() {
		return cardIndex;
	}
	public void setCardIndex(Integer cardIndex) {
		this.cardIndex = cardIndex;
	}
	public String getCardTitle() {
		return cardTitle;
	}
	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}
	public String getCardExplanation() {
		return cardExplanation;
	}
	public void setCardExplanation(String cardExplanation) {
		this.cardExplanation = cardExplanation;
	}
	public String getCardNotes() {
		return cardNotes;
	}
	public void setCardNotes(String cardNotes) {
		this.cardNotes = cardNotes;
	}
	public TarotCard getSelectedCard() {
		return selectedCard;
	}
	public void setSelectedCard(TarotCard selectedCard) {
		this.selectedCard = selectedCard;
	}
	public TarotDeck getSelectedDeck() {
		return selectedDeck;
	}
	public void setSelectedDeck(TarotDeck selectedDeck) {
		this.selectedDeck = selectedDeck;
	}

	public String toString() {

		StringBuilder buildString = new StringBuilder();

		buildString.append("Title = " + getCardTitle() + "; ");
		buildString.append("Card Index = " + getCardIndex() + "; ");
		buildString.append("Position Explanation = " + getCardExplanation() + "; ");
		buildString.append("Card Notes = " + getCardNotes()+ "; ");
		buildString.append("Card = " + getSelectedCard().toString() + "; ");
		buildString.append("Deck = " + getSelectedDeck().toString() + "; ");

		return buildString.toString();
	}

}
