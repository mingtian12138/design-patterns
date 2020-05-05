package AbstractFactory;

public class GreenHouseFruitFactory implements FruitFactory {
    public Fruit getApple(){
        return new GreenHouseApple();
    }

    public Fruit getBanana(){
        return new GreenHouseBanana();
    }
}
