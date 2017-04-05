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

	public static void main(String[] args) {
		Cubik buildSolved = CubikFactory.buildSolved();
		System.out.println(buildSolved.getId());
		Cubik on = new _0().on(buildSolved);
		System.out.println(on.getId());
		System.out.println(" igual:" + ArestesComparator.rotate0(on, buildSolved));
		System.out.println(" igual:" + ArestesComparator.rotate1(on, buildSolved));
		System.out.println(" igual:" + ArestesComparator.rotate2(on, buildSolved));
		System.out.println(" igual:" + ArestesComparator.rotate3(on, buildSolved));

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

		 Cubik cubik = CubikFactory.build("WBOWWGYRRWYYRBRYOGBGOGOB",
		 "WGRBOY");
		// Cubik cubik = CubikFactory.build("YBGWOGBBRWOBRGWROWYRYYGO",
		// "WGRBOY");
		// Cubik cubik = CubikFactory.build("YBWWGGBBRWOBRGWROOYRYYGO",
		// "WGRBOY");
		//Cubik cubik = CubikFactory.buildSolved();
		System.out.println((cubik.getId()));
		System.out.println("--------");
		set.add(cubik.getId());
		Node root = new Node(cubik);
		ArrayList<Node> items = new ArrayList<>();
		items.add(root);
		int LEVEL = 8;
		int level = 1;

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
						if ("WWWWGGGGRRRRBBBBOOOOYYYY WGRBOY".equals(childCubik.getId())) {
							System.out.println("solved:" + SequenceOp.getOp(child));
						}
						if ("WGRBOY".equals(childCubik.getFacesId())) {

							if (ArestesComparator.compare(cubik, childCubik) > 17) {
								System.out.println("faces:" + childCubik.getId() + " " + SequenceOp.getOp(child)
										+ " igual:" + ArestesComparator.compare(cubik, childCubik));

							}
							String compareVertexIgnoreRotation = ArestesComparator.compareVertexIgnoreRotation(cubik,
									childCubik);
//							if ("0123".equals(compareVertexIgnoreRotation)) {
//								System.out.println("rotated:" + childCubik.getId() + " " + compareVertexIgnoreRotation
//										+ " " + SequenceOp.getOp(child));
//
//							}
							if (compareVertexIgnoreRotation.length()==8) {
								System.out.println("rotated:" + childCubik.getId() + " " + compareVertexIgnoreRotation
										+ " " + SequenceOp.getOp(child));

							}
							// System.out.println(cubik.getArestesId());
							// System.out.println(childCubik.getArestesId());
						}
					}

				}
			});
			items = itemsNextLevel;
			// items.forEach(node -> System.out.println(node.cubik.getId() + " "
			// +SequenceOp.getOp(node))) ;
			System.out.println("---" + level + "-----" + items.size() + " set:" + set.size());
			level++;
		}

	}

}
