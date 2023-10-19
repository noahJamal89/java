package com.clinicCenter.Bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.bean.AdmainBusinessBeanRemote;
import model.entity.ClinicCenter;
import model.entity.Doctor;
import model.entity.User;

public class adminOperationDoctorClass {
	
	private Doctor addNewDoctor;
	private Doctor updatesDoctors;
	private Doctor deletesDoctor;
	private Doctor selectDoctorId;
	private long doctorId;
	private String DoctorsName;
	private List<Doctor> docNameInfo;
	private List<Doctor> allDocInfo;
	
	
	
	
	public List<Doctor> getDocNameInfo() {
		return docNameInfo;
	}

	public void setDocNameInfo(List<Doctor> docNameInfo) {
		this.docNameInfo = docNameInfo;
	}

	public List<Doctor> getAllDocInfo() {
		return allDocInfo;
	}

	public void setAllDocInfo(List<Doctor> allDocInfo) {
		this.allDocInfo = allDocInfo;
	}

	public String getDoctorsName() {
		return DoctorsName;
	}

	public void setDoctorsName(String doctorsName) {
		DoctorsName = doctorsName;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public Doctor getSelectDoctorId() {
		return selectDoctorId;
	}

	public void setSelectDoctorId(Doctor selectDoctorId) {
		this.selectDoctorId = selectDoctorId;
	}

	public Doctor getDeletesDoctor() {
		return deletesDoctor;
	}

	public void setDeletesDoctor(Doctor deletesDoctor) {
		this.deletesDoctor = deletesDoctor;
	}

	public Doctor getUpdatesDoctors() {
		return updatesDoctors;
	}

	public void setUpdatesDoctors(Doctor updatesDoctors) {
		this.updatesDoctors = updatesDoctors;
	}

	public Doctor getAddNewDoctor() {
		return addNewDoctor;
	}

	public void setAddNewDoctor(Doctor addNewDoctor) {
		this.addNewDoctor = addNewDoctor;
	}
	
	@PostConstruct
	public void init()
	{
		addNewDoctor=new Doctor();
		addNewDoctor.setClinicCenter(new ClinicCenter());
		addNewDoctor.setUser(new User());
		chosenAllDoctor();
	}
	public String insertDoctor()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp;
			hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.addDoctor(addNewDoctor);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public String getEditDoc(Doctor data)
	{  
		this.updatesDoctors=data;
		return "adminUpdateDoc.xhtml";
	}
	
	public String updateDocotr()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.updateDoctor(updatesDoctors);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
	public String removeDoctor(Doctor data)
	{
		this.deletesDoctor=data;
		return "adminDeleteDoc.xhtml";
		
	}
	public String deleteDocotr()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.removeDoctor(deletesDoctor);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public String chosenDoctorID()
	{
		InitialContext ic;
		try {
			selectDoctorId=new Doctor();
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			selectDoctorId=hp.SelectDoctorById(doctorId);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public String chosenDoctorName()
	{
		InitialContext ic;
		try {
			docNameInfo=new ArrayList<> ();
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			docNameInfo=hp.selectDoctorByName(DoctorsName);
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public String chosenAllDoctor()
	{
		InitialContext ic;
		try {
			allDocInfo=new ArrayList<> ();
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			allDocInfo=hp.selectAllDoctor();
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
	

}
