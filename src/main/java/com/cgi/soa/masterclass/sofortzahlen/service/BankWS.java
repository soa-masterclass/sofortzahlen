package com.cgi.soa.masterclass.sofortzahlen.service;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import com.cgi.soa.masterclass.sofortzahlen.sampleBank.ws.BankWeb;
import com.cgi.soa.masterclass.sofortzahlen.sampleBank.ws.BankWebService;

@Stateless
public class BankWS 
{
	@WebServiceRef
	BankWebService service;
	
	public BankWeb getWebServices()
	{
		return service.getBankWebPort();
	}
}
