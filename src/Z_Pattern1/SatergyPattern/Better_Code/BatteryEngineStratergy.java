package Z_Pattern1.SatergyPattern.Better_Code;

public class BatteryEngineStratergy implements EngineStratergy{
    @Override
    public String getEngineType() {
        System.out.println("Battery Engine");
        return "Battery";
    }

    @Override
    public String getFuel() {
        System.out.println("Battery percentage 30%");
        return "30%";
    }
}
