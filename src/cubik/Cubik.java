package cubik;

public class Cubik {
  public enum COLORS {
    B, G, O, R, W, Y
  }

  public COLORS arestes[][] = new COLORS[6][4];

  public COLORS[] centres = new COLORS[6];

  public Cubik() {

    this.arestes[0][0] = COLORS.W;
    this.arestes[0][1] = COLORS.W;
    this.arestes[0][2] = COLORS.W;
    this.arestes[0][3] = COLORS.W;

    this.arestes[1][0] = COLORS.G;
    this.arestes[1][1] = COLORS.G;
    this.arestes[1][2] = COLORS.G;
    this.arestes[1][3] = COLORS.G;

    this.arestes[2][0] = COLORS.R;
    this.arestes[2][1] = COLORS.R;
    this.arestes[2][2] = COLORS.R;
    this.arestes[2][3] = COLORS.R;

    this.arestes[3][0] = COLORS.B;
    this.arestes[3][1] = COLORS.B;
    this.arestes[3][2] = COLORS.B;
    this.arestes[3][3] = COLORS.B;

    this.arestes[4][0] = COLORS.O;
    this.arestes[4][1] = COLORS.O;
    this.arestes[4][2] = COLORS.O;
    this.arestes[4][3] = COLORS.O;

    this.arestes[5][0] = COLORS.Y;
    this.arestes[5][1] = COLORS.Y;
    this.arestes[5][2] = COLORS.Y;
    this.arestes[5][3] = COLORS.Y;

    this.centres[0] = COLORS.W;
    this.centres[1] = COLORS.G;
    this.centres[2] = COLORS.R;
    this.centres[3] = COLORS.B;
    this.centres[4] = COLORS.O;
    this.centres[5] = COLORS.Y;
  }

  public String getArestesId() {
    StringBuilder buff = new StringBuilder();
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 4; j++) {
        buff.append(this.arestes[i][j].toString());
      }
    }
    return buff.toString();
  }

  public String getFacesId() {
    StringBuilder buff = new StringBuilder();

    for (int j = 0; j < 6; j++) {
      buff.append(this.centres[j].toString());
    }
    return buff.toString();
  }

  public String getId() {
    return getArestesId() + " " + getFacesId();
  }

  public boolean isSolved() {
    for (int f = 0; f < 6; f++) {
      COLORS c = this.centres[f];
      for (int a = 0; a < 4; a++) {
        if (!c.equals(this.arestes[f][a])) {
          return false;
        }
      }
    }
    return true;

  }



}
