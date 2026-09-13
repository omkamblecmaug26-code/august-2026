
public class Program {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.printParent();
		Child c1 = new Child();
		c1.printChild();
		
		Parent c2 = new Child();
		c2.printParent();
		
	}
}
