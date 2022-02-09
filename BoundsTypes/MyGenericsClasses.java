public class MyGenericsClasses<Thing extends Number, Thing2 extends Number> {

    Thing x;
    Thing2 y;

    MyGenericsClasses(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing getValue() {
        return x;
    }

    public Thing2 getValue2() {
        return y;
    }
}