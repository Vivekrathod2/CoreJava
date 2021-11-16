package www.raystech.java;

public class String77 {
public static void main(String[] args) {
	String n = "Vijay Dinanath Chouhan";
	
	System.out.println("7th character:" +n.charAt(6));
	System.out.println("Index of Alok:"+n.indexOf("Dina"));
	System.out.println("1 # pos of i:"+ n.indexOf ("i"));
	System.out.println("Last position of i:" + n.lastIndexOf("i"));
	System.out.println("a is replaced by b :"+n.replace("a", "b"));
    System.out.println("Lower Name :"+n.toLowerCase());
    System.out.println("Upper Name :"+n.toUpperCase());
    System.out.println("Starts With Vijay :"+n.startsWith("Vijay"));
    System.out.println("Dinanath name :" +n.substring(6));
}}