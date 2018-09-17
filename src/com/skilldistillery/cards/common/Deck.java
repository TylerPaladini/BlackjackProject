package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		for (int suit = 0; suit < Suit.values().length; suit++) {
			for (int rank = 0; rank < Rank.values().length; rank++) {
				Card card = new Card(Suit.values()[suit], Rank.values()[rank]);
				deck.add(card);

			}

		}

	}
	
	public int checkDeckSize() {
		int deckSize = deck.size();
		
		return deckSize;
	}
	
	public Card dealCard() {
		Card dealtCard = deck.remove(0);
		
		return dealtCard;
	}
	
	public List<Card> shuffleDeck() {
		Collections.shuffle(deck);

		return deck;
	}
}
