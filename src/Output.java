import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Output {
  static Order order = new Order();
  static List<String> list1 = new ArrayList<>();
  static List<String> list2 = new ArrayList<>();
  static List<String> list3 = new ArrayList<>();
  public void Output() {
    for(int i = 1; i < 8; i++){
      list1.add(" - ");
      list2.add(Integer.toString(i));
      if(order.getOrderTable().contains(Integer.toString(i))){
        list3.add(i - 1, " # ");
      }
      else{
        list3.add(" - ");
      }

    }
    System.out.println("## 테이블 목록");
    System.out.println(list1.stream().collect(Collectors.joining("┓┏","┏","┓")));
    System.out.println(list2.stream().collect(Collectors.joining(" || ","| "," |")));
    System.out.println(list3.stream().collect(Collectors.joining("┛┗","┗", "┛")));
    System.out.println();
    init();
  }
  public static void init(){
    list1.clear();
    list2.clear();
    list3.clear();
  }
}
