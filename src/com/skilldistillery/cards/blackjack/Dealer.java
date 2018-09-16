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
		Scanner keyboard = new Scanner(System.in);
		
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
				dealer.playerGetsBlackjack();
//				System.out.println("That's Blackjack!!! You beat the house!");
				System.out.println("Do you want to play again? (yes) or (no)");
				String choice = keyboard.next();
				if (choice.equals("yes")) {
					
					dealer.clearHand();
					System.out.println(deck.checkDeckSize());
				}
				else if(choice.equals("no")) {
					System.out.println("Thank you for playing. Enjoy the rest of your day.");
				}
				else if (dealer.getHandValue(playerHand) > 21) {
					System.out.println("Wow you busted in the very first hand");
					System.out.println("Would you like to play again? (yes) or (no)");
					if (choice.equals("yes")) {
						dealer.clearHand();
						System.out.println(deck.checkDeckSize());
					}
					else {
						System.out.println("Thanks for playing. Enjoy the rest of your day");
					}
				}
			}
			System.out.println("Do you want to hit or stay?");
			String choice = keyboard.next();
			if (choice.equals("stay")) {
				System.out.println("Ok, it's the dealer's turn now");
			}

			while (choice.equals("hit")) {
				playerHand.add(deck.dealCard());
				
				if (dealer.getHandValue(playerHand) > 21) {
					System.out.println("Ouch your total is " + dealer.getHandValue(playerHand));
					dealer.playerBusts();
					break;

				}

				else if (dealer.getHandValue(playerHand) < 21) {
					System.out.println("Your new hand is " + playerHand);
					System.out.println("and the total is " + dealer.getHandValue(playerHand));
					System.out.println("Hit or Stay");
					choice = keyboard.next();

				}
			}
			
			if (dealer.getHandValue(dealerHand) < 17 || dealer.getHandValue(playerHand) > dealer.getHandValue(dealerHand)) {
				dealerHand.add(deck.dealCard());
				System.out.println("The dealer's hand is now " + dealerHand);
				System.out.println("The dealer's total is " + dealer.getHandValue(dealerHand));
				if (dealer.getHandValue(dealerHand) > 21 ) {
					System.out.println("Dealer busts!!!! You win!!!");
				}
				
			}
				
			}

		}

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
}
