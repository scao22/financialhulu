package scao22.financialhulu.bootstrap;

import com.amazonaws.services.s3.model.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import scao22.financialhulu.repositories.ItemRepository;
import scao22.financialhulu.services.AmazonS3ClientService;

import java.util.List;


@Component
public class BootStrapData implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public BootStrapData(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Autowired
    AmazonS3ClientService s3Services;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");
        System.out.println("Items: " + itemRepository.count());
        System.out.println("Buckets: " + s3Services.listAll());
        System.out.println("Folder Name: " + s3Services.getFolderName());

    }
}
