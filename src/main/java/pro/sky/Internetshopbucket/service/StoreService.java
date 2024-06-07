package pro.sky.Internetshopbucket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.Internetshopbucket.Basket;
import pro.sky.Internetshopbucket.Item;
import pro.sky.Internetshopbucket.ItemStore;

import java.util.List;

@Service
@SessionScope
public class StoreService {

    private final ItemStore itemStore;
    private Basket basket = new Basket();

    public StoreService(ItemStore itemStore) {
        this.itemStore = itemStore;
    }

    public void add (List<Integer> ids) {
        basket.add(ids.stream()
                        .map(id -> itemStore.get(id))
                        .toList()
                );
    }

    public List<Item> get() {
        return basket.get();
    }
}
