package cubik;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import cubik.operacions.Operacio;
import cubik.operacions._0;
import cubik.operacions._0i;
import cubik.operacions._1;
import cubik.operacions._1i;
import cubik.operacions._2;
import cubik.operacions._2i;
import cubik.operacions._3;
import cubik.operacions._3i;

public class Main {

  public static void main(String[] args) {
    Cubik buildSolved = CubikFactory.buildSolved();
    System.out.println(buildSolved.getId());
    Cubik on = new _0().on(buildSolved);
    System.out.println(on.getId());

    Operacio[] operacions = Arrays
        .asList(new _0(), new _1(), new _2(), new _3(), new _0i(), new _1i(), new _2i(), new _3i())
        .toArray(new Operacio[0]);

    HashSet<String> set = new HashSet<>();
    Cubik cubik = CubikFactory.build("yorb_bwyg_rywo_grwb_gywo_brog", "wryobb");
    // Cubik cubik = CubikFactory.buildSolved();
    System.out.println((cubik.getId()));
    System.out.println("--------");
    set.add(cubik.getId());
    Node root = new Node(cubik);
    ArrayList<Node> items = new ArrayList<>();
    items.add(root);
    int LEVEL = 19;
    int level = 1;
    Instant start = Instant.now();
    while (level <= LEVEL) {
      ArrayList<Node> itemsNextLevel = new ArrayList<>();
      items.forEach((node) -> {

        for (int op = 0; op < operacions.length; op++) {
          Cubik childCubik = operacions[op].on(node.cubik);
          // CubikValidator.isValid(childCubik);
          if (!set.contains(childCubik.getId())) {
            Node child = new Node(childCubik, node, operacions[op]);
            itemsNextLevel.add(child);
            set.add(childCubik.getId());
            if (childCubik.isSolved()) {
              System.out.println("solved in " + Duration.between(start, Instant.now()));
              System.out.println("solved:" + SequenceOp.getOp(child));
              System.exit(0);
            }
          }

        }
      });
      items = itemsNextLevel;
      System.out.println("---" + level + "-----" + items.size() + " set:" + set.size());
      level++;
    }

  }

}
