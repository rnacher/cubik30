package cubik.operacions;

import cubik.Cubik;

public class _3i implements Operacio {
  Operacio op = new _3();

  @Override
  public Cubik on(Cubik cubik) {
    return op.on(op.on(cubik));
  }
}