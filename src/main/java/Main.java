import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        AvtoBaza avtoBaza = new AvtoBaza();
        System.out.println("#    |   Bus     |  Driver | State  ");
        System.out.println("+————+————————————+————————+—————————");
        avtoBaza.methodAvto();
        System.out.println("\n");


        System.out.println();
        Driver driver = new Driver();
        System.out.println("#   Driver           |  Bus");
        System.out.println("—+———————————————————+——————");
        driver.methodDriver();


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("choose one of the trucks");
            int input = sc.nextInt();
            sc.nextLine();
            System.out.println("#    |   Bus     |  Driver | State  ");
            System.out.println("+————+————————————+————————+—————————");
            avtoBaza.methodAvto();
            Condition condition = new Condition();
            System.out.println();
            System.out.println(" JETISHPEI KALDYM 3-ELE ETAP SORRY!!!!!!");

        }
    }
}