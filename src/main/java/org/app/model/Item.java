package org.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_tab")
public class Item {
      @Id
      @GeneratedValue
      @Column(name="item_id")
	private Integer id;
      
      @Column(name="code")
	private String itemCode;
      @Column(name="widht")
	private Double itemWidth;
      
      @Column(name="lenght")
	private Double itemLen;
      @Column(name="hieght")
	private Double itemHeight;
      
      @Column(name="cost")
	private Double baseCost;
      @Column(name="currency")
    private  String baseCurrency;
    
    
public Item() {
	System.out.println("item object ");
}




public Integer getid() {
	return id;
}




public void setid(Integer id) {
	this.id= id;
}




public String getItemCode() {
	return itemCode;
}




public void setItemCode(String itemCode) {
	this.itemCode = itemCode;
}




public Double getItemWidth() {
	return itemWidth;
}




public void setItemWidth(Double itemWidth) {
	this.itemWidth = itemWidth;
}




public Double getItemLen() {
	return itemLen;
}




public void setItemLen(Double itemLen) {
	this.itemLen = itemLen;
}




public Double getItemHeight() {
	return itemHeight;
}




public void setItemHeight(Double itemHeight) {
	this.itemHeight = itemHeight;
}




public Double getBaseCost() {
	return baseCost;
}




public void setBaseCost(Double baseCost) {
	this.baseCost = baseCost;
}




public String getBaseCurrency() {
	return baseCurrency;
}




public void setBaseCurrency(String baseCurrency) {
	this.baseCurrency = baseCurrency;
}




@Override
public String toString() {
	return "Item [baseCost=" + baseCost + ", baseCurrency=" + baseCurrency + ", itemCode=" + itemCode + ", itemHeight="
			+ itemHeight + ", id=" + id + ", itemLen=" + itemLen + ", itemWidth=" + itemWidth + "]";
}

  
}
