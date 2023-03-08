import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class jumpwater {

    public static void main(String[] args) {
        reword r1 = new reword();
        r1.total=0;
        r1.scroe=new double[7];
        r1.Arraylist=new double[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("输入成绩");
            r1.scroe[i] = sc.nextDouble();
        }
        Arrays.sort(r1.scroe);
        System.out.println("难度从1.2分到3.8分不等。" );
        do{
            r1.grade = sc.nextDouble();
            if(!(r1.grade>3.8||r1.grade<1.2)){
                System.out.println("请再次输入");
            }
        }while(r1.grade>3.8||r1.grade<1.2);

        for (int i = 1; i < 6; i++) {
            r1.total+=r1.scroe[i];
        }

        r1.Arraylist[r1.i]=r1.total* r1.grade;
        r1.i++;
        System.out.println(r1.Arraylist[r1.i-1]);
    }
}
class reword {
        double[] scroe;
        int i=0;
        double[] Arraylist;
        double grade;
        double total;
}

class Contact{
    String familyname;
    String name;
    String callnumber;
    String email;
    Contact(String familyname,String name,String callnumber,String email){
        this.name=name;
        this.callnumber=callnumber;
        this.email=email;
        this.familyname=familyname;
    }
    public void show(){
        System.out.println("姓"+this.familyname+"名"+this.name+"电话号码"+this.callnumber+"电子邮箱"+this.email);
    }
}
class hellogit{
    String first;
    public void show(){
        System.out.println("hello git 2");
        System.out.println("hello git 3");
        System.out.println("matser test");
    }
}