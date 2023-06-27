package decorator;

import java.io.*;

public class FileDataSource implements IDataSource
{
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        File file = new File(filename);
        try (OutputStream os = new FileOutputStream(file)) {
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(filename);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            if (reader.read(buffer) == -1)
                System.out.println("The end of the file stream has been reached");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (buffer == null)
            return null;
        return new String(buffer);
    }
}
