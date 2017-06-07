package cubik.operacions;

import cubik.Cubik;

public class _2i implements Operacio {
  Operacio op = new _2();

  @Override
  public Cubik on(Cubik cubik) {
    return op.on(op.on(cubik));
  }
}