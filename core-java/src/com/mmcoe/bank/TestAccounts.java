//package com.mmcoe.bank;
//
//public class TestAccounts {
// public static void main(String[] args) {
//	
//
//   Accounts ac = new Accounts (5000);
//   System.out.println(ac);
//   
//   ac.withdraw(3000);
//   System.out.println(ac);
//   ac.withdraw(7000);
//   System.out.println(ac);
//   
//   ac.deposit(2000);
//   System.out.println(ac);
//   ac.deposit(5000);
//   System.out.println(ac);
// 
//}
//}
package com.mmcoe.bank;
public class TestAccounts {

    public static void main(String[] args) {

        Accounts ac = new Accounts(5000);
        System.out.println(ac); // Bal : 5000 OD: 10000
        
        try {
			ac.withdraw(50000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  // Developer->troubleshooting
			
			System.out.println(e);// logging-> audit system behavior
			System.out.println(e.getMessage());// End  user
		}
        


    }
}