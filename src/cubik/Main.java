package cubik;

import java.util.ArrayList;
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
//  6298560


  public static void main(String[] args) {
    Cubik buildSolved = CubikFactory.buildSolved();
    System.out.println(buildSolved.getId());
    Cubik on = new _1().on(buildSolved);
    System.out.println(on.getId());
    Cubik on2 = new _1i().on(on);
    System.out.println(on2.getId());
    System.out.println(" igual:" + ArestesComparator.compare(buildSolved, on2));

    Operacio[] operacions = new Operacio[8];

    HashSet<String> set = new HashSet<>();

    operacions[0] = new _0();
    operacions[1] = new _1();
    operacions[2] = new _2();
    operacions[3] = new _3();
    operacions[4] = new _0i();
    operacions[5] = new _1i();
    operacions[6] = new _2i();
    operacions[7] = new _3i();

    // Cubik cubik = CubikFactory.build("YBOWWGBBRWOBRGWROGYRYYGO", "WGRBOY");
    // Cubik cubik = CubikFactory.build("YBGWOGBBRWOBRGWROWYRYYGO", "WGRBOY");
//    Cubik cubik = CubikFactory.build("WOOWWGYWRBBRYBBGOGRGORYY", "WGROYB");
     Cubik cubik = CubikFactory.buildSolved();
    System.out.println((cubik.getId()));
    System.out.println("--------");
    set.add(cubik.getId());
    Node root = new Node(cubik);
    ArrayList<Node> items = new ArrayList<>();
    items.add(root);
    int LEVEL = 15;
    int level = 1;

    while (level <= LEVEL) {
      ArrayList<Node> itemsNextLevel = new ArrayList<>();
      items.forEach((node) -> {

        for (int op = 0; op < operacions.length; op++) {
          Cubik childCubik = operacions[op].on(node.cubik);
          Node child = new Node(childCubik, node, operacions[op]);
//          if ("WWWWGGGGRRRRBBBBOOOOYYYY WGRBOY".equals(childCubik.getId())) {
//            System.out.println("solved:" + SequenceOp.getOp(child));
//          }
          // CubikValidator.isValid(childCubik);
          if (!set.contains(childCubik.getId())) {

            itemsNextLevel.add(child);
            set.add(childCubik.getId());

            if ("WGRBOY".equals(childCubik.getFacesId())) {

              if (ArestesComparator.compare(cubik, childCubik) > 17) {
                System.out.println("faces:" + childCubik.getId() + " " + SequenceOp.getOp(child)
                    + " igual:" + ArestesComparator.compare(cubik, childCubik));

              }
              // System.out.println(cubik.getArestesId());
              // System.out.println(childCubik.getArestesId());
            }
          }

        }
      });
      items = itemsNextLevel;
      // items.forEach(node -> System.out.println(node.cubik.getId() + " " + node.op));
      System.out.println("---" + level + "-----" + items.size() + " set:" + set.size());
      level++;
    }


  }

}
