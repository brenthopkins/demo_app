package tarot;

import java.util.ArrayList;
import java.util.Iterator;

public class TarotCard {
	private String name;
	private String number;

	private String arcana;
	private String suit;
	private String img;
	private ArrayList<String> fortuneTelling;
	private ArrayList<String> cardKeywords;
	private ArrayList<String> meaningsLight;
	private ArrayList<String> meaningsShadow;
	private String archetype;
	private String hebrewAlphabet;
	private String numerology;
	private String elemental;
	private String mythicalSpiritual;
	private ArrayList<String> questionsToAsk;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getArcana() {
		return arcana;
	}

	public void setArcana(String arcana) {
		this.arcana = arcana;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public ArrayList<String> getFortuneTelling() {
		return fortuneTelling;
	}

	public void setFortuneTelling(ArrayList<String> fortuneTelling) {
		this.fortuneTelling = fortuneTelling;
	}

	public ArrayList<String> getCardKeywords() {
		return cardKeywords;
	}

	public void setCardKeywords(ArrayList<String> cardKeywords) {
		this.cardKeywords = cardKeywords;
	}

	public ArrayList<String> getMeaningsLight() {
		return meaningsLight;
	}

	public void setMeaningsLight(ArrayList<String> meaningsLight) {
		this.meaningsLight = meaningsLight;
	}

	public ArrayList<String> getMeaningsShadow() {
		return meaningsShadow;
	}

	public void setMeaningsShadow(ArrayList<String> meaningsShadow) {
		this.meaningsShadow = meaningsShadow;
	}

	public String getArchetype() {
		return archetype;
	}

	public void setArchetype(String archetype) {
		this.archetype = archetype;
	}

	public String getHebrewAlphabet() {
		return hebrewAlphabet;
	}

	public void setHebrewAlphabet(String hebrewAlphabet) {
		this.hebrewAlphabet = hebrewAlphabet;
	}

	public String getNumerology() {
		return numerology;
	}

	public void setNumerology(String numerology) {
		this.numerology = numerology;
	}

	public String getElemental() {
		return elemental;
	}

	public void setElemental(String elemental) {
		this.elemental = elemental;
	}

	public String getMythicalSpiritual() {
		return mythicalSpiritual;
	}

	public void setMythicalSpiritual(String mythicalSpiritual) {
		this.mythicalSpiritual = mythicalSpiritual;
	}

	public ArrayList<String> getQuestionsToAsk() {
		return questionsToAsk;
	}

	public void setQuestionsToAsk(ArrayList<String> questionsToAsk) {
		this.questionsToAsk = questionsToAsk;
	}

	public String toString() {

		StringBuilder buildString = new StringBuilder();

		buildString.append("name = " + getName() + "; ");
		buildString.append("number = " + getNumber() + "; ");
		buildString.append("arcana = " + getArcana() + "; ");
		buildString.append("suit = " + getSuit() + "; ");
		buildString.append("img = " + getImg() + "; ");
		buildString.append("Archetype = " + getArchetype() + "; ");
		buildString.append("Hebrew Alphabet = " + getHebrewAlphabet() + "; ");
		buildString.append("Numerology = " + getNumerology() + "; ");
		buildString.append("Elemental = " + getElemental() + "; ");
		buildString.append("Mythical/Spiritual = " + getMythicalSpiritual() + "; ");

		Iterator<String> iterator = fortuneTelling.iterator();
		while (iterator.hasNext()) {
			buildString.append("Fortune-telling = " + (String) iterator.next() + ", ");
		}
		buildString.append("; ");

		iterator = cardKeywords.iterator();
		while (iterator.hasNext()) {
			buildString.append("Keywords = " + (String) iterator.next() + ", ");
		}
		buildString.append("; ");

		iterator = meaningsLight.iterator();
		while (iterator.hasNext()) {
			buildString.append("Meanings - Light = " + (String) iterator.next() + ", ");
		}
		buildString.append("; ");

		iterator = meaningsShadow.iterator();
		while (iterator.hasNext()) {
			buildString.append("Meanings - Shadow = " + (String) iterator.next() + ", ");
		}
		buildString.append("; ");

		return buildString.toString();
	}

}
