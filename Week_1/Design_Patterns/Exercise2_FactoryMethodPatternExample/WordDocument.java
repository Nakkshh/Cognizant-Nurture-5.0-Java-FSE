package Week_1.Design_Patterns.Exercise2_FactoryMethodPatternExample;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Microsoft Word Document.");
    }
}