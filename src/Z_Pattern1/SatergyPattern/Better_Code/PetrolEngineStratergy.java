package Z_Pattern1.SatergyPattern.Better_Code;

public class PetrolEngineStratergy implements EngineStratergy{
    @Override
    public String getEngineType() {
        System.out.println("Petrol Engine");
        return "Petrol";
    }

    @Override
    public String getFuel() {
        System.out.println("Petrol Fuel is 30l");
        return "30l";
    }
}
