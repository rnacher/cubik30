package cubik.operacions;

import cubik.Cubik;
import cubik.Cubik.COLORS;

public class _1 implements Operacio {
  public Cubik on(Cubik cubik) {
    Cubik newCubik = new Cubik();
    COLORS[] newCentres = newCubik.centres;
    COLORS[] oldCentres = cubik.centres;

    newCentres[0] = oldCentres[2];
    newCentres[1] = oldCentres[1];
    newCentres[2] = oldCentres[3];
    newCentres[3] = oldCentres[0];
    newCentres[4] = oldCentres[4];
    newCentres[5] = oldCentres[5];

    COLORS[][] newArestes = newCubik.arestes;
    COLORS[][] oldArestes = cubik.arestes;

    newArestes[0][0] = oldArestes[2][0];
    newArestes[0][1] = oldArestes[2][1];
    newArestes[0][2] = oldArestes[0][2];
    newArestes[0][3] = oldArestes[2][3];

    newArestes[1][0] = oldArestes[1][0];
    newArestes[1][1] = oldArestes[5][3];
    newArestes[1][2] = oldArestes[1][2];
    newArestes[1][3] = oldArestes[1][3];

    newArestes[2][0] = oldArestes[3][2];
    newArestes[2][1] = oldArestes[3][0];
    newArestes[2][2] = oldArestes[2][2];
    newArestes[2][3] = oldArestes[3][1];

    newArestes[3][0] = oldArestes[0][1];
    newArestes[3][1] = oldArestes[0][3];
    newArestes[3][2] = oldArestes[0][0];
    newArestes[3][3] = oldArestes[3][3];

    newArestes[4][0] = oldArestes[1][1];
    newArestes[4][1] = oldArestes[4][1];
    newArestes[4][2] = oldArestes[4][2];
    newArestes[4][3] = oldArestes[4][3];

    newArestes[5][0] = oldArestes[5][0];
    newArestes[5][1] = oldArestes[5][1];
    newArestes[5][2] = oldArestes[5][2];
    newArestes[5][3] = oldArestes[4][0];

    return newCubik;
  }
}
