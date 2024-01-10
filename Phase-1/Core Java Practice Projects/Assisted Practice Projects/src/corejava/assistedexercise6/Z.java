package corejava.assistedexercise6;
//child class
public class Z extends Y {
	   public void methodZ()
	   {
	     System.out.println("class Z method");
	   }
	   public static void main(String args[])
	   {
	     Z obj = new Z();
	     obj.methodX(); //calling grand parent class method
	     obj.methodY(); //calling parent class method
	     obj.methodZ(); //calling local method
	  }

}
