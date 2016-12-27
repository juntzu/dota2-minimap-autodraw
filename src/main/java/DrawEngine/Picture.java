package DrawEngine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 27/12/2016.
 */
public class Picture implements Serializable{

    private List<int[][]> polygons = new ArrayList<int[][]>();

    String name;
    public Picture(String name){
        this.name = name;
    }

    public void addPolygon(int[]... array){
        polygons.add(array);
    }

    public List<int[][]> getPolygons(){
        return this.polygons;
    }

    public String toString(){
        return this.name;
    }
}
