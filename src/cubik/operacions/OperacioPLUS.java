package cubik.operacions;

import cubik.Cubik;

public abstract class OperacioPLUS implements Operacio {

  final int U;
  final int L;
  final int F;
  final int R;
  final int B;
  final int D;

  public OperacioPLUS(int u, int f, int r, int b, int l, int d) {
    super();
    U = u;
    L = l;
    F = f;
    R = r;
    B = b;
    D = d;
  }

  public String toString() {
    return this.getClass().getSimpleName();
  }

  public Cubik on(Cubik cubik) {
    return ARESTA_PLUS.on(cubik, U, F, R, B, L, D);
  }



}
