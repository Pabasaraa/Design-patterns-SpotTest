package design.patterns.spottest.q1;

public class KitchenLight implements Light {
    @Override
    public void on() {
        System.out.println("Switch on() Kitchen Light");
    }

    @Override
    public void off() {
        System.out.println("Switch off() Kitchen Light");
    }
}
