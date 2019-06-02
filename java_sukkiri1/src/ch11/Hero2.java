package ch11;

public class Hero2 {
    private String name;
    int money;
    static int money2;

    Hero2() {
//        this(100);
        this.name = "aaa";
    }

    //getter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnull");
        }
        if (name.length() <= 1){
            throw new IllegalArgumentException("名前が短い");
        }
        if (name.length() >= 8){
            throw new IllegalArgumentException("名前が長い");
        }
        this.name = name;
    }



}

