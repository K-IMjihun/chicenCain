import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static Order order = new Order();
  static Payment payment = new Payment();
  static boolean repaet = true;
  public static void main(String[] args) {
    while (repaet) {
      System.out.println("## 메인화면");
      System.out.println("1 - 주문등록");
      System.out.println("2 - 결제하기");
      System.out.println("3 - 프로그램 종료");
      System.out.println("\n## 원하는 기능을 선택하세요.");
      String input = sc.next();
      inputCheck(input);
    }
  }
    public static void inputCheck(String input){
    if(input.length() > 1){
      throw new IllegalArgumentException("ERROR : 한자릿수만 입력 가능");
    }
    if(!Character.isDigit(input.charAt(0))){
      throw new IllegalArgumentException("ERROR : 숫자만 입력 가능");
    }
    if(Integer.parseInt(input) < 1 || Integer.parseInt(input) > 3){
      throw new IllegalArgumentException("ERROR : 1 ~ 3 만 입력 가능\n");
    }
    input(input);
    }
    public static void input(String input){
    if(input.equals("1")){
      order.Order();
    }
    if(input.equals("2")){
      payment.payment();
    }
    if(input.equals("3")){
      repaet = false;
    }
    }

}