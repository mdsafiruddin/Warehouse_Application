package org.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uom_tab")
public class UomModule {
	@GeneratedValue
	@Id
	private Integer id;
	@Column(name="uType")
    private String uomType;
	@Column(name="uModel")
    private String uomModel;
	@Column(name="note")
    private String  note;
	
	
	
	public UomModule() {
		System.out.println("uom  object");
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUomType() {
		return uomType;
	}



	public void setUomType(String uomType) {
		this.uomType = uomType;
	}



	public String getUomModel() {
		return uomModel;
	}



	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	@Override
	public String toString() {
		return "UomModule [id=" + id + ", uomType=" + uomType + ", uomModel=" + uomModel + ", note=" + note + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
