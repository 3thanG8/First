//import java.util.Scanner;
//public class Main
//{
//  public static void main(String[]args)
//  {
//    int num1 = 5;
//    double num2 = 0.5;
//    System.out.println((double) num1/num2);
//    
//    System.out.println("Hello, world");
//    System.out.println("I am your computer");
//  
//    int Health;
//    Health = 20;
//    System.out.println("HP:" + Health);
//    
//    double Damage = 2.5;
//    System.out.println("DMG:" + Damage);
//    
//    final boolean Hazards = true;
//    System.out.println("Hazards:" + Hazards);
//    
//    double buff = Damage + 0.25;
//    System.out.println("Buffed DMG:" + buff);
//    
//    double debuff = 0.35;
//    System.out.println("Debuffed DMG:" + (Damage - debuff));
//    
//    double onFireDMG = Health * 0.02;
//    System.out.println("Health after Burn:" +(Health - onFireDMG));
//    
//    try 
//    {
//      System.out.println(1/0);
//    }
//    catch(ArithmeticException e)
//    {
//      System.out.println(e);
//    } 
//    
//    System.out.println("What's your name?");
//    Scanner scan = new Scanner(System.in);
//    String name = scan.nextLine();
//    System.out.println("Let's being your adventure " + name);
//    scan.close();
//   
//    Scanner number = new Scanner(System.in);
//    System.out.println("Number 1: ");
//    int number1 = number.nextInt();
//    
//    Scanner num = new Scanner(System.in);
//    System.out.println("Number 2: ");
//    int number2 = num.nextInt();
//    number.close();
//    num.close();
//    try
//    {
//      System.out.println(number1*number2/0);
//    }
//    catch(ArithmeticException a)
//    {
//      System.out.println(a);
//    }
//    int overflow = Integer.MAX_VALUE;
//    System.out.println(overflow + 1);
//    for(int i = 0;i <= 2;i++){System.out.println(i);
//    }
//  }
//}

//public class Main
//{
//  public static void main(String[] args)
//  {
//    Enemy slime = new Enemy();
//    
//    double playerHP = 100.0;
//    int playerDMG = 10;
//    
//    System.out.println("You encounter a slime!");
//    System.out.println("It has " + slime.hpLeft() + " HP");
//    System.out.println("It has " + slime.dmgPOW() + " DMG");
//    
//    playerHP -= slime.atk();
//    System.out.println("You have " + playerHP + " HP left");
//    
//    System.out.println("You fight back!");
//    System.out.print("The slime has " + (slime.hpLeft() - (double) playerDMG) + " HP left");
//  }
//}

public class Main {
  public static void main(String[] args) {
    Keyboard board1 = new Keyboard("steel", "blue", 115.0);

   board1.getKeyboard();
  
    
    Keyboard board2 = new Keyboard("steel", "red");
   board2.getKeyboard();  
  }
}
    
