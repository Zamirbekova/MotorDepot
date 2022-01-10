import java.io.IOException;
import java.util.Objects;

public class Condition  implements  User{


    @Override
    public void changeDriver(AvtoBaza avtoBaza,Driver driver) {

        if (avtoBaza.getState().equals("base")) {
            avtoBaza.setDriver(driver);

        }
    }
    @Override
    public void startDriving(AvtoBaza avtoBaza) {

    }

    @Override
    public void startRepair(AvtoBaza avtoBaza) {

    }
}