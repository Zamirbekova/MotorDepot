import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

    }
}