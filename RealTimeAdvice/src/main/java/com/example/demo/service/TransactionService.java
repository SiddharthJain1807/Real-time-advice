package com.example.demo.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository repository;
	
	public JSONObject generateResponse(String collectionId) {
		
		JSONObject response = new JSONObject();
		List<Transaction> list = repository.findAllByCollectionId(collectionId);
		
		JSONArray array = new JSONArray();
		
		for( Transaction transaction  : list ) {
			
			JSONObject remarks = new JSONObject();
			
			if(transaction.getIndicator().equals("CHRG")) {
			
			remarks.put("indicator", transaction.getIndicator());
			remarks.put("remarks", transaction.getRemarkCharges());
			remarks.put("currencyCode", transaction.getChrgCrncyCode());
			remarks.put("amount", transaction.getTtlChrgCollAmt());
			array.put(remarks);
			}
			
			else {
				remarks.put("indicator", transaction.getIndicator());
				remarks.put("remarks", transaction.getRemitCrncy()+" "+transaction.getRemitAmt()+" "+"Value Date : "+transaction.getValueDate()+"to A/C no. "+ transaction.getChrgOperAcct());
				remarks.put("currencyCode", transaction.getChrgOperCrncy());
				remarks.put("amount", transaction.getTranAmt());
				array.put(remarks);
			}
			
			if(transaction.getIndicator().equals("DRCR")) {
				response.put("inOutInd", transaction.getIn_out_ind());
				response.put("custEmail", transaction.getCustEmail());
				response.put("processStatus", transaction.getProcessStatus());
				response.put("brID", transaction.getBrID());
				response.put("brName", transaction.getBrName());
				response.put("brAddr1", transaction.getBrAddr1());
				response.put("brAddr2", transaction.getBrAddr2());
				response.put("brAddr3", transaction.getBrAddr3());
				response.put("brCity", transaction.getBrCity());
				response.put("brState", transaction.getBrState());
				response.put("brPinCode", transaction.getBrPinCode());
				response.put("collectionID", transaction.getCollectionID());
				response.put("lodgDate", transaction.getLodgDate());
				response.put("partyName", transaction.getPartyName());
				response.put("partyAddr1", transaction.getPartyAddr1());
				response.put("partyAddr2", transaction.getPartyAddr2());
				response.put("partyAddr3", transaction.getPartyAddr3());
				response.put("partyCity", transaction.getPartyCity());
				response.put("partyState", transaction.getPartyState());
				response.put("partyCountry", transaction.getPartyCountry());
				response.put("partyPinCode", transaction.getPartyPinCode());
				response.put("otherPartyName", transaction.getOtherPartyName());
				response.put("otherPartyAddr1", transaction.getOtherPartyAddr1());
				response.put("otherPartyAddr2", transaction.getOtherPartyAddr2());
				response.put("otherPartyAddr3", transaction.getOtherPartyAddr3());
				response.put("otherPartyCity", transaction.getOtherPartyCity());
				response.put("otherPartyState", transaction.getOtherPartyState());
				response.put("otherPartyCountry", transaction.getOtherPartyCountry());
				response.put("otherPartyPinCode", transaction.getOtherPartyPinCode());
				response.put("purposeCode", transaction.getPurposeCode());
				response.put("purposeCodeDesc", transaction.getPurposeCodeDesc());
				response.put("remitCrncy", transaction.getRemitCrncy());
				response.put("remitAmt", transaction.getRemitAmt());
				response.put("rate", transaction.getRate());
				response.put("operAcct", transaction.getOperAcct());
				response.put("operAcctCrncy", transaction.getOperAcctCrncy());
				response.put("remarkCharges", transaction.getRemarkCharges());
				response.put("chrgCrncyCode", transaction.getChrgCrncyCode());
				response.put("ttlChrgCollAmt", transaction.getTtlChrgCollAmt());
				response.put("valueDate", transaction.getValueDate());
				response.put("chrgOperAcct", transaction.getChrgOperAcct());
				response.put("chrgOperCrncy", transaction.getChrgOperCrncy());
				response.put("partTranType", transaction.getPartTranType());
				response.put("tranAmt", transaction.getTranAmt());
				
			}
				response.put("transactionDetails", array);
		}
		
		return response;
	}
	
	
}
