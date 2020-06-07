import java.util.Scanner;

class Main {

  public static void Arab(int num){
    String str = num + "";
    System.out.print("В арабском: ");
    int a, b, c, len = str.length();
    if(num == 1000) System.out.print("M");
    else
    {
      if(len == 3)
      {
        c = num % 1000 / 100;
      }
      else
      {
        c = 0;
      }
      if(c == 0){}
      else if(c > 4 && c < 9)
      {
        c = c - 5;
        System.out.print("D");
      }
      else if(c == 4) System.out.print("CD");
      else if(c == 9) System.out.print("CM");
      if(c < 4)
      {
        for(int i = 0; i < c; i++) System.out.print("C");
      }

      if(len >= 2) b = num % 100 / 10;
      else b = 0;
      if(b == 0){}
      else if(b > 4 && b < 9)
      {
        b = b - 5; 
        System.out.print("L");
      }
      else if(b == 4) System.out.print("XL");
      else if(b == 9) System.out.print("XC");
      if(b < 4)
      {
        for(int i = 0; i < b; i++) System.out.print("X");
      }
      a = num % 10;
      if(a == 0){}
      else if (a == 4) System.out.print("IV");
      else if(a > 4 && a < 9)
      {
        a = a - 5;
        System.out.print("V");
      }
      else if(a == 9) System.out.print("IX");
      if(a <= 3)
      {
        for(int i = 0; i < a; i++) System.out.print("I");
      }
    }
  }

  public static void Palin(int num2){
    String str2 = num2 + "", str = "";
    if(str2.length() == 1) System.out.print("Это число однозначное.");
    else
    {
      for(int i = str2.length()-1; i > -1; i--) str = str +  str2.charAt(i);
      int strn = Integer.parseInt(str);
      int str2n = Integer.parseInt(str2);
      if(strn == str2n) System.out.println("\n Это число палиндром.");
      else System.out.println("Это число не палиндром.");
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("№1");
    int num;
    do
    {
      System.out.println("Введите число: ");
      num = sc.nextInt();
    }
    while(num < 0 || num > 1000);
    Arab(num);
    System.out.println("\n№2");
    int num2;
    do
    {
      System.out.println("Введите число: ");
      num2 = sc.nextInt();
    }
    while(num2 < 0 || num2 > 999999);
    Palin(num2);
  }
}