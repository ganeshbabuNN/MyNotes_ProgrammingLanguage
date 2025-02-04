package com.ganesh.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="sidconverter")
public class SIDConverter implements Converter{

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("SIDConverter-getAsObject()");
		String bid="";
		String msg = component.getId();
		FacesMessage message = new FacesMessage();
		int id=0;
		try{
			if(value==null || value.length()==0){
				message.setDetail(msg+" is Required");
				throw new ConverterException(message);
			}id=Integer.parseInt(value);
		}catch(NumberFormatException e){
			message.setDetail("Please enter Only Digits for "+msg);
			throw new ConverterException(message);
		}
		if(id>=1 && id<=999){
			bid="JLC-"+id;
		}else{
			message.setDetail("Please enter value between 1 and 999 "+msg);
			throw new ConverterException(message);
		}
		return bid;
	}
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		System.out.println("SIDConverter-getAsString()");
		String str= value.toString();
		String val = str.substring(4);
		return val;
	}

	

}
