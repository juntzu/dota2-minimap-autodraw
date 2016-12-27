package PictureFileIO;

import java.io.IOException;
import java.rmi.ServerError;

/**
 * Created by Chris on 27/12/2016.
 */
public class ObjectWriter {

    Serialiser serialiser = new Serialiser();
    ByteReaderWriter byteWriter = new ByteReaderWriter();
    public ObjectWriter(){}

    public Object readFile(String path) throws IOException, ClassNotFoundException{
        byte[] bytes = byteWriter.read(path);
        return serialiser.deserialise(bytes);
    }

    public void writeFile(Object object, String path) throws IOException{
        byte[] bytes = serialiser.serialise(object);
        byteWriter.write(bytes, path);
    }
}
