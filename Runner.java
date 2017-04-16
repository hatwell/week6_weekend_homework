import blackjack.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Runner {
  public static void main(String[] args){
    ArrayList<String> allPlayers;

    System.out.println("Welcome to HIGH CARD WIN GAME. How many players are there?");
    Scanner sc = new Scanner(System.in);
    int players = sc.nextInt();
    System.out.println(players + " players will play blackjack now.");
    allPlayers = new ArrayList<String>();
    for (int num = 1; num <= players; num ++){
      // int playerNumber = num+1;
      System.out.println("player " + num +", what is your name?");
      Scanner name = new Scanner(System.in);
      String playerNameInput = name.nextLine();
      Player player = new Player(playerNameInput);
      player.setNumber();
      allPlayers.add(player.getName()+"," + player.getNumber());
    }
    System.out.println(allPlayers);
  }
}
