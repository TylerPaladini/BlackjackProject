package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Hand {

	public void dealingCards() {
		Dealer dealer = new Dealer();
		Scanner keyboard = new Scanner(System.in);

		List<Card> dealerHand = new ArrayList<>();
	
		System.out.println("The number of cards still available in this deck is " + deck.checkDeckSize());
//		for (int i = 0; i < 1; i++) {
		deck.shuffleDeck();
		dealerHand.add(deck.dealCard());
		System.out.println("The dealer has dealt two cards. ");
		System.out.println("The card showing is the " + dealerHand + "\n");
		dealerHand.add(deck.dealCard());

		List<Card> playerHand = new ArrayList<>();
		deck.shuffleDeck();
		for (int j = 0; j < 2; j++) {
			playerHand.add(deck.dealCard());
		}

		System.out.println("Your first two cards are " + playerHand);
		System.out.println("Your current hand total is " + dealer.getHandValue(playerHand));
		if (dealer.getHandValue(playerHand) == 21) {
			dealer.playerGetsBlackjack();
			return;

		}
		System.out.println("Do you want to hit or stay?");
		String choice = keyboard.next().toLowerCase();

		while (choice.equals("hit")) {
			playerHand.add(deck.dealCard());

			if (dealer.getHandValue(playerHand) > 21) {
				System.out.println("Ouch your total is " + dealer.getHandValue(playerHand));
				dealer.playerBusts();
				return;

			}

			else if (dealer.getHandValue(playerHand) < 21) {
				System.out.println("Your new hand is " + playerHand);
				System.out.println("and the total is " + dealer.getHandValue(playerHand));
				System.out.println("Hit or Stay");
				choice = keyboard.next().toLowerCase();

			}
		}

		System.out.println("Ok it's the dealer's turn \n");
		System.out.println("The dealer is showing " + dealerHand);
		System.out.println("with a total value of " + dealer.getHandValue(dealerHand));
		if (dealer.getHandValue(dealerHand) == 21) {
			dealer.dealerGetsBlackjack();
			return;
		}

		while (dealer.getHandValue(dealerHand) < 17
				|| dealer.getHandValue(playerHand) > dealer.getHandValue(dealerHand)) {

			System.out.println("Dealer hits \n");
			dealerHand.add(deck.dealCard());
			System.out.println("The dealer's hand is now " + dealerHand);
			System.out.println("The dealer's total is " + dealer.getHandValue(dealerHand));

		}
		if (dealer.getHandValue(dealerHand) > 21) {
			dealer.dealerBusts();
			return;
		}

		else if (dealer.getHandValue(dealerHand) > dealer.getHandValue(playerHand)) {
			dealer.dealerGetsBlackjack();
			return;

		} else if (dealer.getHandValue(dealerHand) > 21) {
			dealer.dealerBusts();
			return;
		} else if (dealer.getHandValue(dealerHand) == dealer.getHandValue(playerHand)) {
			dealer.push();
			return;
		}
	}

//	}

	public void playerGetsBlackjack() {
		System.out.println("-------------------------");
		System.out.println("-------BlackJack---------");
		System.out.println("--------Winner-----------");
	}

	public void playerBusts() {
		System.out.println("-------------------------");
		System.out.println("---------BUSTED----------");
		System.out.println("----------LOSER----------");

	}

	public void dealerGetsBlackjack() {
		System.out.println("-------------------------");
		System.out.println("---------BlackJack-------");
		System.out.println("----------Dealer---------");
		System.out.println("---------Wins------------");
	}

	public void dealerBusts() {
		System.out.println("-------------------------");
		System.out.println("----------Dealer---------");
		System.out.println("----------BUSTS----------");
	}

	public void push() {
		System.out.println("-------------------------");
		System.out.println("----------PUSH-----------");
		System.out.println("-------It's a DRAW-------");
	}
	
	public void deckRunningOut() {
		System.out.println("I must apologize, I am a new dealer and forgot to bring extra decks of cards.");
		System.out.println("This is extremely embarassing. My only option is to reshuffle our current deck");
		System.out.println("I know this is against the rules, but if you won't tell I won't.");
	}

}
