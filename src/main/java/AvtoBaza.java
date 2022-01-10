import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AvtoBaza {
    Driver driver;
    private int id;
    private String name;
    private String state;

    public AvtoBaza(int id, String name, String state,Driver driver) throws IOException {
        this.id = id;
        this.name = name;
        this.state = state;
        this.driver=driver;
    }

    public AvtoBaza() throws IOException {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Driver driver(Driver driver) {
        return driver;
    }

    public void setDriver(Driver driver){

    }
    public void methodAvto() throws IOException {
        String str = new String(Files.readAllBytes(Paths.get("C:\\Users\\User\\IdeaProjects\\MotorDepot\\src\\main\\java\\etap1.json")));
        JSONArray jsonArray = new JSONArray(str);
        AvtoBaza[] avtoBazas = new AvtoBaza[jsonArray.length()];

        for (int i = 0; i < jsonArray.length(); i++) {
            avtoBazas[i] = new AvtoBaza();
            String string = jsonArray.get(i).toString();
            JSONObject jsonObject1 = new JSONObject(string);

            avtoBazas[i].setId(jsonObject1.getInt("id"));
            avtoBazas[i].setName(jsonObject1.getString("name"));
            avtoBazas[i].setState(jsonObject1.getString("state"));
        }
        for (int i = 0; i < avtoBazas.length; i++) {
            System.out.println();
            System.out.print(avtoBazas[i].getId());
            System.out.printf("  %16s ", avtoBazas[i].getName());
            System.out.printf("  %12s", " On " + avtoBazas[i].getState());

        }
    }
    }