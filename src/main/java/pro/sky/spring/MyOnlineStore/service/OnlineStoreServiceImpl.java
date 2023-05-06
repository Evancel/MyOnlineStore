package pro.sky.spring.MyOnlineStore.service;

import org.springframework.stereotype.Service;
import pro.sky.spring.MyOnlineStore.model.Bucket;

import java.util.Set;

@Service
public class OnlineStoreServiceImpl implements OnlineStoreService{

    private final Bucket bucket;
    public OnlineStoreServiceImpl(Bucket bucket){
        this.bucket=bucket;
    }
    @Override
    public String add(Set<Integer> orders) {
        bucket.setItemsId(orders);
        return "Items are successfully added to the basket";
    }

    @Override
    public Set<Integer> get() {
        return bucket.getItemsId();
    }
}
