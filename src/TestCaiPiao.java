/*
彩票游戏
假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。

1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。

提示：使用Math.random() 产生随机数
Math.random() 产生[0,1)范围的随机值
Math.random() * 90：[0,90)
即；Math.random() * 90 + 10：[10,100) 即得到  [10,99]
使用(int)(Math.random() * 90  + 10)产生一个两位数的随机数
 */
import java.util.Scanner;
public class TestCaiPiao {
    public static void main(String[] args){
        int number = (int)(Math.random()*90 + 10);
        int numberShi = number / 10;
        int numberGe = number % 10;

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个两位数");
        int guess = input.nextInt();

        int guessShi = guess / 10;
        int guessGe = guess % 10;

        if(number == guess){
            System.out.println("奖金10000美金");
        }else if(numberShi  == guessGe && numberGe == guessShi){
            System.out.println("奖金3000美元");
        }else if(numberShi == guessShi || numberGe == guessGe){
            System.out.println("奖金1000美元");
        }else if (numberShi == guessGe || numberGe == guessShi){
            System.out.print("奖金500美元");
        }else{
            System.out.println("抱歉 您没有中将");
        }
        System.out.println("中奖号码是；" + number);
    }
}
