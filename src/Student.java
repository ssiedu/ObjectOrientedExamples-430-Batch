public class Student {
    private int rno;
    private String name;
    private int marks;
    
    public void printReportCard(){
        System.out.println("Roll No. : "+rno);
        System.out.println("Name     : "+name);
        System.out.println("Marks    : "+marks);
        if(marks>=33){
            System.out.println("Result : PASSED ");
        }else{
            System.out.println("Result : FAILED ");
        }
        System.out.println("_________________________________");
    }
    public void setData(int a, String b, int c){
        rno=a;
        name=b;
        marks=c;
    }
}
