import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import cubik.ArestesComparator;
import cubik.Cubik;
import cubik.CubikFactory;
import cubik.operacions._0;
import cubik.operacions._0i;
import cubik.operacions._1;
import cubik.operacions._1i;
import cubik.operacions._2;
import cubik.operacions._2i;
import cubik.operacions._3;
import cubik.operacions._3i;

public class TestOperations {

	@Test
	public void test0() {
		Cubik buildSolved = CubikFactory.buildSolved();
		String id = new _0().on(new _0i().on(buildSolved)).getId();
		assertEquals(buildSolved.getId(), id);
	}

	@Test
	public void test1() {
		Cubik buildSolved = CubikFactory.buildSolved();
		String id = new _1().on(new _1i().on(buildSolved)).getId();
		assertEquals(buildSolved.getId(), id);
	}

	@Test
	public void test2() {
		Cubik buildSolved = CubikFactory.buildSolved();
		String id = new _2().on(new _2i().on(buildSolved)).getId();
		assertEquals(buildSolved.getId(), id);
	}

	@Test
	public void test3() {
		Cubik buildSolved = CubikFactory.buildSolved();
		String id = new _3().on(new _3i().on(buildSolved)).getId();
		assertEquals(buildSolved.getId(), id);
	}

	@Test
	public void test_0_1_1i_0i() {
		Cubik buildSolved = CubikFactory.buildSolved();
		_0 _0 = new _0();
		_1 _1 = new _1();
		_0i _0i = new _0i();
		_1i _1i = new _1i();

		Cubik cubik = buildSolved;
		System.out.println(cubik.getId());

		cubik = _0.on(cubik);
		System.out.println(cubik.getId());

		cubik = _1.on(cubik);
		System.out.println(cubik.getId());

		cubik = _1i.on(cubik);
		System.out.println(cubik.getId());

		cubik = _0i.on(cubik);
		System.out.println(cubik.getId());

	}

	@Test
	public void testRotacionsArestes0() {
		Cubik buildSolved = CubikFactory.buildSolved();
		Cubik rotated = new _0().on(buildSolved);
		Assert.assertTrue(ArestesComparator.rotate0(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate1(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate2(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate3(rotated, buildSolved));
	}

	@Test
	public void testRotacionsArestes0i() {
		Cubik buildSolved = CubikFactory.buildSolved();
		Cubik rotated = new _0i().on(buildSolved);
		Assert.assertTrue(ArestesComparator.rotate0(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate1(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate2(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate3(rotated, buildSolved));
	}

	@Test
	public void testRotacionsArestes1() {
		Cubik buildSolved = CubikFactory.buildSolved();
		Cubik rotated = new _1().on(buildSolved);
		Assert.assertFalse(ArestesComparator.rotate0(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate1(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate2(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate3(rotated, buildSolved));
	}

	@Test
	public void testRotacionsArestes1i() {
		Cubik buildSolved = CubikFactory.buildSolved();
		Cubik rotated = new _1i().on(buildSolved);
		Assert.assertFalse(ArestesComparator.rotate0(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate1(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate2(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate3(rotated, buildSolved));
	}

	@Test
	public void testRotacionsArestes2() {
		Cubik buildSolved = CubikFactory.buildSolved();
		Cubik rotated = new _2().on(buildSolved);
		Assert.assertFalse(ArestesComparator.rotate0(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate1(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate2(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate3(rotated, buildSolved));
	}

	@Test
	public void testRotacionsArestes2i() {
		Cubik buildSolved = CubikFactory.buildSolved();
		Cubik rotated = new _2i().on(buildSolved);
		Assert.assertFalse(ArestesComparator.rotate0(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate1(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate2(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate3(rotated, buildSolved));
	}

	@Test
	public void testRotacionsArestes3() {
		Cubik buildSolved = CubikFactory.buildSolved();
		Cubik rotated = new _3().on(buildSolved);
		Assert.assertTrue(ArestesComparator.rotate0(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate1(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate2(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate3(rotated, buildSolved));
	}

	@Test
	public void testRotacionsArestes3i() {
		Cubik buildSolved = CubikFactory.buildSolved();
		Cubik rotated = new _3i().on(buildSolved);
		Assert.assertTrue(ArestesComparator.rotate0(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate1(rotated, buildSolved));
		Assert.assertFalse(ArestesComparator.rotate2(rotated, buildSolved));
		Assert.assertTrue(ArestesComparator.rotate3(rotated, buildSolved));
	}
}
