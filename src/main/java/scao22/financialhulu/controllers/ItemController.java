package scao22.financialhulu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import scao22.financialhulu.services.ItemService;

@Controller
public class ItemController {
    private ItemService itemService;

    @Autowired
    public void setItemService(ItemService itemService) { this.itemService = itemService; }

    @RequestMapping("/")
    public String redirToList() {return "redirect:/item/list"; }

    @RequestMapping({"/item/list", "/item"})
    public String listItems(Model model){
        model.addAttribute("items", itemService.listAll());
        return "item/list";
    }
}
