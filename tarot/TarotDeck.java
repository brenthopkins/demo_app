package tarot;

import java.util.ArrayList;
import java.util.Iterator;

public class TarotDeck {

	private String indexCode;
	private String title;
	private String rank;
	private String shortReading;
	private String shortReadingReversed;
	private String img;

	private ArrayList<String> description;
	private ArrayList<String> inAReading;
	private ArrayList<String> reversed;
	private ArrayList<String> notes;

	public String getIndexCode() {
		return indexCode;
	}

	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getShortReading() {
		return shortReading;
	}

	public void setShortReading(String shortReading) {
		this.shortReading = shortReading;
	}

	public String getShortReadingReversed() {
		return shortReadingReversed;
	}

	public void setShortReadingReversed(String shortReadingReversed) {
		this.shortReadingReversed = shortReadingReversed;
	}

	public ArrayList<String> getDescription() {
		return description;
	}

	public void setDescription(ArrayList<String> description) {
		this.description = description;
	}

	public ArrayList<String> getInAReading() {
		return inAReading;
	}

	public void setInAReading(ArrayList<String> inAReading) {
		this.inAReading = inAReading;
	}

	public ArrayList<String> getReversed() {
		return reversed;
	}

	public void setReversed(ArrayList<String> reversed) {
		this.reversed = reversed;
	}

	public ArrayList<String> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<String> notes) {
		this.notes = notes;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String toString() {

		StringBuilder buildString = new StringBuilder();

		buildString.append("Title = " + getTitle() + "; ");
		buildString.append("Index Code = " + getIndexCode() + "; ");
		buildString.append("Rank = " + getRank() + "; ");
		buildString.append("Image file name = " + getImg() + "; ");
		buildString.append("Short Reading = " + getShortReading() + "; ");
		buildString.append("Short Reading (reversed) = " + getShortReadingReversed() + "; ");

		Iterator<String> iterator = description.iterator();
		while (iterator.hasNext()) {
			buildString.append("Description = " + (String) iterator.next() + ", ");
		}
		buildString.append("; ");

		iterator = inAReading.iterator();
		while (iterator.hasNext()) {
			buildString.append("In a reading = " + (String) iterator.next() + ", ");
		}
		buildString.append("; ");

		iterator = reversed.iterator();
		while (iterator.hasNext()) {
			buildString.append("In a reading (reversed)= " + (String) iterator.next() + ", ");
		}
		buildString.append("; ");

		iterator = notes.iterator();
		while (iterator.hasNext()) {
			buildString.append("Notes = " + (String) iterator.next() + ", ");
		}
		buildString.append("; ");

		return buildString.toString();
	}

}
