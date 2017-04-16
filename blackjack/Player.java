package blackjack;
import java.util.Random;

public class Player{

  private String name;
  private int number;

  public Player(String name){
    this.name = name;
    this.number = 0;
  }

  public String speaks(){
    return "Hello I'm playing blackjack";
  }

  public String getName(){
    return this.name;
  }

  public int getNumber(){
    return this.number;
  }

  public void setNumber(){
    int n = Random.nextInt(100) + 1;
    this.number = n;
  }


}
