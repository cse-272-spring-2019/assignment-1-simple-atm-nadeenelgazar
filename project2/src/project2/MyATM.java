package project2;

public class MyATM implements ATM {
	 private String currentBalance="0";
	 private int addedAmount;
	 private int withdrawedAmount;
	int cnt=0;
	String []ar=new String[5];
	int cnt2;
	
	public void setcnt2(int cnt2) {
		this.cnt2=cnt2;
	}
	
	public String getCurrentBalance()
	{
		return currentBalance;
	}
	
	public void withdraw(String amount) {
		int intamount=Integer.parseInt(amount);
		 int currentBalanced=Integer.parseInt(currentBalance);
        currentBalanced=currentBalanced-intamount;
		this.currentBalance=Integer.toString(currentBalanced);
		if(cnt>4)
		   {
			for(int i=0;i<4;i++)
			    ar[i]=ar[i+1];
			cnt=cnt-1;
				}
		
		ar[cnt]=String.join("-","withdraw", amount);
		cnt2=cnt;
		cnt++;
	}

	
	public void deposit(String amount) {
		int intamount=Integer.parseInt(amount);
		int currentBalanced=Integer.parseInt(currentBalance);
		currentBalanced=currentBalanced+intamount;
		this.currentBalance=Integer.toString(currentBalanced);
		if(cnt>4)
		   {
			for(int i=0;i<4;i++)
			    ar[i]=ar[i+1];
			cnt=cnt-1;	
		   }
		
		ar[cnt]=String.join("-","deposit", amount);
	cnt2=cnt;
	cnt++;


		
	}

	public String prev() {
		String transaction="empty";
		if(cnt2>0 && ar[cnt2-1]!=null) 
		{
			transaction=ar[cnt2-1];
			cnt2--;
			//return transaction;
		}
			else if(cnt2==0 && ar[cnt2]!=null)
			{
				
				transaction=ar[cnt];
				//return transaction;

			}
		
		return transaction;		
	}

	
	public String next() {
		String transaction="empty";
		
	      
	     if(cnt2<4 && ar[cnt2+1]!=null)
	     	{
	    	 transaction=ar[cnt2+1];
	    	 cnt2++;
	     	}
		else if(cnt2==4 && ar[cnt2]!=null)
		{
			transaction=ar[cnt2];
		}
	    return transaction; 
	}


}
