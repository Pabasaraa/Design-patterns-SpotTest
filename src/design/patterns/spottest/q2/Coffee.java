package design.patterns.spottest.q2;

class Coffee extends Beverage {
    void brew() {
        System.out.println("Stripping coffie through filter.");
    }

    void addCondiments() {
        System.out.println("Add suger and milk..");
    }
}
