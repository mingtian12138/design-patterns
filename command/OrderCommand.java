package command;

public class OrderCommand implements Command {

    private  Operator receiver;
    private Order order;
    public OrderCommand(Operator receiver,Order order)
    {
        this.receiver=receiver;
        this.order=order;
    }
    @Override
    public void execute(){
        System.out.println(order.getID()+"顾客的成品");
        receiver.MarkFruit(order);
    }
}
