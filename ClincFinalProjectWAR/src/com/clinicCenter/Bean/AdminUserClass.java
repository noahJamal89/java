package com.clinicCenter.Bean;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.bean.AdmainBusinessBeanRemote;
import model.entity.User;

public class AdminUserClass {
   private User addData;

    public AdminUserClass()
    {
    	addData=new User();
    }
	
	public User getAddData() {
		return addData;
	}

	public void setAddData(User addData) {
		this.addData = addData;
	}

	public String AdminAddUser()
	{
	
		InitialContext ic;
		try {
			
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.addUser(addData);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	
}
