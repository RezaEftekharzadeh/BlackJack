package com.reza.blackjack;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	private ArrayList<Card> cards;
	
	public Deck() {
		this.cards= new ArrayList<Card>();
	}
	
	public void creatDeck() {
		for(Suit cardSuit : Suit.values()) {
			for(Value cardValue : Value.values()) {
				this.cards.add(new Card(cardSuit,cardValue));
			}
		}
		Collections.shuffle(cards);
	}
	
	public String toString() {
		String cardList= "";
		int i =0;
		for(Card aCard : this.cards) {
			cardList += "\n" +i + " "+ aCard.toString();
			i++;
		}
		return cardList;
	}
	
}
