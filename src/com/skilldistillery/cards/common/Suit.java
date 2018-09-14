package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("Hearts"),
	SPADES("Spades"),
	CLUBS("Clubs"), 
	DIAMONDS("Clubs");
	
	Suit(String suit) {
		name = suit;
	}
	
	private final String name;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	

	

}
