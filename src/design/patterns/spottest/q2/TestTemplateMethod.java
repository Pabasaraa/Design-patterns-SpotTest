package design.patterns.spottest.q2;

public class TestTemplateMethod {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecepie();
        System.out.println("================");
        Beverage coffee = new Coffee();
        coffee.prepareRecepie();
    }
}
