package demo;

public class StringDemo {
	public StringDemo() {
	}

	public Object smallString(String str)// �ַ�����Сд
	{
		Object temp = "error";
		if (str.equals("") || str == null)
		{
			return temp;
		}
		Object s = str.toLowerCase();
		return s;
	}
}
