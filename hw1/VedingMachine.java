import java.util.List;

public class VedingMachine {
    private List<HotDrinksVendingMachine> productList;

void initProduct(List<HotDrinksVendingMachine> a){
productList = a;
}

HotDrinksVendingMachine getProduct(String name){
for (int i = 0; i < productList.size(); i++){
if(name.equals(productList.get(i).getName())){
return productList.get(i);
}
}
return null;
}
}
