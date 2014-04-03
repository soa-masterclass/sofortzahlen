package com.cgi.soa.masterclass.sofortzahlen.validator.annotation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

import com.cgi.soa.masterclass.sofortzahlen.service.BankWS;

@FacesValidator(value = "zahlenValidator")
public class SofortzahlenValidator implements Validator
{
	@Inject
	BankWS bankWs;
	@SuppressWarnings("null")
	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException 
	{
		// TODO Auto-generated method stub
		
		Integer account = null;
		boolean valid = true;
		if(value == null)
		{
			valid = false;
		}
		else if( !bankWs.getWebServices().isAccountExist((Integer)value))
		{
			valid = false;
		}
		if(!valid)
		{
			FacesMessage message = new FacesMessage(
					FacesMessage.SEVERITY_ERROR, "Account is not in",
					"The account is not valid");
			throw new ValidatorException(message);
		}
		
	}
	
}
