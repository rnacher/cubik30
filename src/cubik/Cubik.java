package cubik;

public class Cubik {
  public enum COLORS {
    W, G, R, B, O, Y
  };

  public COLORS arestes[][] = new COLORS[6][4];

  public COLORS[] centres = new COLORS[6];

  public Cubik() {

    arestes[0][0] = COLORS.W;
    arestes[0][1] = COLORS.W;
    arestes[0][2] = COLORS.W;
    arestes[0][3] = COLORS.W;

    arestes[1][0] = COLORS.G;
    arestes[1][1] = COLORS.G;
    arestes[1][2] = COLORS.G;
    arestes[1][3] = COLORS.G;

    arestes[2][0] = COLORS.R;
    arestes[2][1] = COLORS.R;
    arestes[2][2] = COLORS.R;
    arestes[2][3] = COLORS.R;

    arestes[3][0] = COLORS.B;
    arestes[3][1] = COLORS.B;
    arestes[3][2] = COLORS.B;
    arestes[3][3] = COLORS.B;

    arestes[4][0] = COLORS.O;
    arestes[4][1] = COLORS.O;
    arestes[4][2] = COLORS.O;
    arestes[4][3] = COLORS.O;

    arestes[5][0] = COLORS.Y;
    arestes[5][1] = COLORS.Y;
    arestes[5][2] = COLORS.Y;
    arestes[5][3] = COLORS.Y;

    centres[0] = COLORS.W;
    centres[1] = COLORS.G;
    centres[2] = COLORS.R;
    centres[3] = COLORS.B;
    centres[4] = COLORS.O;
    centres[5] = COLORS.Y;
  }

  public String getId() {
    return getArestesId() + " " + getFacesId();
  }

  public String getFacesId() {
    StringBuilder buff = new StringBuilder();

    for (int j = 0; j < 6; j++) {
      buff.append(centres[j].toString());
    }
    return buff.toString();
  }

  public String getArestesId() {
    StringBuilder buff = new StringBuilder();
    for (int i = 0; i < 6; i++)
      for (int j = 0; j < 4; j++) {
        buff.append(arestes[i][j].toString());
      }
    return buff.toString();
  }



}
