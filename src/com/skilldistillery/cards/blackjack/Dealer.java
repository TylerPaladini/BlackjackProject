package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Hand {
//	Deck deck = new Deck();

	public void dealingCards() {
		Dealer dealer = new Dealer();
		List<Card> dealerHand = new ArrayList<>();
		for (int i = 0; i < 1; i++) {
			deck.shuffleDeck();
			dealerHand.add(deck.dealCard());
			System.out.println("The dealer has dealt two cards. ");
			System.out.println("The card showing is " + dealerHand + "\n");
			dealerHand.add(deck.dealCard());

			List<Card> playerHand = new ArrayList<>();
			deck.shuffleDeck();
			for (int j = 0; j < 2; j++) {
				playerHand.add(deck.dealCard());
			}
			System.out.println("Your first two cards are " + playerHand);
//			System.out.println(deck.checkDeckSize());
			// figure out how to add the players cards.
//			player.getHandValue(playerHand);
			System.out.println("Your current hand total is " + dealer.getHandValue(playerHand));
			if (dealer.getHandValue(playerHand) == 21) {
				System.out.println("That's Blackjack!!! You beat the house!");
				System.out.println("Do you want to play again?");
			}
//			System.out.println(deck.checkDeckSize());
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Do you want to hit or stay?");
			String choice = keyboard.next();
			if (choice.equals("stay")) {
				System.out.println("Ok, it's the dealer's turn now");
			}

			while (choice.equals("hit")) {
				playerHand.add(deck.dealCard());
				
				if (dealer.getHandValue(playerHand) > 21) {
					System.out.println("Ouch your total is " + dealer.getHandValue(playerHand));
					System.out.println("YOU BUSTED!!!!!!");
					break;

				}

				else if (dealer.getHandValue(playerHand) < 21) {
					System.out.println("Your new hand is " + playerHand);
					System.out.println("and the total is " + dealer.getHandValue(playerHand));
					System.out.println("Hit or Stay");
					choice = keyboard.next();

				}
			}

		}

	}
}
