package decorator;

public class DataSourceDecorator implements IDataSource
{
    private final IDataSource wrappee;

    public DataSourceDecorator(IDataSource source) {
        wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
