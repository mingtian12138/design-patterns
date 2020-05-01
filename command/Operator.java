package command;

public class Operator {
    public void MarkFruit(Order order) {
        String string="";
        for(String key:order.getFruitMap().keySet()){
            string+=key+order.getFruitMap().get(key).toString();
        }
        System.out.println("黑暗混合汁"+string);
    }
}
