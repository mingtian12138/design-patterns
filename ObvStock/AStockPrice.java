package ObvStock;


import java.util.ArrayList;
import java.util.List;

public abstract class AStockPrice {
    protected float price,price2;
    protected String code;
    protected List<IStockHolder> stockHolderList;

    public void Add(IStockHolder Ish)
    {
        stockHolderList.add(Ish);
    }
    public void remove(IStockHolder Ish)
    {
        stockHolderList.remove(Ish);
    }
    public AStockPrice(String code)
    {
        this.code=code;
        price=price2=0;
        stockHolderList=new ArrayList<IStockHolder>();
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price)
    {
        this.price=price;
        notifyHolder();
    }
    abstract protected void notifyHolder();
    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + ( stockHolderList != null ?  stockHolderList.hashCode() : 0);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        AStockPrice other =(AStockPrice) obj;
        if(code == null){
            if(other.code != null)
                return false;
        }else if (!code.equals(other.code))
            return false;
        return true;
    }
    public float getPrice2(){
        return price2;
    }
    public void setPrice2(float price2) {
        this.price2 = price2;
    }
}
