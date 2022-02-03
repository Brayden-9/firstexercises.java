import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入岳小朋的期末成绩；（0-100）");
        int score = scan.nextInt();
        if(score == 100){
            System.out.println("奖励一辆BMW");
        }else if (score > 80 && score <= 99){
            System.out.println("奖励一部手机");
        }else if (score >= 60 && score <=80){
            System.out.println("奖励一部ipad");
        }else{
            System.out.println("继续加油，现在什么奖励也没有");
        }
    }
}
