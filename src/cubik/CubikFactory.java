package cubik;

import cubik.Cubik.COLORS;

public class CubikFactory {
  public static Cubik build(String arr, String faces) {
    Cubik cubik = new Cubik();
    COLORS[] centres = cubik.centres;
    char[] facesArray = faces.toUpperCase().toCharArray();
    int face = 0;
    for (char c : facesArray) {
      COLORS color = COLORS.valueOf("" + c);
      centres[face++] = color;
    }

    COLORS[][] arestes = cubik.arestes;
    char[] charArray = arr.toUpperCase().replaceAll("_", "").toCharArray();
    int pos = 0;
    for (int f = 0; f < 6; f++) {
      for (int a = 0; a < 4; a++) {
        char c = charArray[pos++];
        COLORS color = COLORS.valueOf("" + c);
        arestes[f][a] = color;
      }
    }
    return cubik;
  }

  public static Cubik buildSolved() {
    return new Cubik();
  }

}
