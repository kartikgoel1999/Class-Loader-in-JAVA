import java.util.*;
class Demo
{
}
class Test1 
{
	public static void main(String[] args) 
	{
		System.out.println("For String Class :: Loader Is :: "+String.class.getClassLoader());//bootstrap==>null
		System.out.println("Demo Class :: Loader Is :: "+Demo.class.getClassLoader());
		System.out.println("For Test1 Class :: Loader Is :: "+Test1.class.getClassLoader());
	}
}
