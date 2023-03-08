import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Contact> contacts=new ArrayList<>();
        /*
        System.out.println("请输入姓");
        String familyname=sc.toString();
        System.out.println("请输入名");
        String name=sc.toString();
        System.out.println("请输入电话号码");
        String callnumber=sc.toString();
        System.out.println("请输入电子邮箱");
        String email=sc.toString();
         */
        for(int i=0;i<5;++i){
            contacts.add(new Contact("family"+i,"name"+i,"namecallnumber"+i,"email"+i));
        }
        for (Contact er:contacts
        ) {er.show();
        }
    }

}
