public class firstexercises {
   public static void main(String[] args){
       int num1 = 10,
           num2 = 25,
           num3 = -20;
       int max;
       if(num1 >= num2 & num2 >= num3){
           max = num1;
       }else if(num2 >= num1 & num2 >= num3){
           max = num2;
       }else{
           max = num3;
       }
       System.out.println("三个数的最大值为；" + max);

   }
}
