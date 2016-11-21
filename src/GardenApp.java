/**
 * Created by gabkamabka on 2016.11.21..
 */
public class GardenApp {
    public static void main(String[] args) {
        Flower a = new Flower();
        Flower b = new Flower();
        Tree c = new Tree();
        Tree d = new Tree();

        a.color = "blue";
        b.color = "yellow";
        c.color = "puple";
        d.color = "orange";

        a.currentWaterState = 4;
        b.currentWaterState= 3;
        c.currentWaterState = 11;
        d. currentWaterState = 12;

        b.needOfWater();
        a.needOfWater();
        c.needOfWater();
        d.needOfWater();

        System.out.println();
        System.out.println("Watering with 40");

        b.water();
        a.water();
        c.water();
        d.water();


        System.out.println();
        System.out.println("Watering with 70");
      
    }




}
