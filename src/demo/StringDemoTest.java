package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringDemoTest {
	private StringDemo str;
	@Before
	public void setUp() throws Exception {
		str = new StringDemo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"), "a");
		assertEquals("�ַ���ȫ�Ǵ�д",str.smallString("ABC"), "abc");
		assertEquals("����Сд���ַ���",str.smallString("aBc"), "abc");
		assertEquals("�������ֵ��ַ���",str.smallString("A1C"), "a1c");
		assertEquals("ȫ�����ֵ��ַ���",str.smallString("123"), "123");
		assertEquals("���������ַ��Ĵ���",str.smallString(",Adc"), ",adc");
		assertEquals("�쳣����",str.smallString(""), "error");

	}

}
