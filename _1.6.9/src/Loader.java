public class Loader {
    public static void main(String[] args) {
        String str = "Hi!";
        Dog Dog1 = new Dog();
        System.out.printf("Вес кошки N1: %.2f %n", Dog1.getWeight());
        Dog1.feed(200.0);
        Dog1.woof();
        System.out.printf("Вес кошки N1 после кормежки: %.2f %n", Dog1.getWeight());
    }
}
