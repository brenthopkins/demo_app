package tarot;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author Build the Tarot Deck Array
 */

public class TarotDeckDao {
	@SuppressWarnings("unchecked")
	public static ArrayList<TarotCard> getCards() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C://Users/brent/workspace/testfile1/tarot-images.json"));

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray fortuneTelling = (JSONArray) jsonObject.get("cards");

			Iterator<JSONObject> iterator = fortuneTelling.iterator();
			ArrayList<TarotCard> cardsList = new ArrayList<TarotCard>();
			while (iterator.hasNext()) {
				JSONObject jsonCardObject = (JSONObject) iterator.next();
				cardsList.add(builder(jsonCardObject));
			}

			return cardsList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<TarotDeck> getDeck() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C://Users/brent/workspace/testfile1/TarotData.json"));

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray fortuneTelling = (JSONArray) jsonObject.get("cards");

			Iterator<JSONObject> iterator = fortuneTelling.iterator();
			ArrayList<TarotDeck> cardsList = new ArrayList<TarotDeck>();
			while (iterator.hasNext()) {
				JSONObject jsonCardObject = (JSONObject) iterator.next();
				cardsList.add(buildDeck(jsonCardObject));
			}

			return cardsList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ArrayList<ReadingCard> getReadingPositions(ArrayList<TarotCard> tarotCards, ArrayList<TarotDeck> tarotDeck) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C://Users/brent/workspace/testfile1/reading-cross.json"));

			ArrayList<TarotCard> usedCards = new ArrayList<TarotCard>();
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray fortuneTelling = (JSONArray) jsonObject.get("cards");
			Iterator<JSONObject> iterator = fortuneTelling.iterator();
			ArrayList<ReadingCard> cardsList = new ArrayList<ReadingCard>();
			while (iterator.hasNext()) {
				JSONObject jsonCardObject = (JSONObject) iterator.next();
				ReadingCard selectedCard = reader(jsonCardObject, tarotCards, tarotDeck);
				while (usedCards.contains(selectedCard.getSelectedCard())) {
					selectedCard = reader(jsonCardObject, tarotCards, tarotDeck);
				}
				cardsList.add(selectedCard);
				usedCards.add(selectedCard.getSelectedCard());
			}

			return cardsList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static ReadingCard reader(JSONObject jsonCardObject, ArrayList<TarotCard> tarotCards, ArrayList<TarotDeck> tarotDeck) {
		ReadingCard targetCard = new ReadingCard();
		// create instance of Random class
		Random rand = new Random(System.currentTimeMillis());
		// Generate random integers in range 0 to 999
		int rand_int = rand.nextInt(78);

		targetCard.setCardIndex(Integer.valueOf((String) jsonCardObject.get("cardindex")));
		targetCard.setCardTitle((String) jsonCardObject.get("cardtitle"));
		targetCard.setCardExplanation((String) jsonCardObject.get("cardexplanation"));
		targetCard.setCardNotes((String) jsonCardObject.get("cardnotes"));
		targetCard.setSelectedCard(tarotCards.get(rand_int));
		targetCard.setSelectedDeck(tarotDeck.get(rand_int));

		return targetCard;
	}

	@SuppressWarnings("unchecked")
	private static TarotCard builder(JSONObject jsonCardObject) {
		TarotCard targetCard = new TarotCard();

		targetCard.setName((String) jsonCardObject.get("name"));
		targetCard.setNumber((String) jsonCardObject.get("number"));
		targetCard.setArcana((String) jsonCardObject.get("arcana"));
		targetCard.setSuit((String) jsonCardObject.get("suit"));
		targetCard.setImg((String) jsonCardObject.get("img"));

		targetCard.setArchetype((String) jsonCardObject.get("Archetype"));
		targetCard.setHebrewAlphabet((String) jsonCardObject.get("Hebrew Alphabet"));
		targetCard.setNumerology((String) jsonCardObject.get("Numerology"));
		targetCard.setElemental((String) jsonCardObject.get("Elemental"));
		targetCard.setMythicalSpiritual((String) jsonCardObject.get("Mythical/Spiritual"));

		JSONArray fortuneTelling = (JSONArray) jsonCardObject.get("fortune_telling");
		Iterator<String> iterator = fortuneTelling.iterator();
		ArrayList<String> fortunes = new ArrayList<String>();
		while (iterator.hasNext()) {
			fortunes.add((String) iterator.next());
		}
		targetCard.setFortuneTelling(fortunes);

		JSONArray keywords = (JSONArray) jsonCardObject.get("keywords");
		iterator = keywords.iterator();
		ArrayList<String> keys = new ArrayList<String>();
		while (iterator.hasNext()) {
			keys.add((String) iterator.next());
		}
		targetCard.setCardKeywords(keys);

		JSONObject jsonMeaningObject = (JSONObject) jsonCardObject.get("meanings");
		JSONArray lights = (JSONArray) jsonMeaningObject.get("light");
		iterator = lights.iterator();
		ArrayList<String> light = new ArrayList<String>();
		while (iterator.hasNext()) {
			light.add((String) iterator.next());
		}
		targetCard.setMeaningsLight(light);

		JSONArray shadows = (JSONArray) jsonMeaningObject.get("shadow");
		iterator = shadows.iterator();
		ArrayList<String> shadow = new ArrayList<String>();
		while (iterator.hasNext()) {
			shadow.add((String) iterator.next());
		}
		targetCard.setMeaningsShadow(shadow);

		JSONArray questions = (JSONArray) jsonCardObject.get("Questions to Ask");
		iterator = questions.iterator();
		ArrayList<String> question = new ArrayList<String>();
		while (iterator.hasNext()) {
			question.add((String) iterator.next());
		}
		targetCard.setQuestionsToAsk(question);

		return targetCard;
	}

	private static TarotDeck buildDeck(JSONObject jsonCardObject) {
		TarotDeck targetCard = new TarotDeck();

		targetCard.setTitle((String) jsonCardObject.get("Title"));
		targetCard.setIndexCode(((Long) jsonCardObject.get("IndexCode")).toString());
		targetCard.setRank((String) jsonCardObject.get("Rank"));
		targetCard.setShortReading((String) jsonCardObject.get("ShortReading"));
		targetCard.setShortReadingReversed((String) jsonCardObject.get("ShortReadingReversed"));

		StringBuffer buildimageName = new StringBuffer();
		buildimageName.append(targetCard.getRank().substring(0, 1));
		Integer imageNumber = Integer.decode(targetCard.getIndexCode());
		if (targetCard.getRank().equals("Major")) {
			if (imageNumber > 9) {
				buildimageName.append(targetCard.getIndexCode() + ".jpg");
			} else {
				buildimageName.append("0" + targetCard.getIndexCode() + ".jpg");
			}
		} else {
			Integer target = ((imageNumber - 22) % 14) + 1;
			if (target > 9) {
				buildimageName.append(target.toString() + ".jpg");
			} else {
				buildimageName.append("0" + target.toString() + ".jpg");
			}
		}
		targetCard.setImg(buildimageName.toString());

		ArrayList<String> description = new ArrayList<String>();
		description.add((String) jsonCardObject.get("Description1"));
		if (jsonCardObject.get("Description2") != null
				&& !((String) jsonCardObject.get("Description2")).trim().equals("")) {
			description.add((String) jsonCardObject.get("Description2"));
		}
		if (jsonCardObject.get("Description3") != null
				&& !((String) jsonCardObject.get("Description3")).trim().equals("")) {
			description.add((String) jsonCardObject.get("Description3"));
		}
		if (jsonCardObject.get("Description4") != null
				&& !((String) jsonCardObject.get("Description4")).trim().equals("")) {
			description.add((String) jsonCardObject.get("Description4"));
		}
		targetCard.setDescription(description);

		ArrayList<String> inAReading = new ArrayList<String>();
		inAReading.add((String) jsonCardObject.get("InAReading1"));
		if (jsonCardObject.get("InAReading2") != null
				&& !((String) jsonCardObject.get("InAReading2")).trim().equals("")) {
			inAReading.add((String) jsonCardObject.get("InAReading2"));
		}
		if (jsonCardObject.get("InAReading3") != null
				&& !((String) jsonCardObject.get("InAReading3")).trim().equals("")) {
			inAReading.add((String) jsonCardObject.get("InAReading3"));
		}
		if (jsonCardObject.get("InAReading4") != null
				&& !((String) jsonCardObject.get("InAReading4")).trim().equals("")) {
			inAReading.add((String) jsonCardObject.get("InAReading4"));
		}
		targetCard.setInAReading(inAReading);

		ArrayList<String> reversed = new ArrayList<String>();
		reversed.add((String) jsonCardObject.get("Reversed1"));
		if (jsonCardObject.get("Reversed2") != null && !((String) jsonCardObject.get("Reversed2")).trim().equals("")) {
			reversed.add((String) jsonCardObject.get("Reversed2"));
		}
		if (jsonCardObject.get("Reversed3") != null && !((String) jsonCardObject.get("Reversed3")).trim().equals("")) {
			reversed.add((String) jsonCardObject.get("Reversed3"));
		}
		if (jsonCardObject.get("Reversed4") != null && !((String) jsonCardObject.get("Reversed4")).trim().equals("")) {
			reversed.add((String) jsonCardObject.get("Reversed4"));
		}
		targetCard.setReversed(reversed);

		ArrayList<String> notes = new ArrayList<String>();
		notes.add((String) jsonCardObject.get("Notes1"));
		if (jsonCardObject.get("Notes2") != null && !((String) jsonCardObject.get("Notes2")).trim().equals("")) {
			notes.add((String) jsonCardObject.get("Notes2"));
		}
		if (jsonCardObject.get("Notes3") != null && !((String) jsonCardObject.get("Notes3")).trim().equals("")) {
			notes.add((String) jsonCardObject.get("Notes3"));
		}
		if (jsonCardObject.get("Notes4") != null && !((String) jsonCardObject.get("Notes4")).trim().equals("")) {
			notes.add((String) jsonCardObject.get("Notes4"));
		}
		targetCard.setNotes(notes);
		System.out.println(targetCard.toString());
		return targetCard;
	}
}