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



        }


