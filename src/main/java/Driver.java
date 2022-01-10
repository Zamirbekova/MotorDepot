import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Driver {
    private int  id;
    private String name;


    public Driver(int  id, String name) {
        this.id = id;
        this.name = name;
    }
    public Driver() {
    }

    public int  getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void methodDriver() throws IOException {
        String str1 = new String(Files.readAllBytes(Paths.get("C:\\Users\\User\\IdeaProjects\\MotorDepot\\src\\main\\java\\etap2.json")));
        JSONArray jsonArray1 = new JSONArray(str1);
        Driver[] drives = new Driver[jsonArray1.length()];
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
