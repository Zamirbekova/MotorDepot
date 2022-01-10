import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class Condition implements  User {


    @Override
    public void changeDriver(AvtoBaza avtoBaza, Driver driver) {
        if (avtoBaza.getState().equals("base")) {
            avtoBaza.setDriver(driver.getName());
            avtoBaza.setDriver(driver.getName());
        } else if (avtoBaza.getState().equals("route")) {
            System.out.println("Driver is already on the road!!!");
        } else {
            System.out.println("You can't change the driver!!!");
        }
    }

    @Override
    public void startDriving(AvtoBaza avtoBaza) {
        if (avtoBaza.getState().equals("base")) {
            if (avtoBaza.getName() != null) {
                avtoBaza.setState("route");
                System.out.println("Driver is on road successfully!");
            } else {
                System.out.println("There is no driver!!!");
            }

        } else if (avtoBaza.getState().equals("route")) {
            System.out.println("Driver is already on the road!!!");
        } else {
            Random random = new Random();
            int rnd = random.nextInt(2);
            if (rnd == 0) {
                avtoBaza.setState("route");
                System.out.println("Your car is on route");
            } else {
                avtoBaza.setState("base");
                System.out.println("Your car is in base");
            }
        }
    }

    @Override
    public void startRepair(AvtoBaza avtoBaza) {
        if(avtoBaza.getState().equals("base")){
            avtoBaza.setState("repair");
            System.out.println("Yor car is in repairing!!!");
        }else if(avtoBaza.getState().equals("route")){
            avtoBaza.setState("repair");
        }else{
            System.out.println("Your car is already in repair!!!");
        }

    }
}
