package genricMethod;

import org.openqa.selenium.By;

public class DyanamicXpathGen {

	public static By email=By.xpath(createXpaths("//input[@id='{0}']", "test"));

	public static String createXpaths(String xpath,Object ...args)
	{
		for (int i = 0; i < args.length; i++) {
			xpath= xpath.replace("{"+i+"}", (CharSequence) args[i]);
		}

		return xpath;
	} 

	public static void main(String[] args) {

		String x1=createXpaths("//input[@id='{0}']", "test");
		System.out.println(x1);

		String x2=	createXpaths("//input[@id='{0}'and @name='{1}']", "email","username");
		System.out.println(x2);

		String x3=	createXpaths("//input[@id='{0}'and @name='{1}' and @type='{2}']", "email","username","text");
		System.out.println(x3);

		System.out.println(email);
		System.out.println(email.toString().substring(email.toString().indexOf("//")));
		
	}

}
