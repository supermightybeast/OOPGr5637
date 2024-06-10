import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;


public class App {
    public static void main(String[] args) throws Exception {

        List<Product> ourList = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lay's");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);
        Product item4 = new HotDrink(75, 4, "Coffe", 201, 65);
        Product item5 = new HotDrink(150, 5, "Latte", 202, 70);
        Product item6 = new HotDrink(140, 46, "Cappuccino", 203, 60);
        ourList.add(item1);
        ourList.add(item2);
        ourList.add(item3);
        ourList.add(item4);
        ourList.add(item5);
        ourList.add(item6);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, ourList, disp);

        for(Product prod: venMachine.getProducts())
        {
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize();

        //System.out.println(MainFrame);
    }
}