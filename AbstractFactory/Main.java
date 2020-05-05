package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        //要想获得产品，先要获得具体工厂
        FruitFactory ff=new NorthFruitFactory();
        Fruit apple=ff.getApple();
        Fruit banana=ff.getBanana();
        apple.get();
        banana.get();

        FruitFactory ff2=new SouthFruitFactory();
        Fruit apple1=ff2.getApple();
        Fruit banana1=ff2.getBanana();
        apple1.get();
        banana1.get();

        FruitFactory ff3=new GreenHouseFruitFactory();
        Fruit apple2=ff3.getApple();
        Fruit banana2= ff3.getBanana();
        apple2.get();
        banana2.get();

    }
}
