import org.json.JSONObject;

public class AvtoBaza {
    private int id;
    private String name;
    private String state;

    public AvtoBaza(int id, String name, String state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public AvtoBaza() {
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


    }

