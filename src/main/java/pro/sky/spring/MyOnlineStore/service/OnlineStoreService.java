package pro.sky.spring.MyOnlineStore.service;

import java.util.Set;

public interface OnlineStoreService {
    String add(Set<Integer> orders);
    Set<Integer> get();
}
