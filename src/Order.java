import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Order {
  static Scanner sc = new Scanner(System.in);
  static Output output = new Output();
  static String table = "";
  static HashMap<String, String> tablePrice = new HashMap<>(7);
  static String menuType = "";
  static String menuNumber = "";

  public static void Order() {
    output.Output();
    System.out.println("## 테이블을 선택하세요.");
    table = sc.next();
    tableCheck(table);
    menu();
    System.out.println("\n## 등록할 메뉴를 선택하세요.");
    menuType = sc.next();
    menuTypeCheck(menuType);
    System.out.println("\n## 메뉴의 수량을 입력하세요.");
    menuNumber = sc.next();
    menuNumberCheck(menuNumber);
    menuPrice(menuType);
  }
  public static void tableCheck(String table) {
      if (table.length() > 1) {
        throw new IllegalArgumentException("ERROR : 한자릿수만 입력 가능");
      }
      if (!Character.isDigit(table.charAt(0))) {
        throw new IllegalArgumentException("ERROR : 숫자만 입력 가능");
      }
      if (Integer.parseInt(table) < 1 || Integer.parseInt(table) > 8) {
        throw new IllegalArgumentException("ERROR : 1 ~ 8 만 입력 가능");
      }
  }
  public static void menu(){
    System.out.println(
        "[치킨] 1 - 후라이드 : 16000원\n" +
            "[치킨] 2 - 양념치킨 : 16000원\n" +
            "[치킨] 3 - 반반치킨 : 16000원\n" +
            "[치킨] 4 - 통구이 : 16000원\n" +
            "[치킨] 5 - 간장치킨 : 17000원\n" +
            "[치킨] 6 - 순살치킨 : 17000원\n" +
            "[음료] 21 - 콜라 : 1000원\n" +
            "[음료] 22 - 사이다 : 1000원");
  }
  public static void menuPrice(String menuType){
    switch (menuType){
      case "1" : tablePrice.put(table, (Integer.toString(16000*Integer.parseInt(menuNumber))));
        break;
      case "2" : tablePrice.put(table, (Integer.toString(16000*Integer.parseInt(menuNumber))));
        break;
      case "3" : tablePrice.put(table, (Integer.toString(16000*Integer.parseInt(menuNumber))));
        break;
      case "4" : tablePrice.put(table, (Integer.toString(16000*Integer.parseInt(menuNumber))));
        break;
      case "5" : tablePrice.put(table, (Integer.toString(17000*Integer.parseInt(menuNumber))));
        break;
      case "6" : tablePrice.put(table, (Integer.toString(17000*Integer.parseInt(menuNumber))));
        break;
      case "21" : tablePrice.put(table, (Integer.toString(1000*Integer.parseInt(menuNumber))));
        break;
      case "22" : tablePrice.put(table, (Integer.toString(1000*Integer.parseInt(menuNumber))));
        break;
    }
    System.out.println(tablePrice);
    }
  public static void menuTypeCheck(String menuNumber){
    if(menuNumber.length() == 1){
      if(!Character.isDigit(menuNumber.charAt(0))){
        throw new IllegalArgumentException("ERROR : 숫자만 입력 가능");
      }
      if(Integer.parseInt(menuNumber) < 1 || Integer.parseInt(menuNumber) > 6){
        throw new IllegalArgumentException("ERROR : 범위 초과");
      }
    } 
    if (menuNumber.length() == 2) {
      if(!Character.isDigit(menuNumber.charAt(0)) || !Character.isDigit(menuNumber.charAt(1))){
        throw new IllegalArgumentException("ERROR : 숫자만 입력 가능");
      }
      if(Integer.parseInt(menuNumber) < 21 || Integer.parseInt(menuNumber) > 22){
        throw new IllegalArgumentException("ERROR : 범위 초과");
      }
    }
    if(menuNumber.length() != 1 && menuNumber.length() != 2){
      throw new IllegalArgumentException("ERROR : 잘못된 입력");
    }
  }
  public static void menuNumberCheck(String menuNumber){
    for(int i = 0; i < menuNumber.length(); i++){
      if(!Character.isDigit(menuNumber.charAt(i))){
        throw new IllegalArgumentException("ERROE : 숫자만 입력 가능");
      }
    }
  }

  public static void paymentCompleted(String number){
    tablePrice.remove(number);
  }
  public static HashMap<String, String> getTablePrice() {return tablePrice; }
}
