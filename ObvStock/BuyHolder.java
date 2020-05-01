package ObvStock;

import java.util.ArrayList;
import java.util.List;

public class BuyHolder implements IStockHolder {

    private List<AStockPrice> attentionlist;
    private String name;
    public BuyHolder(String name)
    {
        attentionlist=new ArrayList<AStockPrice>();
    }

    @Override
    public void update(AStockPrice asp) {

    }

    @Override
    public void AddHolder(AStockPrice asp) {

    }
}
