package Z_Pattern1.SatergyPattern.Better_Code;

public class XUV700 extends Car {

    public EngineStratergy engine;

    public XUV700(){}
    public XUV700(PetrolEngineStratergy strategy) {
        this.engine = strategy;
    }

    public void getInfo() {
        this.engine.getEngineType();
        this.engine.getFuel();
    }
}
