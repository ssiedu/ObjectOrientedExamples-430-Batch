
public class BankingApplication {

    public static void main(String[] args) {

        Account ac1=new Account(111,"AAA",10000);
        Account ac2=new Account(112,"BBB",20000);
        Account ac3=new Account(113,"CCC",30000);
        Account ac4=new Account(114,"DDD");
        
        /*
        ac1.setData(111, "AAA", 10000);
        ac2.setData(112, "BBB", 20000);
        ac3.setData(113, "CCC", 30000);
        ac4.setData(114, "DDD", 40000);
        */
        /*
        Account.showData(ac1);
        Account.showData(ac2);
        Account.showData(ac3);
        */
        
        ac1.showData();
        ac2.showData();
        ac3.showData();
        ac4.showData();
        
        /*
        Account.showAvg(ac1, ac2);
        Account.showAvg(ac1, ac2, ac3);
        Account.showAvg(ac1, ac2, ac3, ac4);
        */
        //ac1.showAvg(ac3);
        
        Account.showTotalCash();
      
    }
}
