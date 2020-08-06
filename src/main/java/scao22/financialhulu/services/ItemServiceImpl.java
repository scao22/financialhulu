package scao22.financialhulu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scao22.financialhulu.domain.Item;
import scao22.financialhulu.repositories.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements scao22.financialhulu.services.ItemService {

    private scao22.financialhulu.repositories.ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(scao22.financialhulu.repositories.ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> listAll() {
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    @Override
    public Item getById(Long id) { return itemRepository.findById(id).orElse(null); }


}
