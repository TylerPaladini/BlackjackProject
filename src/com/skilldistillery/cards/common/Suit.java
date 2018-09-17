package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("\u2665"),
	SPADES("\u2660"),
	CLUBS("\u2663"), 
	DIAMONDS("\u2666");
	
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
