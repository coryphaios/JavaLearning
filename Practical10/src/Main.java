public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Dumbledore", 3, 3,"fire");
        Mage mage2 = new Mage("Volan De Morte", 2, 3,"ice");
        System.out.println(mage1.getInfo());
        System.out.println(mage2.getInfo());
        System.out.println(Mage.fight(new Mage("Volan De Morte", 2, 3,"ice")));
    }
}