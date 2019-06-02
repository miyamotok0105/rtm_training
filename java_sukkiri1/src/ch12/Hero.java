package ch12;

public class Hero extends AbstHero implements IHero {
    public void dance() {
        System.out.println("dance!");
    }

    @Override
    public void attack(String  attackName) {
        System.out.println("overrided attack! " + attackName);
    }

    @Override
    public void greed() {
        System.out.println("greed");
    }
}

