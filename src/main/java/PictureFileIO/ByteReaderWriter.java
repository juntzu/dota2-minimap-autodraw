package PictureFileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * Created by Chris on 27/12/2016.
 */
public class ByteReaderWriter {

    public ByteReaderWriter(){}

    public void write(byte[] bytes, String filePath) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    public byte[] read (String filePath) throws IOException{
        Path path = Paths.get(filePath);
        return Files.readAllBytes(path);
    }
}
