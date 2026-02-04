package com.oops.inheritance;

public class MethodOverriding {
	
	/*
	 * Why we need method Overriding and what it is..?
	 * 
	 * -   whenever the child class is not satisfying the parent class 
	 * 	   functionalities than go and create the same method in child class with
	 *     different behavior is the concept of method Overriding.
	 *     
	 * -	By using will get the re-usablity of the specification and will get the 
	 *  	flexibility.    
	 */
//   method overriding :  Method overriding means a child class provides its own implementation of a method that already exists in the parent class, 
//	           			  with the same method signature or specification.
	 
//							1. method signature is same but the implementation is different.
	
	
//	In java, we have 8 Rules for method Overriding.
	
	/*
	 * 1. method signature is same but the implementation is different.
	 *    - method signature means (method name + method arguments)
	 *    - Return type is not part of the  method signature
	 *    
	 * 2. - Return type of a method is same if it is primitive data types
	 *    - Return type of a method is same even the Object data types till java 1.4 
	 *      after 1.5 version java introduced the co-varient return types for the object data types only.
	 *
	 *      
	 *     Note: co-varient: In Java, co-variant return type means if the paret class return Object data types 
	 *    		 the the class must return same Object data types or sub type.
	 *       
	 *           but reverse of this is not possible 
	 *         
	 *         	 ex: P -> Number C -> Number or Double or Integer or any other sub classes from Number class
	 *          	P -> Object C -> String 
	 *          
	 *    
	 * 3. Method Scope should not be reduced.
	 *     - 1) if the parent class scope is public then the child class scope should be public.
	 *     - 2) if the parent class scope is protected the the child class scope should be protected or public
	 *     - 3) if the parent class scope is default then the  child class scope should be public or protected or default
	 *     - 4) if the parent class scope is private the the child class scope should be nothing and will got a compilation error
	 *          if we use @Override annotation
	 *   
	 * 4. if the method scope is private, we cannot access Parent to child.
	 *    Note: if the parent class method is private and 
	 *    if we write same method in the child class we won't get any compile time error.
	 *    
	 * 5. if method scope is static we cannot override
	 *    
	 * 6. if the method scope is final we cannot Override
	 *     - if the class scope is final all methods in the class is final
	 *     - if the class scope is final but the variables are not final
	 *     
	 * 7. It is related to Exception Handling 
	 *    - if the parent class method throws any Exception child class cannot be throws any Exception
	 *    - but if the child class method throws any Exception parent class must be throws same Exception or parent Exception.
	 *    
	 * 8. if the parent class is abstract class it contains the abstract methods and must need to Override the methods in child class
	 *    
	 */
	
	
	
}
