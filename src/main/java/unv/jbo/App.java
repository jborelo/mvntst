package unv.jbo;
import org.apache.commons.lang.StringUtils;
/**
 * Hello world!
 *
 */
public class App 
{


public static void main(String[] args) {
		sayHello();
		sayHelloAgain();
	}

	public static void sayHello() {
		System.out.println("MyTest says hello!");
	}

	public static void sayHelloAgain() {
		System.out.println(StringUtils.swapCase("MyTest says hello again!"));
	}


}
