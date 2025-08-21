package Z_Pattern1.SatergyPattern.Better_Code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PetrolEngineStratergy> cars = new ArrayList<>();
        cars.add(new PetrolEngineStratergy());
        for(PetrolEngineStratergy strat : cars){
            strat.getEngineType();
            strat.getFuel();
        }

        List<BatteryEngineStratergy> car = new ArrayList<>();
        car.add(new BatteryEngineStratergy());
        for(BatteryEngineStratergy cars1 : car){
            cars1.getEngineType();
            cars1.getFuel();
        }
    }
}
