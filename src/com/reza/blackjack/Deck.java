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
	
	public int cardsValue() {
		int totalValue = 0;
				
		for(Card aCard: this.cards) {
			switch (aCard.getValue()) {
			case TWO: totalValue+=2; break;
			case THREE: totalValue+=3; break;
			case FOUR: totalValue+=4; break;
			case FIVE: totalValue+=5; break;
			case SIX: totalValue+=6; break;
			case SEVEN: totalValue+=7; break;
			case EIGHT: totalValue+=8; break;
			case NINE: totalValue+=9; break;
			case TEN: totalValue+=10; break;
			case JACK: totalValue+=10; break;
			case QUEEN: totalValue+=10; break;
			case KING: totalValue+=10; break;
			case ACE: totalValue+=11; break;
								
			}
			
		}
		return totalValue;
	}
	
}
