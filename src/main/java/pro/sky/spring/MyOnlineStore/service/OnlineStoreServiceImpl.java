package pro.sky.spring.MyOnlineStore.service;

import org.springframework.stereotype.Service;
import pro.sky.spring.MyOnlineStore.model.Basket;

import java.util.Set;

@Service
public class OnlineStoreServiceImpl implements OnlineStoreService{

    private final Basket basket;
    public OnlineStoreServiceImpl(Basket basket){
        this.basket=basket;
    }
    @Override
    public String add(Set<Integer> orders) {
        basket.setItemsId(orders);
        return "Items are successfully added to the basket";
    }

    @Override
    public Set<Integer> get() {
        return basket.getItemsId();
    }
}
