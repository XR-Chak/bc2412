package factory;
import furniture.Chair;
import furniture.Sofa;
import furniture.VictorianChair;
import furniture.VictorianSofa;

public class VictorianFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    return new VictorianSofa();
  }

}