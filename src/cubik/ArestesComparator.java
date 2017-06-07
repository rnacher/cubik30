package cubik;

public class ArestesComparator {
	public static int compare(Cubik cubik1, Cubik cubik2) {
		int igual = 0;
		char[] arestesId1 = cubik1.getArestesId().toCharArray();
		char[] arestesId2 = cubik2.getArestesId().toCharArray();
		for (int i = 0; i < arestesId1.length; i++) {
			if (arestesId1[i] == arestesId2[i]) {
				igual++;
			}
		}
		return igual;
	}

	public static boolean rotate0(Cubik cubik1, Cubik cubik2) {
		return rotate(cubik1, cubik2, 0, 13, 16);
	}

	public static boolean rotate1(Cubik cubik1, Cubik cubik2) {
		return rotate(cubik1, cubik2, 1, 9, 12);
	}

	public static boolean rotate2(Cubik cubik1, Cubik cubik2) {
		return rotate(cubik1, cubik2, 2, 4, 17);
	}

	public static boolean rotate3(Cubik cubik1, Cubik cubik2) {
		return rotate(cubik1, cubik2, 3, 5, 8);
	}
	public static boolean rotate4(Cubik cubik1, Cubik cubik2) {
		return rotate(cubik1, cubik2, 15, 18, 22);
	}
	public static boolean rotate5(Cubik cubik1, Cubik cubik2) {
		return rotate(cubik1, cubik2, 11, 14, 23);
	}
	public static boolean rotate6(Cubik cubik1, Cubik cubik2) {
		return rotate(cubik1, cubik2, 6, 19, 20);
	}
	public static boolean rotate7(Cubik cubik1, Cubik cubik2) {
		return rotate(cubik1, cubik2, 7, 10, 21);
	}

	public static boolean rotate(Cubik cubik1, Cubik cubik2, int i0, int i1, int i2) {
		char[] arestesId1 = cubik1.getArestesId().toCharArray();
		char[] arestesId2 = cubik2.getArestesId().toCharArray();
		if (arestesId1[i0] == arestesId2[i1] && arestesId1[i1] == arestesId2[i2] && arestesId1[i2] == arestesId2[i0])
			return true;
		if (arestesId1[i0] == arestesId2[i2] && arestesId1[i2] == arestesId2[i1] && arestesId1[i1] == arestesId2[i0])
			return true;
		if (arestesId1[i0] == arestesId2[i0] && arestesId1[i1] == arestesId2[i1] && arestesId1[i2] == arestesId2[i2])
			return true;
		return false;
	}

	public static String compareVertexIgnoreRotation(Cubik cubik1, Cubik cubik2) {
		String retorn = "";
		if (rotate0(cubik1, cubik2))
			retorn += 0;
		if (rotate1(cubik1, cubik2))
			retorn += 1;
		if (rotate2(cubik1, cubik2))
			retorn += 2;
		if (rotate3(cubik1, cubik2))
			retorn += 3;
		if (rotate4(cubik1, cubik2))
			retorn += 4;
		if (rotate5(cubik1, cubik2))
			retorn += 5;
		if (rotate6(cubik1, cubik2))
			retorn += 6;
		if (rotate7(cubik1, cubik2))
			retorn += 7;
		return retorn;
	}

}
