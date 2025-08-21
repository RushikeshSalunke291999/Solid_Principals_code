package Z_Pattern1.SatergyPattern.problematic_Code;

public class XUV400 extends Car implements BatteryEngine{
    @Override
    public String getBattery() {

        System.out.println("Some Battery");
        return "Some Battery";
    }
}
