import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;
import java.math.*;

public class InputTest
{
    public static void main(String[] args) throws IOException
    {
                        /**打印时间*/
      /*  System.out.printf("%1$s %2$tB %2$te, %2$tY\n", "Due date:\n", new Date());
        System.out.printf("%tc\n", new Date());
     */
                        /**读取文件（没搞明白）*/
       /* Scanner sn= new Scanner(Paths.get("C:\\Users\\PC\\Desktop\\animation.txt"),"UTF-8");
        PrintWriter out=new PrintWriter("C:\\Users\\PC\\Desktop\\animation.txt","UTF-8");
                         */
                        /**打印数字（规定格式）*/
       /* System.out.printf("%10.2f\n",10000.0/3);
                         */
                        /**打印过程中使用定义的对象*/
       /*  String name="xz";int age=18;
       String message = String.format("Hello, %s. Next year, you'll be %d", name , age);
                         */
                        /**If的使用*/
        /*    Scanner in=new Scanner(System.in);
        String performance;
        System.out.println("How much is your target?");
        int target=in.nextInt();
        System.out.println("How about your Sales?");
        int yourSales=in.nextInt();
        int bonus;

  if (yourSales >= 2 * target) {
        performance = "Excellent";
        bonus = 1000;
        System.out.println(performance+"!Your bonus is "+bonus+".");
    }
else if (yourSales >= 1.5 * target) {
            performance = "Fine";
            bonus = 500;
        System.out.println(performance+"!Your bonus is "+bonus+".");
        }
else if (yourSales >= target) {
            performance = "Satisfactory";
            bonus = 100;
        System.out.println(performance+"!Your bonus is "+bonus+".");
        }
else {
            System.out.println("You're fired");

        } */
                         /**While的使用*/
/*
      Scanner in =new Scanner(System.in);
      System.out.print("How much RMB do you need to retire? ");
      double goal = in.nextDouble();
      System.out.print("How much money will you contribute every year?");
      double payment=in.nextDouble();
      System.out.print("Interest rate in %: ");
      double interestRate=in.nextDouble();
      double balance =0;
      int years=1;
      while(balance<goal)
      {
          balance += payment;
          double interest=balance * interestRate/100;
          balance+=interest;
          years++;
      }
      System.out.println("You can retire in " +years+"years.");*/
                          /**do while 的使用*/
    /*  Scanner in =new Scanner(System.in);
      System.out.println("How much money will you contribute every year? ");
        double payment = in.nextDouble();
        System.out.println("Interest rate in % :");
        double interestRate=in.nextDouble();
        double balance=0;
        int years=1;
        String input;
      do {

          balance += payment;
          balance+=balance*interestRate/100;
          years++;
          System.out.println(balance);
          System.out.println("Can this be enough? (Y/N)");
          input=in.next();

      }
      while (input.equals("N"));
      years+=1;
System.out.println("It may need "+years+" years.");
     */
                         /** for的使用*/
/*Scanner in=new Scanner(System.in);
double balance=0;
System.out.println("How much RMB do you need to retire?");
double target=in.nextDouble();
System.out.println("How much money will you contribute every year?");
double payment= in.nextDouble();
System.out.println("Interest rate in %:");
double InterestRate=in.nextDouble();
System.out.println("In how many years do you want to retire?");
int years=in.nextInt();
for(int i=1;i<=years;i++)
{
    balance+=payment;
    balance=balance*(1+InterestRate/100);
}
if (balance<target)
{
    String message=String.format("What a pity!You can't retire in %d years. がんばって!",years);
    System.out.println(message);
}
else
{
    String message =String.format("Well done.You can fulfill your goal.Glad for you!");
    System.out.println(message);
}*/
                     /**计算中奖概率（for）*/
/*        Scanner in =new Scanner(System.in);
        System.out.print("How many numbers do you need to draw?");
        int k=in.nextInt();
        System.out.print("What is the highest number you can draw?");
        int n=in.nextInt();
        /*
         *compute binomial coefficient n*(n-1)*(n-2)*…*（n-k+1)/(1*2*3*…*k)
         */
/*      long lotteryOdds=1;
        for(int i=1;i<=k;i++)
            lotteryOdds=lotteryOdds*(n-i+1)/i;
        System.out.println("Your odds are 1 in "+lotteryOdds+".Good luck!");
*/
                     /**switch的使用*/
/*    Scanner in=new Scanner(System.in);
    System.out.print("Select an option (1,2,3,4)");
    int choice=in.nextInt();
    switch (choice) {
        case 1:
            //......
            break;
        //......
        default:
            //bad input
            //...
            break;
    }

 */
                   /**break中断控制流程*/
/*    while (year<=100)
    {
        balance+=payment;
        double interest=balance*interestRate/100;
        balance+=interest;
        if(balance>=goal)break;
        years++;
    }
    //OR
    while(years<=100&&balance<goal)
    {
        balance+=payment;
        double interest =balance*interestRate/100;
        balance+=interest;
        if(balance<goal)
            years++;
    }

 */
                    /** BigInteger中奖*/
/*    Scanner in=new Scanner(System.in);
    System.out.print("How many numbers do you need to draw?");
    int k=in.nextInt();
    System.out.print("What is the highest number you can draw?");
    int n=in.nextInt();
    BigInteger lotteryOdds=BigInteger.valueOf(1);
    for (int i=1;i<=k;i++)
        lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
    System.out.println("Your odds are 1 in"+lotteryOdds+".Good luck!");

 */
                    /**数组*/
/*    int[] a=new int[100];
    for(int i=0;i<100;i++)
    {
        a[i] = i;
        System.out.println(a[i]);
    }
    String[] names=new String[10];
    for(int i=0;i<10;i++) names[i]="";

 */
                    /**for each循环*/
/*    int[] a=new int[100];
    for(int i=0;i<100;i++)
    {
        a[i] = i;
        System.out.println(a[i]);
    }for (int element : a)
        System.out.println(element);

  //或者是  System.out.println(Arrays.toString(a));
 */
                   /**数组初始化以及匿名数组*/
/*    int[] smallPrimes={2,3,5,7,11,13};
    smallPrimes=new int[] {17,19,23,29,31,37}; //利用匿名数组对smallPrimes重新初始化
     //以下为简写模式
     int[] anonymous={17,19,23,29,31,37};
     smallPrimes=anonymous;
     //另
     int[] Zero=new elementType[0];   //创建长度为0的数组
 */
                   /**研究命令行参数*/

    }
}







