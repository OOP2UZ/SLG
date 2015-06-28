package com.slg;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "hello")
@SessionScoped
public class Test implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public String getMessage(){
		return "Zwracam wiadomosc";
	}

}
