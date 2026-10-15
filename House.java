public class House {
    private int floors;
    public House(int floors) {
        this.floors=floors;
    }
    public int getFloors() { return floors; }
    private String floorWord(int n) {
        int lastTwo=n%100;
        int lastOne=n%10;
        if (lastTwo>=11 && lastTwo<=14) return "этажами";
        if (lastOne==1) return "этажом";
        if (lastOne>=2 && lastOne<=4) return "этажами";
        return "этажами";
    }
    @Override
    public String toString() {
        return "дом с "+floors+" "+floorWord(floors);
    }
}
