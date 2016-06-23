package com.adaming.appSystemeAgence.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {

	
	public Converter() {
	}
	
	public Date StringToDateFR(String dateAconvertir) {
		// definition du format
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		
		Date dateConvertie = null;
		try {
			dateConvertie = format.parse(dateAconvertir);
			
		} catch (ParseException e) {
			System.out.println(dateAconvertir + " n'est pas au format dd/mm/yyyy");
			e.printStackTrace();
		}
		
		return dateConvertie;
	}
}
