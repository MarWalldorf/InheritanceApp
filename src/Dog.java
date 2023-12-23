public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    public Dog(String name, int brain, int size, int weight, int eyes, int legs, int tail) {
        super(name, brain, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }



    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }
}
