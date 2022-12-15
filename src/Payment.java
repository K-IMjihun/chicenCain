import java.util.Scanner;

public class Payment {
  static Output output = new Output();
  static Order order = new Order();
  public static void payment(){
    output.Output();
    Scanner sc = new Scanner(System.in);
    System.out.println("## 테이블을 선택하세요.");
    String table = sc.next();
    tableCheck(table);
    tablepay(table);
  }
  public static void tableCheck(String table){
    if(!order.getOrderTable().contains(table)){
      throw new IllegalArgumentException("ERROR : 올바르지 않은 테이블 번호입니다");
    }
  }
  public static void tablepay(String table){
    System.out.println("## 최종 결제할 금액");
    System.out.println(order.getTablePrice()[Integer.parseInt(table)-1] + "원\n");
  }
}
