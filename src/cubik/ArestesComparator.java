package cubik;

public class ArestesComparator {
  public static int compare(Cubik cubik1, Cubik cubik2) {
    int igual = 0;
    char[] arestesId1 = cubik1.getArestesId().toCharArray();
    char[] arestesId2 = cubik2.getArestesId().toCharArray();
    for (int i = 0; i < arestesId1.length; i++) {
      if (arestesId1[i] == arestesId2[i]) {
        igual++;
      }
    }
    return igual;
  }

}
