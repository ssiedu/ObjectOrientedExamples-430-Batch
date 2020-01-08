public class Account {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;
    
    public Account(int x, String y){
        ano=x;
        name=y;
    }
    public Account(int a, String b, int c){
        //ano=a;
        //name=b;
        this(a,b);
        balance=c;
        totalCash=totalCash+c;
    }
    
    public  static void showAvg(Account tmp1, Account tmp2, Account tmp3, Account tmp4){
        //we want to compute avg balance of 3 accounts
        System.out.println("Avg of 4 : "+(tmp1.balance+tmp2.balance+tmp3.balance+tmp4.balance)/4);
    }
    public  static void showAvg(Account tmp1, Account tmp2, Account tmp3){
        //we want to compute avg balance of 3 accounts
        System.out.println("Avg of 3 : "+(tmp1.balance+tmp2.balance+tmp3.balance)/3);
    }
    public static void showAvg(Account tmp1, Account tmp2){
        //we want to compute avg balance of two accounts.
        System.out.println("AVg of 2 : "+(tmp1.balance+tmp2.balance)/2);
    }
    
    public static void drawLine(int n){
        for(int i=1;i<=n;i++){
            System.out.print("_");
        }
    }
    public static void showTotalCash(){
        System.out.println("TOTAL CASH : " +totalCash);
    }
    
    public void setData(int a, String b, int c){
        //initializing data members of an account
        ano=a;
        name=b;
        balance=c;
        //managing the total cash of bank.
        totalCash=totalCash+c;
    }
    public void showData(){
        System.out.println("Account No. : "+ano);
        System.out.println("Cust NAme   : "+name);
        System.out.println("Balance Rs. : "+balance);
        System.out.println("___________________________________");
    }
}
