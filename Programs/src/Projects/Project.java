package Projects;

class Project {

	public static void main(String[] args) {
	   
	   //ATM
	   BankAtm obj1 = new BankAtm();
       obj1.main(args);
       Ithree1  nn = new Ithree1();
	   float wamount = nn.amount1;
	   System.out.println("\nAvaiable cash in hand: " + wamount);
	   
	   System.out.println("\nGoing to wine shop..");
	   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   System.out.println("Reached..");
	   
	    //Wines
	    Don obj=new Don();
	    obj.main(args);
	    float wineamm =  obj.fina;
	    System.out.println("Total amount in wine shop: " + wineamm);
	    
	    float bal= wamount - wineamm;
	    System.out.println("Remaining balance in your hand " + bal);
	    System.out.println("*************************");
	    
	    System.out.println("\nNow going to pan Shop");
	    try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println("Reached pan shop..");
	    
	    //Pan Shop
	    PanShop objp = new PanShop();
	    objp.main(args);
	    float panAmm = objp.ptotal;
	    System.out.println("Total ammount in pan shop: " + panAmm);
	    
	    
	    
	    float pbal= bal - panAmm;
	    System.out.println("Remaining balance in your hand " + pbal);
	    
	    
	}

}