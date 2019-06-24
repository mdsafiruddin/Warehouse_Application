package org.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_tab")
public class OrderMethod {
	@Id
	@GeneratedValue
	@Column(name="om_id")
	private Integer id;
	@Column(name="om_mode")
	private String mode ;
	@Column(name="om_code")
	private String code ;
	@Column(name="om_type")
	private String etype ;
	
	@Column(name="om_acpt")
	@ElementCollection(fetch=FetchType.EAGER)
	private List<String> accept ;
	@Column(name="om_note")
	private String note;
	
	
	
	public OrderMethod() {
		super();
	}



	public OrderMethod(Integer id) {
		super();
		this.id = id;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getMode() {
		return mode;
	}



	public void setMode(String mode) {
		this.mode = mode;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getEtype() {
		return etype;
	}



	public void setEtype(String etype) {
		this.etype = etype;
	}



	public List<String> getAccept() {
		return accept;
	}



	public void setAccept(List<String> accept) {
		this.accept = accept;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	@Override
	public String toString() {
		return "OrederMethod [id=" + id + ", mode=" + mode + ", code=" + code + ", etype=" + etype + ", accept="
				+ accept + ", note=" + note + "]";
	}
	
	


}
