package com.cgi.soa.masterclass.sofortzahlen.faces.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.cgi.soa.masterclass.sofortzahlen.service.UserEJB;

@FacesConverter(value="userConverter")
public class UserConverter implements Converter{
	
	@Inject
	UserEJB userEJB;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
