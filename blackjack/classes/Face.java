package blackjack;

public enum Face {
  ONE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  FACE(11);

  private int value;
  private Face (int value) {
    this.value = value;
  }
}
