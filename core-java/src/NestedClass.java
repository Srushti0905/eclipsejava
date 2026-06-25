interface Nested{
	void sayHello();
}
public class NestedClass {
    class NestedInnerImp implements Nested{
	   @Override
	   public void sayHello() {
		   System.out.println("Hello from inner imp");
	   }
	   
   }
    public void anotherDemo() {
    	
    	 class NestedImp implements Nested{
    		   @Override
    		   public void sayHello() {
    			   System.out.println("Hello from nested imp");
    		   }
    		   
    	   };
    	   new NestedImp().sayHello();
    	
    }
    public static void main(String[] args) {
		
    	NestedClass demo = new NestedClass();
    	NestedInnerImp n1 = demo.new NestedInnerImp();
    	n1.sayHello();
    	demo.anotherDemo();
    	
    	Nested n = new Nested() {
    		@Override
    		public void sayHello() {
    			System.out.println("Gretting from anonymous inner class");
    		}
    	};
    	n.sayHello();
    	
    	Nested nest = () -> System.out.println("Hello from Lambda");
    	nest.sayHello();
    	
    	
	}
}
