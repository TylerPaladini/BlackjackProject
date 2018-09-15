package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;

public abstract class Hand {

	public Hand() {

	}

	public int getHandValue() {

		return 0;

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
