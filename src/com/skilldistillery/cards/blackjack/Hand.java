package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class Hand {
Deck deck = new Deck();
	public Hand() {

	}

	public int getHandValue(List<Card> cards) {
		int hand = 0;
		for (Card card : cards) {
			int cardValue = card.getValue();
		hand = hand + cardValue;
			
		}
		return hand;
	}

	

	public void addCard(Card card) {

	}

	public void clearHand() {

	}

	public List<Card> getCards() {

		return null;

	}

	@Override
	public String toString() {
		return toString();
	}

}
