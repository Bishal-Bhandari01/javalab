
public class Add{
	int addTwoNumbers(int x, int y){
		return x+y;
	}
}
public class Test {
	public static void main(String[] args){
		Add addObj = new Add();
		addObj.addTwoNumbers(20,30);
	}
}

class privateABC{
	private int num = 100;
	private int square(int a){
	return a*a;
}

public class TestPrivate{
	public static void main(String[] args){
		privateABC obj = new privateABC();
		System.out.println(obj.num);
		System.out.println(obj.square(10));
	}
}
public class Addition{
protected int addTwoNumbers(int a, int b){ return a+b;
}
}

//TestProtected.java

package hisPackage;
import myPackage.*;
class TestProtected extends Addition{
public static void main(String[] args){
TestProtected obj = new TestProtected();
System.out.println(obj.addTwoNumber(12,15));
}
}

//3.4 public access modifier
//Addition.java

package abcPackage;
public class Addition {
public int addTwoNumbers(int a, int b){
return a+b;
}
}

//Test.java

class Test{
public static void main(String[] args){
Addition obj = new Addition();
System.out.println(obj.addTwoNumbers(10,20))
}
}

public class QN36 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
