package com.mmcoe.ds;

public class TestDataStructures {

//  LINKED LIST
//  public static void main(String[] args) {
//      LinkedList<Integer> list = new LinkedList<Integer> ();
//      list.add(10);
//      list.add(20);
//      list.add(30);
////        list.add(40);
////        list.add(50);
//
//      list.insert(2,25);
//      list.insert(0, 5);
//      list.insert(2, 15);
//      list.insert(5, 20);
////        
//      list.remove(4);
//      list.remove(0);
//
//      list.remove(4);
//      list.add(50);
//
//      list.print();
//  }

//  BINARY TREE

    public static void main(String[] args) {

//        BinaryTree bt = new BinaryTree();
//
//        bt.add(50);
//        bt.add(30);
//        bt.add(70);
//        bt.add(20);
//        bt.add(40);
//        bt.add(60);
//        bt.add(80);
//
//        bt.traverse();
//BinaryTree tree = new BinaryTree();
//		
//		tree.add(20);
//		tree.add(10);
//		tree.add(30);
//		tree.add(50);
//		tree.add(40);
//		
//		tree.traverse();
//    
    	
    	
    	Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack Elements:");
        st.print();
        System.out.println("Popped Element : " + st.pop());
        System.out.println("Stack After Pop:");
        st.print();
   }
    	
    	
}