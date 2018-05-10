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
		assertEquals("一个字母变小写",str.smallString("A"), "a");
		assertEquals("字符串全是大写",str.smallString("ABC"), "abc");
		assertEquals("含有小写的字符串",str.smallString("aBc"), "abc");
		assertEquals("含有数字的字符串",str.smallString("A1C"), "a1c");
		assertEquals("全是数字的字符串",str.smallString("123"), "123");
		assertEquals("含有特殊字符的处理",str.smallString(",Adc"), ",adc");
		assertEquals("异常处理",str.smallString(""), "error");

	}

}
