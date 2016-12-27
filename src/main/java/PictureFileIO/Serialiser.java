package PictureFileIO;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.io.*;

/**
 * Created by Chris on 27/12/2016.
 */
public class Serialiser {

    public Serialiser(){}

    public byte[] serialise(Object object) throws IOException{
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutput output = null;
            output = new ObjectOutputStream(byteArrayOutputStream);
            output.writeObject(object);
            output.flush();
            byte[] bytes = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return bytes;
    }

    public Object deserialise(byte[]bytes) throws IOException, ClassNotFoundException{
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInput input = null;
        input = new ObjectInputStream(byteArrayInputStream);
        Object object = input.readObject();
        if(input!=null){
            input.close();
        }
        return object;
    }
}
