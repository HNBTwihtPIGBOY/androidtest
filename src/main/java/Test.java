import java.util.ArrayList;
import java.util.Scanner;

/*
编写一个程序，使用参数类型为Contact的ArrayList来存储联系人数据库。
Contact类应该存储联系人的姓和名、电话号码和电子邮件地址。添加适当的访问方法和突变方法。
您的数据库程序应该提供一个菜单，允许用户添加一个联系人、显示所有联系人、
搜索一个特定的联系人并显示它，或者搜索一个特定的联系人并让用户选择删除它。
搜索应该找到任何实例变量包含目标搜索字符串的联系人。例如，如果搜索目标是“elmore”，
那么任何名字、姓氏、电话号码或电子邮件地址中包含“elmore”的联系人都应该返回显示或删除。
使用“for-each”循环遍历数组列表。
 */
public class Test {
    public static void main(String[] args) {

        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        System.out.println("0：关闭");
        System.out.println("1：添加一个联系人");
        System.out.println("2：显示所有联系人");
        System.out.println("3：搜索一个特定的联系人并显示它");
        System.out.println("4：搜索一个特定的联系人并让用户选择删除它");
        System.out.println("5：搜索应该找到任何实例变量包含目标搜索字符串的联系人。例如，如果搜索目标是“elmore”，\n" +
                "那么任何名字、姓氏、电话号码或电子邮件地址中包含“elmore”的联系人都应该返回显示或删除。");
        System.out.println("6：使用“for-each”循环遍历数组列表。");
        ArrayList<Contact> contacts=new ArrayList<>();
        i=sc.nextInt();
        while(i!=0){
            switch (i){
                case 1:
                    System.out.println("请输入姓");
                    String familyname=sc.toString();
                    System.out.println("请输入名");
                    String name=sc.toString();
                    System.out.println("请输入电话号码");
                    String callnumber=sc.toString();
                    System.out.println("请输入电子邮箱");
                    String email=sc.toString();
                    contacts.add(new Contact(familyname,name,callnumber,email));
                    break;
                case 2:
                    for (Contact er:contacts
                         ) {er.show();
                    }
                    break;
                case 3:
                    String choesename;
                    System.out.println("请输入你要查询的人的姓名");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    for (Contact er:contacts
                    ) {er.show();
                    }
                    break;
                default:
                    System.out.println("请重新输入");
            }
            i=sc.nextInt();
        }


    }
}
