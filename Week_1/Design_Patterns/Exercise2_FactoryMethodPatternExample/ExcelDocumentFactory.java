package Week_1.Design_Patterns.Exercise2_FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
