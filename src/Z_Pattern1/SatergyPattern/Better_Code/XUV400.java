package Z_Pattern1.SatergyPattern.Better_Code;

public class XUV400 extends Car{

    public EngineStratergy engine;

    public XUV400(){}
    public XUV400( BatteryEngineStratergy strategy) {
        this.engine = strategy;
    }

    public void getInfo() {
        this.engine.getEngineType();
        this.engine.getFuel();
    }
}
