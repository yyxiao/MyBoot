package com.xyy.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Title: ComplatZone.java 
 * entity Description: 区域管理实体
 * 
 * @author yangxia
 * @created 2017年9月15日 上午11:04:17
 */
@Entity
@Table(name = "COMPLAT_ZONE")
public class ComplatZone implements Serializable {
	private static final long serialVersionUID = -123448301699001298L;

	private String iid;
	private String name;
	private String pinyin;
	private String pid;
	private String orderId;
	private String codeId;
	private Integer type;

	public ComplatZone() {
	}

	public ComplatZone(String iid, String name, String pinyin, String pid, String orderId, String codeId,
                       Integer type) {
		super();
		this.iid = iid;
		this.name = name;
		this.pinyin = pinyin;
		this.pid = pid;
		this.orderId = orderId;
		this.codeId = codeId;
		this.type = type;
	}

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid.hex")
	@Column(name = "IID")
	public String getIid() {
		return iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PINYIN")
	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	@Column(name = "PID")
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	@Column(name = "ORDERID")
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Column(name = "CODEID")
	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}
