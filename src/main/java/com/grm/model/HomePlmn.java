package com.grm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REF_HOME_PLMN_CODE")
public class HomePlmn {
	@Id
	private String plmnCode;
	
	@Column(name = "SERVING_BID")
	private Long servingBid;
	
	@Column(name = "UTC_OFFSET")
	private Long utcOffset;
	
	@Column(name = "IAC_1")
	private String iac1;
	
	@Column(name = "CC_1")
	private String cc1;
	
	@Column(name = "PLMN_DESC")
	private String plmnDescription;
	
	@Column(name = "LOCAL_CURRENCY")
	private String localCurrency;
	
	@Column(name = "LOCAL_UNITS_PER_SDR")
	private Long localUnitsPerSdr;
	
	@Column(name = "CLEARINGHOUSE_ID")
	private String clearingHouseId;

	public String getPlmnCode() {
		return plmnCode;
	}

	public void setPlmnCode(String plmnCode) {
		this.plmnCode = plmnCode;
	}

	public Long getServingBid() {
		return servingBid;
	}

	public void setServingBid(Long servingBid) {
		this.servingBid = servingBid;
	}

	public Long getUtcOffset() {
		return utcOffset;
	}

	public void setUtcOffset(Long utcOffset) {
		this.utcOffset = utcOffset;
	}

	public String getIac1() {
		return iac1;
	}

	public void setIac1(String iac1) {
		this.iac1 = iac1;
	}

	public String getCc1() {
		return cc1;
	}

	public void setCc1(String cc1) {
		this.cc1 = cc1;
	}

	public String getPlmnDescription() {
		return plmnDescription;
	}

	public void setPlmnDescription(String plmnDescription) {
		this.plmnDescription = plmnDescription;
	}

	public String getLocalCurrency() {
		return localCurrency;
	}

	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}

	public Long getLocalUnitsPerSdr() {
		return localUnitsPerSdr;
	}

	public void setLocalUnitsPerSdr(Long localUnitsPerSdr) {
		this.localUnitsPerSdr = localUnitsPerSdr;
	}

	public String getClearingHouseId() {
		return clearingHouseId;
	}

	public void setClearingHouseId(String clearingHouseId) {
		this.clearingHouseId = clearingHouseId;
	}

	@Override
	public String toString() {
		return "HomePlmn [plmnCode=" + plmnCode + ", servingBid=" + servingBid + ", utcOffset=" + utcOffset + ", iac1="
				+ iac1 + ", cc1=" + cc1 + ", plmnDescription=" + plmnDescription + ", localCurrency=" + localCurrency
				+ ", localUnitsPerSdr=" + localUnitsPerSdr + ", clearingHouseId=" + clearingHouseId + "]";
	}

}
