package pro.sky.spring.MyOnlineStore.model;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope
public class Bucket {
    private final Set<Integer> itemsId;

    public Bucket() {
        itemsId = new HashSet<>();
    }

    public Set<Integer> getItemsId() {
        return itemsId;
    }

    public void setItemsId(Set<Integer> newItems) {
        itemsId.addAll(newItems);
    }
}
