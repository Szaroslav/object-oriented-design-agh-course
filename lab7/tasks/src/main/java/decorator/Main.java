package decorator;

public class Main
{
    public static void main(String[] args) {
        String data = "I hate naggers";
        IDataSource plain = new FileDataSource("output.txt");
        DataSourceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(new FileDataSource("output.txt"))
        );
        encoded.writeData(data);

        System.out.println("Data");
        System.out.println(data);
        System.out.println("Encoded");
        System.out.println(plain.readData());
        System.out.println("Decoded");
        System.out.println(encoded.readData());
    }
}
