import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String str=new String(Files.readAllBytes(Paths.get("C:\\Users\\User\\IdeaProjects\\MotorDepot\\src\\main\\java\\etap1.json")));
        JSONArray jsonArray=new JSONArray(str);
        AvtoBaza[]avtoBazas=new AvtoBaza[jsonArray.length()];
            System.out.println("#    |   Bus     |  Driver | State  ");
            System.out.println("# ———+————————————+—————————+—————————");
        for (int i = 0; i < jsonArray.length(); i++) {
            avtoBazas[i] = new AvtoBaza();
            String string = jsonArray.get(i).toString();
            JSONObject jsonObject1 = new JSONObject(string);

            avtoBazas[i].setId(jsonObject1.getInt("id"));
            avtoBazas[i].setName(jsonObject1.getString("name"));
            avtoBazas[i].setState(jsonObject1.getString("state"));
        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print(avtoBazas[i].getId());
            System.out.printf("  %16s ",avtoBazas[i].getName());
            System.out.printf("  %12s"," On "+avtoBazas[i].getState());

        }


        String str1 = new String(Files.readAllBytes(Paths.get("C:\\Users\\User\\IdeaProjects\\MotorDepot\\src\\main\\java\\etap2.json")));
        JSONArray jsonArray1 = new JSONArray(str1);
        Driver[] drives = new Driver[jsonArray1.length()];
        System.out.println();
        System.out.println("#   Driver           |  Bus");
        System.out.println("—+———————————————————+——————");

        for (int i = 0; i < drives.length; i++) {

            drives[i] = new Driver();
            String string = jsonArray1.get(i).toString();
            JSONObject jsonObject = new JSONObject(string);
            drives[i].setId(jsonObject.getInt("id"));
            drives[i].setName(jsonObject.getString("name"));

        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print(drives[i].getId());
            System.out.printf("%10s", drives[i].getName());

        }

    }
}