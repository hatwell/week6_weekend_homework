import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class BlackJackTest{
  Player player;

  @Before
  public void before(){
    player = new Player("Caroline");
  }

  @Test
  public void hasName(){
    assertEquals("Caroline", player.getName());
  }
}
