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
		for(Card aCard : this.cards) {
			cardList += "\n" +" "+ aCard.toString();
			
		}
		return cardList;
	}
	
	public void removeCard(int i) {
		this.cards.remove(i);
	}
	
	public Card getCard(int i) {
		return this.cards.get(i);
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public void draw(Deck deckComing) {
		this.cards.add(deckComing.getCard(0));
		deckComing.removeCard(0);
	}
	
}
