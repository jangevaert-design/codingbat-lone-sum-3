public class LoneSum3 {
  public int loneSum(int a, int b, int c) {
    if (a == b && b == c) {
      return 0;
    } else if (a == b) {
      return c;
    } else if (a == c) {
      return b;
    } else if (b == c) {
      return a;
    } else {
      return a + b + c;
    }
  }

}
