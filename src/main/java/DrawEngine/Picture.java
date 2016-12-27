package DrawEngine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 27/12/2016.
 */
public class Picture implements Serializable{

    private List<int[][]> lines = new ArrayList<int[][]>();

    String name;
    public Picture(String name){
        this.name = name;
    }

    public void addLine(int[]... array){
        lines.add(array);
    }

    public List<int[][]> getLines(){
        return this.lines;
    }

    public String toString(){
        return this.name;
    }
}
