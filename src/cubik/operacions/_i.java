package cubik.operacions;

import cubik.Cubik;

public class _i implements Operacio {

  private final Operacio op;

  public _i(Operacio op) {
    this.op = op;
  }

  @Override
  public Cubik on(Cubik cubik) {
    return this.op.on(this.op.on(cubik));
  }
}
