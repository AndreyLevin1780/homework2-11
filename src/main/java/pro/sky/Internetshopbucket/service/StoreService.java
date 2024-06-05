package pro.sky.Internetshopbucket.service;

import org.springframework.stereotype.Service;
import pro.sky.Internetshopbucket.Basket;
import pro.sky.Internetshopbucket.Item;
import pro.sky.Internetshopbucket.ItemStore;

import java.util.List;

@Service
public class StoreService {

    public final ItemStore itemStore;
    private final Basket basket;

    public StoreService(ItemStore itemStore, Basket basket) {
        this.itemStore = itemStore;
        this.basket = basket;
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
