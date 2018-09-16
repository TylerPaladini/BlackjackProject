package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Rank;

public class BlackJackApp {

	public static void main(String[] args) {
		BlackJackApp bj = new BlackJackApp();
		
		bj.run();
		
	
		
//		Deck deck = new Deck();
//	
//		BlackJackApp bj = new BlackJackApp();
//		List<Card> dealerHand = new ArrayList<>();
//		List<Card> playerHand = new ArrayList<>();
//		Scanner keyboard = new Scanner(System.in);
//		
//		System.out.println("Welcome to the Blackjack table");
//		System.out.println("Are you ready to play? Type (yes) or (no)");
//		String choice = keyboard.next();
//		if(choice.equals("yes")) {
//			for( int i = 0; i < 1; i++) {
//				deck.shuffleDeck();
//				dealerHand.add(deck.dealCard());
//				System.out.println("The dealer has dealt two cards. ");
//				System.out.println("The card showing is " + dealerHand + "\n");
//				dealerHand.add(deck.dealCard());
//			
//			for (int j = 0; j < 2; j++) {
//				playerHand.add(deck.dealCard());
//			}
//			System.out.println("Your first two cards are " + playerHand);
//			System.out.println(deck.checkDeckSize());
//			// figure out how to add the players cards.
//					
//		
//			
//				
//				
//				
//				
//			}
//			
//			
//		}
//		
//			
//			
		
		
	}
	
	public void run() {
		Dealer dealer = new Dealer();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Blackjack table.");
		System.out.println("Are you ready to play? (yes) or (no)");
		String choice = keyboard.next();
		if(choice.equals("no")) {
			System.out.println("Then leave my table!!!!");
		}
		else {
			
			dealer.dealingCards();
		}
		
		
	}

}
