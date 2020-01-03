
public class Student {

    int rno;    
    String name;    
    int marks;
    static int tp, tf;
    
    public void showOverallResult(){
        System.out.println("TOTAL PASSED CANDIDATES : "+tp);
        System.out.println("TOTAL FAILED CANDIDATES : "+tf);
        System.out.println("___________________________________");
    }
    public void showReportCard(){
        System.out.println("Roll Number  : "+rno);
        System.out.println("Name of Stud : "+name);
        System.out.println("Marks Scored : "+marks);
        if(marks>=33){
            System.out.println("Result    : PASSED");
            tp++;
        }else{
            System.out.println("Result    : FAILED");
            tf++;
        }
        System.out.println("______________________________");
    }
    public void setData(int a, String b, int c){
        rno=a;
        name=b;
        marks=c;
    }

    public static void main(String[] args) {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        
        s1.setData(111,"AAA",60);
        s2.setData(112, "BBB", 80);
        s3.setData(113, "CCC", 30);
        
        s1.showReportCard();
        s2.showReportCard();
        s3.showReportCard();
        
        s3.showOverallResult();
        
    }

}
