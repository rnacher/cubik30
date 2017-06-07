package cubik;

public class SequenceOp {
  public static String getOp(Node node) {
    StringBuilder builder = new StringBuilder();
    while (node != null) {
      if (node.op != null) {
        builder.append(node.op.getClass().getSimpleName());
      }
      node = node.parent;


    }
    return builder.reverse().toString();


  }

}
