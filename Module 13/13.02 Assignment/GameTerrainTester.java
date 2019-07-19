 /**
 * Tests the various classes in this project
 *
 * @author Bhaskar Mishra
 * @version 9/5/2018
 */
import java.util.ArrayList;

public class GameTerrainTester{
    public static void main(String[] args){
        ArrayList<Terrain> terrains = new ArrayList<Terrain>(6);
        terrains.add(new Terrain(150, 240));
        terrains.add(new Forest(400, 400, 180));
        terrains.add(new Mountain(600, 200, 12));
        terrains.add(new WinterMountain(500, 500, 30, 12.34));
        terrains.add(new Ocean(500, 600, 700));
        terrains.add(new IcyOcean(900, 900, 1800, 80));
        for(int i = 0; i < terrains.size(); i++){
            System.out.println(terrains.get(i).toString());
        }
    }
}
