package Week_1.Design_Patterns.Exercise2_FactoryMethodPatternExample;

public class FactoryMethodTest {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.openDocument();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.openDocument();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.openDocument();
    }
}