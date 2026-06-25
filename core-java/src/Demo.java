//
//public class Demo {
//  private Object data;
//
//  public Demo(Object data) {
//	this.data = data;
//  }
//
//  public Object getData() {
//	return data;
//  }
//
//  public void setData(Object data) {
//	this.data = data;
//  }
//  
//  public static void main(String[] args) {
//	Demo d1 = new Demo("Hola");
//	System.out.println(d1.getData());
//	
//	Demo d2 = new  Demo(3.14);
//	System.out.println(d2.getData());
//	
//	Demo d3 = new Demo(new Person("Arya",22));
//	System.out.println(d3.getData());
//}
//}

// generic classes

public class Demo<T> {

    private T data;

    public Demo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {

        Demo<String> d1 = new Demo<String>("hello");
        System.out.println(d1.getData());

        Demo<Double> d2 = new Demo<Double>(3.14);
        System.out.println(d2.getData());
    }
}

  