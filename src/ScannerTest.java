/*
1.导包：import java.util.Scanner;
2.Scanner的实例化:Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法（next() / nextXxx()），来获取指定类型的变量

注意：
需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，会报异常：InputMisMatchException
导致程序终止。
 */
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你芳龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重");
        int weight = scan.nextInt();
        System.out.println(weight);

        System.out.println("你是否相中我了呢？（ture/false)");
        boolean islove = scan.nextBoolean();
        System.out.println("islove");

    }
}
