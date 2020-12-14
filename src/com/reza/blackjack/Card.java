package com.reza.blackjack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Card {
	private Suit suit;
	private Value value;
	
	public Card(Suit suit, Value value) {
		this.value = value;
		this.suit= suit;
	}
	public String toString() {
		return this.suit.toString()+this.value.toString();
	}
	
	public Value getValue() {
		return this.value;
	}
	
	public void readFile() {
		
	try {
	      File myObj = new File("C:\\Users\\erice\\OneDrive\\Desktop\\blackjack.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        String[] extensionRemoved = data.split("\\, ");
	        System.out.println(extensionRemoved);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	
	public void splitText(String text) {
		
	}
}
