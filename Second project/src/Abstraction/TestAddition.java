package Abstraction;

public class TestAddition extends Addition {
public static void main(String[] args) {
	TestAddition t = new TestAddition();
	t.add(8, 15);
}

@Override
public void add(int a, int b) {
	// TODO Auto-generated method stub
	System.out.println(a+b);
}
}
