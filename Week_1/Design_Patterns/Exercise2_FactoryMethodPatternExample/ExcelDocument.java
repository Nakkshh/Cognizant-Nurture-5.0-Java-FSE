package Week_1.Design_Patterns.Exercise2_FactoryMethodPatternExample;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Microsoft Excel Document.");
    }
}