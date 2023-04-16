public class Main {
    public static void main(String[] args) {
        Player wizard1 = new Wizard(10, 100, "high", "magic stick", 23, "Air");
        Player warrior1 = new Warrior(5, 100, "middle", "sword", "metal");
        System.out.println("Wizard full info:");
        System.out.println(wizard1.getFullInfo());
        wizard1.levelUp();
        System.out.println("Level up 1");
        wizard1.doDamage();
        System.out.println("Do damage 10");
        System.out.println("Wizard full info:");
        System.out.println(wizard1.getFullInfo());
        System.out.println("Warrior full info:");
        System.out.println(warrior1.getFullInfo());
        warrior1.levelUp();
        warrior1.levelUp();
        warrior1.levelUp();
        System.out.println("Warrior full info:");
        System.out.println(warrior1.getFullInfo());
    }
}