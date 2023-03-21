package design.patterns.spottest.q2;

abstract class Beverage {
    final void prepareRecepie() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water.");
    }

    void pourInCup() {
        System.out.println("Pour into cup.");
    }
}