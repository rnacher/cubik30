package cubik.operacions;

import cubik.Cubik;

public class _0i implements Operacio {

  Operacio op = new _0();

  @Override
  public Cubik on(Cubik cubik) {
    return op.on(op.on(cubik));
  }


}
