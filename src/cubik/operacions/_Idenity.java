package cubik.operacions;

import cubik.Cubik;
import cubik.CubikFactory;

public class _Idenity implements Operacio {

  public Cubik on(Cubik cubik) {
    return CubikFactory.build(cubik.getArestesId(), cubik.getFacesId());
  }


}
