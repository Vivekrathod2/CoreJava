package Collection;
/*
Set - HashSet ---> LinkedHashSet
|
NavigableSet
|
SortedSet
|
TreeSet
*/
// Set -- no duplicate object
//HashSet - no insertion order
// LinkedHashSet - Insertion order

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetEx {
public static void main(String[] args) {
	HashSet<Integer> hs = new HashSet<Integer>();
	hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(10);
   
    System.out.println("date of hashSet :"+hs);
    
    LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	lhs.add(10);
    lhs.add(20);
    lhs.add(30);
    lhs.add(10);
    
    System.out.println("date of LinkedhashSet :"+lhs);
 
    
    TreeSet<Integer> ths = new TreeSet<Integer>();
	ths.add(100);
    ths.add(20);
    ths.add(10);
    ths.add(10);
    
    System.out.println("date of TreehashSet :"+ths);
 
}
}