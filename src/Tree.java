/**
 * Created by gabkamabka on 2016.11.21..
 */
public class Tree extends Garden{
    protected String color;
    protected double currentWaterState;

    @Override
    public void needOfWater() {
        System.out.println("The" + " "  + this.color + " "+ "Tree"+ " " +"needs water");
    }

    @Override
    public void water() {
        if(this.currentWaterState < 10){
            double addWater = 10;
            this.currentWaterState = this.currentWaterState+ (addWater * 0.75);
            System.out.println(("The" + " "  + this.color + " "+ "Tree"+  " "+"doesnt " +"need water"));
        }else
            System.out.println("The" + " "  + this.color + " "+ "Tree"+ " " +"needs water");
    }
}
