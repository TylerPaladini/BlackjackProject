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

	}

	public void run() {
		Dealer dealer = new Dealer();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Blackjack table.");
		System.out.println("Are you ready to play? Yes or No");
		String choice = keyboard.next().toLowerCase();
		if (choice.equals("no")) {
			System.out.println("Then leave my table!!!!");
		} else {
			while (choice.equals("yes")) {
				dealer.dealingCards();
				System.out.println("Do you want to play again? yes or no");
				choice = keyboard.next();
	
			}
			if(choice.equals("no")) {
				System.out.println("Thank you for playing. Enjoy the rest of day.");
			}
			

		}

	}

}
