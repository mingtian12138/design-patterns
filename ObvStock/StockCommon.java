package ObvStock;

public class StockCommon extends AStockPrice{
    public StockCommon(String code){
        super(code);
    }
    @Override
    protected void notifyHolder() {
        System.out.println("普通股票更新了,code:"+code);
        for (IStockHolder iStockHolder:stockHolderList)
            iStockHolder.update(this);
        price2=price;
    }
}