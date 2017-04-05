package cubik.operacions;

import cubik.Cubik;
import cubik.Cubik.COLORS;

public class ARESTA_PLUS {
  public static Cubik on(Cubik cubik, int U, int F, int R, int B, int L, int D) {
    Cubik newCubik = new Cubik();
    COLORS[] newCentres = newCubik.centres;
    COLORS[] oldCentres = cubik.centres;

    newCentres[F] = oldCentres[U];
    newCentres[L] = oldCentres[F];
    newCentres[R] = oldCentres[R];
    newCentres[B] = oldCentres[B];
    newCentres[U] = oldCentres[L];
    newCentres[D] = oldCentres[D];


    COLORS[][] newArestes = newCubik.arestes;
    COLORS[][] oldArestes = cubik.arestes;

    newArestes[U][0] = oldArestes[L][3];
    newArestes[U][1] = oldArestes[U][1];
    newArestes[U][2] = oldArestes[L][1];
    newArestes[U][3] = oldArestes[L][0];

    newArestes[F][0] = oldArestes[U][2];
    newArestes[F][1] = oldArestes[U][0];
    newArestes[F][2] = oldArestes[U][3];
    newArestes[F][3] = oldArestes[F][3];

    newArestes[R][0] = oldArestes[B][1];
    newArestes[R][1] = oldArestes[R][1];
    newArestes[R][2] = oldArestes[R][2];
    newArestes[R][3] = oldArestes[R][3];

    newArestes[B][0] = oldArestes[B][0];
    newArestes[B][1] = oldArestes[D][0];
    newArestes[B][2] = oldArestes[B][2];
    newArestes[B][3] = oldArestes[B][3];

    newArestes[L][0] = oldArestes[F][2];
    newArestes[L][1] = oldArestes[F][0];
    newArestes[L][2] = oldArestes[L][2];
    newArestes[L][3] = oldArestes[F][1];

    newArestes[D][0] = oldArestes[R][0];
    newArestes[D][1] = oldArestes[D][1];
    newArestes[D][2] = oldArestes[D][2];
    newArestes[D][3] = oldArestes[D][3];

    return newCubik;
  }

}
