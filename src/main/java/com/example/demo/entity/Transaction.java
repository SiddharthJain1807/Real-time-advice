package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RTTA_REMITTANCE_TBL")
public class Transaction {
	
	//Branch Details - Common
	@Id
	@Column(name = "SRL_NUM")
	private Integer srlNum;
	
	@Column(name = "INDICATOR")
	private String indicator;
	
	@Column(name = "IN_OUT_IND")
	private String in_out_ind;
	
	@Column(name = "CUST_EMAIL")
	private String custEmail;
	
	@Column(name = "PROCESS_STATUS")
	private String processStatus;
	
	@Column(name = "BR_ID")
	private String brID;
	
	@Column(name = "BR_NAME")
	private String brName;
	
	@Column(name = "BR_ADDR_1")
	private String brAddr1;
	
	@Column(name = "BR_ADDR_2")
	private String brAddr2;
	
	@Column(name = "BR_ADDR_3")
	private String brAddr3;
	
	@Column(name = "BR_CITY")
	private String brCity;
	
	@Column(name = "BR_STATE")
	private String brState;
	
	@Column(name = "BR_PIN_CODE")
	private String brPinCode;
	
	@Column(name = "COLLECTION_ID")
	private String collectionId;
	
	@Column(name = "LODG_DATE")
	private String lodgDate;
	
	@Column(name = "PARTY_NAME")
	private String partyName;
	
	@Column(name = "PARTY_ADDR1")
	private String partyAddr1;
	
	@Column(name = "PARTY_ADDR2")
	private String partyAddr2;
	
	@Column(name = "PARTY_ADDR3")
	private String partyAddr3;
	
	@Column(name = "PARTY_CITY")
	private String partyCity;
	
	@Column(name = "PARTY_STATE")
	private String partyState;
	
	@Column(name = "PARTY_COUNTRY")
	private String partyCountry;
	
	@Column(name = "PARTY_PIN_CODE")
	private String partyPinCode;
	
	//Other Party Details - Dynamic
	@Column(name = "OTHER_PARTY_NAME")
	private String otherPartyName;
	
	@Column(name = "OTHER_PARTY_ADDR_1")
	private String otherPartyAddr1;
	
	@Column(name = "OTHER_PARTY_ADDR_2")
	private String otherPartyAddr2;
	
	@Column(name = "OTHER_PARTY_ADDR_3")
	private String otherPartyAddr3;
	
	@Column(name = "OTHER_PARTY_CITY")
	private String otherPartyCity;
	
	@Column(name = "OTHER_PARTY_STATE")
	private String otherPartyState;
	
	@Column(name = "OTHER_PARTY_COUNTRY")
	private String otherPartyCountry;
	
	@Column(name = "OTHER_PARTY_PIN_CODE")
	private String otherPartyPinCode;
	
	@Column(name = "PURPOSE_CODE")
	private String purposeCode;
	
	@Column(name = "PURPOSE_DESC")
	private String purposeCodeDesc;
	
	//Remit Transaction Details
	
	@Column(name = "REMIT_CRNCY")
	private String remitCrncy;
	
	@Column(name = "REMIT_AMT")
	private Long remitAmt;
	
	@Column(name = "RATE")
	private Float rate;
	
	@Column(name = "OPER_ACCT")
	private String operAcct;
	
	@Column(name = "OPER_ACCT_CRNCY")
	private String operAcctCrncy;
	
	@Column(name = "REMARKS_CHARGES")
	private String remarkCharges;
	
	@Column(name = "CHRG_CRNCY_CODE")
	private String chrgCrncyCode;
	
	@Column(name = "TTL_CHRG_COLL_AMT")
	private Float ttlChrgCollAmt;
	
	@Column(name = "VALUE_DATE")
	private String valueDate;
	
	@Column(name = "CHRG_OPER_ACCT")
	private Double chrgOperAcct;
	
	@Column(name = "CHRG_OPER_CRNCY")
	private String chrgOperCrncy;
	
	@Column(name = "PART_TRAN_TYPE")
	private String partTranType;
	
	@Column(name = "TRAN_AMT")
	private Double tranAmt;

	
	//Getter Setter
	public Integer getSrlNum() {
		return srlNum;
	}

	public void setSrlNum(Integer srlNum) {
		this.srlNum = srlNum;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getIn_out_ind() {
		return in_out_ind;
	}

	public void setIn_out_ind(String in_out_ind) {
		this.in_out_ind = in_out_ind;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getBrID() {
		return brID;
	}

	public void setBrID(String brID) {
		this.brID = brID;
	}

	public String getBrName() {
		return brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	public String getBrAddr1() {
		return brAddr1;
	}

	public void setBrAddr1(String brAddr1) {
		this.brAddr1 = brAddr1;
	}

	public String getBrAddr2() {
		return brAddr2;
	}

	public void setBrAddr2(String brAddr2) {
		this.brAddr2 = brAddr2;
	}

	public String getBrAddr3() {
		return brAddr3;
	}

	public void setBrAddr3(String brAddr3) {
		this.brAddr3 = brAddr3;
	}

	public String getBrCity() {
		return brCity;
	}

	public void setBrCity(String brCity) {
		this.brCity = brCity;
	}

	public String getBrState() {
		return brState;
	}

	public void setBrState(String brState) {
		this.brState = brState;
	}

	public String getBrPinCode() {
		return brPinCode;
	}

	public void setBrPinCode(String brPinCode) {
		this.brPinCode = brPinCode;
	}

	public String getCollectionID() {
		return collectionId;
	}

	public void setCollectionID(String collectionID) {
		this.collectionId = collectionID;
	}

	public String getLodgDate() {
		return lodgDate;
	}

	public void setLodgDate(String lodgDate) {
		this.lodgDate = lodgDate;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyAddr1() {
		return partyAddr1;
	}

	public void setPartyAddr1(String partyAddr1) {
		this.partyAddr1 = partyAddr1;
	}

	public String getPartyAddr2() {
		return partyAddr2;
	}

	public void setPartyAddr2(String partyAddr2) {
		this.partyAddr2 = partyAddr2;
	}

	public String getPartyAddr3() {
		return partyAddr3;
	}

	public void setPartyAddr3(String partyAddr3) {
		this.partyAddr3 = partyAddr3;
	}

	public String getPartyCity() {
		return partyCity;
	}

	public void setPartyCity(String partyCity) {
		this.partyCity = partyCity;
	}

	public String getPartyState() {
		return partyState;
	}

	public void setPartyState(String partyState) {
		this.partyState = partyState;
	}

	public String getPartyCountry() {
		return partyCountry;
	}

	public void setPartyCountry(String partyCountry) {
		this.partyCountry = partyCountry;
	}

	public String getPartyPinCode() {
		return partyPinCode;
	}

	public void setPartyPinCode(String partyPinCode) {
		this.partyPinCode = partyPinCode;
	}

	public String getOtherPartyName() {
		return otherPartyName;
	}

	public void setOtherPartyName(String otherPartyName) {
		this.otherPartyName = otherPartyName;
	}

	public String getOtherPartyAddr1() {
		return otherPartyAddr1;
	}

	public void setOtherPartyAddr1(String otherPartyAddr1) {
		this.otherPartyAddr1 = otherPartyAddr1;
	}

	public String getOtherPartyAddr2() {
		return otherPartyAddr2;
	}

	public void setOtherPartyAddr2(String otherPartyAddr2) {
		this.otherPartyAddr2 = otherPartyAddr2;
	}

	public String getOtherPartyAddr3() {
		return otherPartyAddr3;
	}

	public void setOtherPartyAddr3(String otherPartyAddr3) {
		this.otherPartyAddr3 = otherPartyAddr3;
	}

	public String getOtherPartyCity() {
		return otherPartyCity;
	}

	public void setOtherPartyCity(String otherPartyCity) {
		this.otherPartyCity = otherPartyCity;
	}

	public String getOtherPartyState() {
		return otherPartyState;
	}

	public void setOtherPartyState(String otherPartyState) {
		this.otherPartyState = otherPartyState;
	}

	public String getOtherPartyCountry() {
		return otherPartyCountry;
	}

	public void setOtherPartyCountry(String otherPartyCountry) {
		this.otherPartyCountry = otherPartyCountry;
	}

	public String getOtherPartyPinCode() {
		return otherPartyPinCode;
	}

	public void setOtherPartyPinCode(String otherPartyPinCode) {
		this.otherPartyPinCode = otherPartyPinCode;
	}

	public String getPurposeCode() {
		return purposeCode;
	}

	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}

	public String getPurposeCodeDesc() {
		return purposeCodeDesc;
	}

	public void setPurposeCodeDesc(String purposeCodeDesc) {
		this.purposeCodeDesc = purposeCodeDesc;
	}

	public String getRemitCrncy() {
		return remitCrncy;
	}

	public void setRemitCrncy(String remitCrncy) {
		this.remitCrncy = remitCrncy;
	}

	public Long getRemitAmt() {
		return remitAmt;
	}

	public void setRemitAmt(Long remitAmt) {
		this.remitAmt = remitAmt;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public String getOperAcct() {
		return operAcct;
	}

	public void setOperAcct(String operAcct) {
		this.operAcct = operAcct;
	}

	public String getOperAcctCrncy() {
		return operAcctCrncy;
	}

	public void setOperAcctCrncy(String operAcctCrncy) {
		this.operAcctCrncy = operAcctCrncy;
	}

	public String getRemarkCharges() {
		return remarkCharges;
	}

	public void setRemarkCharges(String remarkCharges) {
		this.remarkCharges = remarkCharges;
	}

	public String getChrgCrncyCode() {
		return chrgCrncyCode;
	}

	public void setChrgCrncyCode(String chrgCrncyCode) {
		this.chrgCrncyCode = chrgCrncyCode;
	}

	public Float getTtlChrgCollAmt() {
		return ttlChrgCollAmt;
	}

	public void setTtlChrgCollAmt(Float ttlChrgCollAmt) {
		this.ttlChrgCollAmt = ttlChrgCollAmt;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public Double getChrgOperAcct() {
		return chrgOperAcct;
	}

	public void setChrgOperAcct(Double chrgOperAcct) {
		this.chrgOperAcct = chrgOperAcct;
	}

	public String getChrgOperCrncy() {
		return chrgOperCrncy;
	}

	public void setChrgOperCrncy(String chrgOperCrncy) {
		this.chrgOperCrncy = chrgOperCrncy;
	}

	public String getPartTranType() {
		return partTranType;
	}

	public void setPartTranType(String partTranType) {
		this.partTranType = partTranType;
	}

	public Double getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(Double tranAmt) {
		this.tranAmt = tranAmt;
	}

	public Transaction(Integer srlNum, String indicator, String in_out_ind, String custEmail, String processStatus,
			String brID, String brName, String brAddr1, String brAddr2, String brAddr3, String brCity, String brState,
			String brPinCode, String collectionID, String lodgDate, String partyName, String partyAddr1,
			String partyAddr2, String partyAddr3, String partyCity, String partyState, String partyCountry,
			String partyPinCode, String otherPartyName, String otherPartyAddr1, String otherPartyAddr2,
			String otherPartyAddr3, String otherPartyCity, String otherPartyState, String otherPartyCountry,
			String otherPartyPinCode, String purposeCode, String purposeCodeDesc, String remitCrncy, Long remitAmt,
			Float rate, String operAcct, String operAcctCrncy, String remarkCharges, String chrgCrncyCode,
			Float ttlChrgCollAmt, String valueDate, Double chrgOperAcct, String chrgOperCrncy, String partTranType,
			Double tranAmt) {
		super();
		this.srlNum = srlNum;
		this.indicator = indicator;
		this.in_out_ind = in_out_ind;
		this.custEmail = custEmail;
		this.processStatus = processStatus;
		this.brID = brID;
		this.brName = brName;
		this.brAddr1 = brAddr1;
		this.brAddr2 = brAddr2;
		this.brAddr3 = brAddr3;
		this.brCity = brCity;
		this.brState = brState;
		this.brPinCode = brPinCode;
		this.collectionId = collectionId;
		this.lodgDate = lodgDate;
		this.partyName = partyName;
		this.partyAddr1 = partyAddr1;
		this.partyAddr2 = partyAddr2;
		this.partyAddr3 = partyAddr3;
		this.partyCity = partyCity;
		this.partyState = partyState;
		this.partyCountry = partyCountry;
		this.partyPinCode = partyPinCode;
		this.otherPartyName = otherPartyName;
		this.otherPartyAddr1 = otherPartyAddr1;
		this.otherPartyAddr2 = otherPartyAddr2;
		this.otherPartyAddr3 = otherPartyAddr3;
		this.otherPartyCity = otherPartyCity;
		this.otherPartyState = otherPartyState;
		this.otherPartyCountry = otherPartyCountry;
		this.otherPartyPinCode = otherPartyPinCode;
		this.purposeCode = purposeCode;
		this.purposeCodeDesc = purposeCodeDesc;
		this.remitCrncy = remitCrncy;
		this.remitAmt = remitAmt;
		this.rate = rate;
		this.operAcct = operAcct;
		this.operAcctCrncy = operAcctCrncy;
		this.remarkCharges = remarkCharges;
		this.chrgCrncyCode = chrgCrncyCode;
		this.ttlChrgCollAmt = ttlChrgCollAmt;
		this.valueDate = valueDate;
		this.chrgOperAcct = chrgOperAcct;
		this.chrgOperCrncy = chrgOperCrncy;
		this.partTranType = partTranType;
		this.tranAmt = tranAmt;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Transaction [srlNum=" + srlNum + ", indicator=" + indicator + ", in_out_ind=" + in_out_ind
				+ ", custEmail=" + custEmail + ", processStatus=" + processStatus + ", brID=" + brID + ", brName="
				+ brName + ", brAddr1=" + brAddr1 + ", brAddr2=" + brAddr2 + ", brAddr3=" + brAddr3 + ", brCity="
				+ brCity + ", brState=" + brState + ", brPinCode=" + brPinCode + ", collectionID=" + collectionId
				+ ", lodgDate=" + lodgDate + ", partyName=" + partyName + ", partyAddr1=" + partyAddr1 + ", partyAddr2="
				+ partyAddr2 + ", partyAddr3=" + partyAddr3 + ", partyCity=" + partyCity + ", partyState=" + partyState
				+ ", partyCountry=" + partyCountry + ", partyPinCode=" + partyPinCode + ", otherPartyName="
				+ otherPartyName + ", otherPartyAddr1=" + otherPartyAddr1 + ", otherPartyAddr2=" + otherPartyAddr2
				+ ", otherPartyAddr3=" + otherPartyAddr3 + ", otherPartyCity=" + otherPartyCity + ", otherPartyState="
				+ otherPartyState + ", otherPartyCountry=" + otherPartyCountry + ", otherPartyPinCode="
				+ otherPartyPinCode + ", purposeCode=" + purposeCode + ", purposeCodeDesc=" + purposeCodeDesc
				+ ", remitCrncy=" + remitCrncy + ", remitAmt=" + remitAmt + ", rate=" + rate + ", operAcct=" + operAcct
				+ ", operAcctCrncy=" + operAcctCrncy + ", remarkCharges=" + remarkCharges + ", chrgCrncyCode="
				+ chrgCrncyCode + ", ttlChrgCollAmt=" + ttlChrgCollAmt + ", valueDate=" + valueDate + ", chrgOperAcct="
				+ chrgOperAcct + ", chrgOperCrncy=" + chrgOperCrncy + ", partTranType=" + partTranType + ", tranAmt="
				+ tranAmt + "]";
	}
	

	
	
}