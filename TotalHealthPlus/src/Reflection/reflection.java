package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import Keywords.Keywords;

public class reflection {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 
		Class c = Keywords.class;
		
		Method[] allMethods = c.getDeclaredMethods();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Method Name : ");
		String methodName = sc.next();
		
		for (Method method : allMethods) {
			if(method.getName().endsWith(methodName))
			{
				method.invoke(new Keywords());
			}
		}
	}

}
