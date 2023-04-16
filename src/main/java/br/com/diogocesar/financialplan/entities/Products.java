package br.com.diogocesar.financialplan.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity()
@Table(name = "products", schema = "public")
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_seq")
    @SequenceGenerator(name = "products_seq", sequenceName = "products_seq", allocationSize = 1)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "supplier_id")
    private Long supplierId;

    // Com essa anotação o campo não é persistido no BD
    // @Transient
    // private Long categoryId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties("products")
    private Categories categories;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    @Column(name = "unit_price")
    private Double unitPrice;

    @Column(name = "units_in_stock")
    private Long unitsInStock;

    @Column(name = "units_on_order")
    private Long unitsOnOrder;

    @Column(name = "reorder_level")
    private Long reorderLevel;

    @Column(name = "discontinued")
    private Integer discontinued;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategory(Categories category) {
        this.categories = category;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Long unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Long getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Long unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Long getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Long reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Integer getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Integer discontinued) {
        this.discontinued = discontinued;
    }

    
    
}

