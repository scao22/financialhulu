package scao22.financialhulu.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long item_id;
    private Long user_id;
    private String item_name;
    private String purchase_date;
    private String created_date;
    private String item_comments;
    private Long category_id;
    private Long bank_id;
    private BigDecimal amount;

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getPurchase_date() {
        return purchase_date.substring(0,10);
    }

    public void setPurchase_date(String purchase_date) { this.purchase_date = purchase_date; }

    public String getCreated_date() {
        return created_date.substring(0,10);
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getItem_comments() {
        return item_comments;
    }

    public void setItem_comments(String item_comments) {
        this.item_comments = item_comments;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Long getBank_id() {
        return bank_id;
    }

    public void setBank_id(Long bank_id) {
        this.bank_id = bank_id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
