package ObvStock;

public class StockFutures extends AStockPrice{
    public StockFutures(String code){
        super(code);
    }
    @Override
    protected void notifyHolder() {
        System.out.println("期货更新了,code:"+code);
        for (IStockHolder iStockHolder:stockHolderList)
            iStockHolder.update(this);
        price2=price;
    }
}