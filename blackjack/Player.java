package blackjack;

public class Player{

  private String name;

  public Player(String name){
    this.name = name;
  }

  public String speaks(){
    return "Hello I'm playing blackjack";
  }

  public String getName(){
    return this.name;
  }
}
