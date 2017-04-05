package cubik;

import cubik.Cubik.COLORS;

public class CubikValidator {

  public static void isValid(Cubik childCubik) {
    String facesId = childCubik.getFacesId();
    int num = 6;
    if (num != facesId.length()) {
      System.out.println("error facesId length:" + facesId);
    }
    num--;
    facesId = facesId.replaceAll(COLORS.W.name(), "");
    if (num != facesId.length()) {
      System.out.println("error facesId length :" + facesId);
    }
    num--;
    facesId = facesId.replaceAll(COLORS.G.name(), "");
    if (num != facesId.length()) {
      System.out.println("error facesId length :" + facesId);
    }
    num--;
    facesId = facesId.replaceAll(COLORS.R.name(), "");
    if (num != facesId.length()) {
      System.out.println("error facesId length :" + facesId);
    }
    num--;
    facesId = facesId.replaceAll(COLORS.B.name(), "");
    if (num != facesId.length()) {
      System.out.println("error facesId length :" + facesId);
    }
    num--;
    facesId = facesId.replaceAll(COLORS.O.name(), "");
    if (num != facesId.length()) {
      System.out.println("error facesId length :" + facesId);
    }
    num--;
    facesId = facesId.replaceAll(COLORS.Y.name(), "");
    if (num != facesId.length()) {
      System.out.println("error facesId length :" + facesId);
    }
    String arestesId = childCubik.getArestesId();
    int num_arestes = 24;
    if (num_arestes != arestesId.length()) {
      System.out.println("error arestes length:" + arestesId);
    }
    num_arestes -= 4;
    arestesId = arestesId.replaceAll(COLORS.W.name(), "");
    if (num_arestes != arestesId.length()) {
      System.out.println("error arestes length :" + arestesId);
    }
    num_arestes -= 4;
    arestesId = arestesId.replaceAll(COLORS.G.name(), "");
    if (num_arestes != arestesId.length()) {
      System.out.println("error arestes length :" + arestesId);
    }
    num_arestes -= 4;
    arestesId = arestesId.replaceAll(COLORS.R.name(), "");
    if (num_arestes != arestesId.length()) {
      System.out.println("error arestes length :" + arestesId);
    }
    num_arestes -= 4;
    arestesId = arestesId.replaceAll(COLORS.B.name(), "");
    if (num_arestes != arestesId.length()) {
      System.out.println("error arestes length :" + arestesId);
    }
    num_arestes -= 4;
    arestesId = arestesId.replaceAll(COLORS.O.name(), "");
    if (num_arestes != arestesId.length()) {
      System.out.println("error arestes length :" + arestesId);
    }
    num_arestes -= 4;
    arestesId = arestesId.replaceAll(COLORS.Y.name(), "");
    if (num_arestes != arestesId.length()) {
      System.out.println("error arestes length :" + arestesId);
    }
  }
}
