package com.reza.blackjack;

public class BlackJack {

	public static void main(String[] args) {
	
		boolean exit=false;
		
		Deck playingDeck = new Deck();
		playingDeck.creatDeck();
		
		Deck samDeck = new Deck();
		Deck dealerDeck= new Deck();
		
		while((samDeck.cardsValue()<17) && exit ==false) {
		samDeck.draw(playingDeck);
		
		dealerDeck.draw(playingDeck);
		
		samDeck.draw(playingDeck);
		
		dealerDeck.draw(playingDeck);
		}
		
		while(true) {
			System.out.println("Sam hand: "+ samDeck.toString());
			//System.out.println("Sam hand value: "+ samDeck.cardsValue());
			
			System.out.println("Dealer hand: "+ dealerDeck.toString());
			//System.out.println("Dealer hand value: "+ dealerDeck.cardsValue());
			
			samDeck.draw(playingDeck);
			
			if(samDeck.cardsValue() ==21 && dealerDeck.cardsValue()==21) {
				
				System.out.println("Sam won "+ samDeck.cardsValue());
				exit=true;
			}
			if(samDeck.cardsValue() ==22 && dealerDeck.cardsValue()==22) {
				
				System.out.println("Dealer won "+ dealerDeck.cardsValue());
				exit=true;
			}
			if(dealerDeck.cardsValue() > samDeck.cardsValue() && exit == false) {
				System.out.println("Dealer won");
				exit=true;
			}
		}
		
		

	}

}
