public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        if (this.volume > 0){
        this.volume -= 10;}
        return this.volume;
    }

    public int emptyBottle() {
        return this.volume = 0;
    }

    public int fillBottle() {
        return this.volume;
    }
}
