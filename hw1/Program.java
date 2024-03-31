import java.util.ArrayList;
import java.util.List;

public class Program {
public static void main(String[] args) {
HotDrinksVendingMachine drink1 = new HotDrinksVendingMachine();
drink1.setName("Чай");
drink1.setTemperature(100);

VedingMachine vendingMachine1 = new VedingMachine();
List<HotDrinksVendingMachine> productList = new ArrayList<>();
productList.add(drink1);
vendingMachine1.initProduct(productList);
System.out.println(vendingMachine1.getProduct("Чай"));
}
}

