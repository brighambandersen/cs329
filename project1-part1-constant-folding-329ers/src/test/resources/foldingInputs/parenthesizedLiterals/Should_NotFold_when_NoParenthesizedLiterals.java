package parenthesizedLiterals;

public class Should_NotFold_when_NoParenthesizedLiterals {
  public int name(final int y) {
    final int x = 3 + (y);
    final boolean b = true;
    final Integer i = null;
    final char c = 'c';
    final String s = new String("Hello");
    final boolean t = (Name.class == Name.class);
    return x;
  }
}
