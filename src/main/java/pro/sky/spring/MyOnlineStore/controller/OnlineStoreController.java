package pro.sky.spring.MyOnlineStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.spring.MyOnlineStore.service.OnlineStoreService;

import java.util.Set;

@RestController
@RequestMapping("order/")

public class OnlineStoreController {
    private final OnlineStoreService storeService;
    public OnlineStoreController(OnlineStoreService storeService){
        this.storeService=storeService;
    }

    @GetMapping("/add")
    public String addItems(@RequestParam (name = "id")Set<Integer> items_id){
        return storeService.add(items_id);
    }

    @GetMapping("/get")
    public Set <Integer> getItems(){
        return storeService.get();
    }
}
