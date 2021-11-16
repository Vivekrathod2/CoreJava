package www.raystech.java;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SplitString {
public static void main(String[] args) {
	String name = "Learning Pattern";
	String[] s = name.split("g");
	for(String b: s)
	{
		System.out.println(b);
	}
}
}
