public class Account {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;
    
    public void showTotalCash(){
        System.out.println("TOTAL CASH : " +totalCash);
    }
    public void setData(int a, String b, int c){
        ano=a;
        name=b;
        balance=c;
        totalCash=totalCash+c;
    }
    public void showData(){
        System.out.println("Account No. : "+ano);
        System.out.println("Cust NAme   : "+name);
        System.out.println("Balance Rs. : "+balance);
        System.out.println("___________________________________");
    }
}
