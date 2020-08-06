package scao22.financialhulu.services;

import scao22.financialhulu.domain.Item;

import java.util.List;

public interface ItemService {

    List<Item> listAll();

    Item getById(Long id);

}
