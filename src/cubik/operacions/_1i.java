package cubik.operacions;

import cubik.Cubik;

public class _1i implements Operacio {
  Operacio op = new _1();

  @Override
  public Cubik on(Cubik cubik) {
    return op.on(op.on(cubik));
  }
}
