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

  @Test
  public void testSpeaks(){
    assertEquals("Hello I'm playing blackjack", player.speaks());
  }

  @Test
  public void hasNumberThatIsInitiallyZero(){
    player = new Player("Caroline");
    assertEquals(0, player.getNumber());
  }

  @Test
  public void setNumberToValue(){
    player = new Player("Caroline");
    player.setNumber(6);
    assertEquals(6, player.getNumber());
  }

}
