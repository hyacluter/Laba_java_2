public class House {
    private int floors;
    public House(int floors) {
        this.floors=floors;
    }
    public int getFloors() { return floors; }
    private String floorWord(int n) {
        int lastTwo=n%100;
        int lastOne=n%10;
        if (lastTwo>=11) return "этажами";
        if (lastOne==1) return "этажом";
        return "этажами";
    }
    @Override
    public String toString() {
        return "дом с "+floors+" "+floorWord(floors);
    }
}
