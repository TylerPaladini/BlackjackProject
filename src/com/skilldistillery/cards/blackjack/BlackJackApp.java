package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackJackApp {
	Dealer deal = new Dealer();
	static Deck deck = new Deck();
	
	
	public static void main(String[] args) {
		BlackJackApp bj = new BlackJackApp();
		System.out.println("Welcome to the Blackjack table");
		System.out.println("Are you ready to play? Type (yes) or (no)");
		Scanner keyboard = new Scanner(System.in);
		String choice = keyboard.next();
		List<Card> hand = new ArrayList<>();
		if(choice.equals("yes")) {
			for(int i = 0; i < 1; i++);
			hand.add(deck.dealCard());
			System.out.println(hand);
			
		}
		
			
			
		
		
	}

	
		
		}
		
	


