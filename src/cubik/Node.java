package cubik;

import cubik.operacions.Operacio;

public class Node {
  public Cubik cubik;
  Node parent;
  Operacio op;

  public Node(Cubik cubik, Node parent, Operacio op) {
    super();
    this.cubik = cubik;
    this.parent = parent;
    this.op = op;
  }

  public Node(Cubik cubik) {
    super();
    this.cubik = cubik;
  }



}
