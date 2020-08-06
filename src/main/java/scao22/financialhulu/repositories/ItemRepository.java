package scao22.financialhulu.repositories;

import org.springframework.data.repository.CrudRepository;
import scao22.financialhulu.domain.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
