package decorator;

public class EncryptionDecorator extends DataSourceDecorator
{
    public EncryptionDecorator(IDataSource source) {
        super(source);
    }

    // TODO
    // Not implemented

    @Override
    public String readData() {
        return "Decoded: " + super.readData();
    }
}
