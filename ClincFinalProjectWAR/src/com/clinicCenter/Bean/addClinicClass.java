package com.clinicCenter.Bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.primefaces.event.SelectEvent;

import model.bean.AdmainBusinessBeanRemote;
import model.entity.ClinicCenter;

public class addClinicClass {
	private long clinicId;
	private List<ClinicCenter> clinicIdInfo;
	private String clinicName;
	private ClinicCenter deleteClinic;
	private ClinicCenter updateUser;
	private List<ClinicCenter> selectAllClinic;
	private List<ClinicCenter> selectAllClinic2;
	private ClinicCenter clinicCenter;
	

	
	public List<ClinicCenter> getSelectAllClinic2() {
		
		return selectAllClinic2;
	}

	public void setSelectAllClinic2(List<ClinicCenter> selectAllClinic2) {
	
		this.selectAllClinic2 = selectAllClinic2;
	}

	public List<ClinicCenter> getSelectAllClinic() {
		
		return selectAllClinic;
	}

	public void setSelectAllClinic(List<ClinicCenter> selectAllClinic) {
		this.selectAllClinic = selectAllClinic;
	}

	public ClinicCenter getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(ClinicCenter updateUser) {
		this.updateUser = updateUser;
	}

	public ClinicCenter getDeleteClinic() {
		return deleteClinic;
	}

	public void setDeleteClinic(ClinicCenter deleteClinic) {
		this.deleteClinic = deleteClinic;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	public List<ClinicCenter> getClinicIdInfo() {
		return clinicIdInfo;
	}

	public void setClinicIdInfo(List<ClinicCenter> clinicIdInfo) {
		this.clinicIdInfo = clinicIdInfo;
	}

	public long getClinicId() {
		return clinicId;
	}

	public void setClinicId(long clinicId) {
		this.clinicId = clinicId;
	}
	
	public ClinicCenter getClinicCenter() {
		return clinicCenter;
	}

	public void setClinicCenter(ClinicCenter clinicCenter) {
		this.clinicCenter = clinicCenter;
	}
    
	@PostConstruct
	public void init()
	{
		showAllClinic();
		clinicCenter =new ClinicCenter();
		selectAllClinic2=new ArrayList<ClinicCenter>();
		 selectAllClinic2=showAllClinic2();
	}
	
	public String addClinic()
	{     
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hb=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hb.addClinc(clinicCenter);
			dispalyMessage(clinicCenter.getCliName()+"added");
			return null;
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	public String selectClincById()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hb=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			clinicCenter=hb.SelectClinicById(clinicId);
		
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	public String SelectclinicByName()
	{  InitialContext ic;
		try {
			clinicIdInfo=new ArrayList<>();

			ic =new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			clinicIdInfo= hp.selectClinicByName(clinicName);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public String DeleteClinics()
	{   
		InitialContext ic ;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp= (AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.removeClinic(deleteClinic);
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public String updateInfo(ClinicCenter data)
	{   this.updateUser=data;
		return null;
	}
	public String editeClinic ()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp = (AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.updateClinic(updateUser);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String showAllClinic()
	{
		InitialContext ic;
		try {
			selectAllClinic=new ArrayList<>();
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			selectAllClinic=hp.selectAllClinic();
			return null;
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ClinicCenter> showAllClinic2()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			return hp.selectAllClinic();
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public void dispalyMessage(String messages)
	{
		FacesContext fc=FacesContext.getCurrentInstance();
		fc.addMessage(null, new FacesMessage(messages));
		
	}
	

	public String goToPageClincCenter() {
	    // ...
	    return "clinics.xhtml?faces-redirect=true";
	}

	 public void onRowSelect(SelectEvent event) {
	       updateUser=   (ClinicCenter) event.getObject();
	    }
}
