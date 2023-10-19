package com.clinicCenter.Bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.bean.AdmainBusinessBeanRemote;
import model.entity.ClinicCenter;
import model.entity.Medicine;

public class adminMedicineClass {
	private Medicine addMed;
	private Medicine updatesMed;
	private Medicine deletesMes;
	private long medicineId;
	private Medicine selectMedId;
	private String medName;
	private List<Medicine> selectMedName;
	private String medScienceName;
	private List<Medicine> selectMedScienceName;
	private List<Medicine> selectAllMed;
	
	
	
	

	public List<Medicine> getSelectAllMed() {
		return selectAllMed;
	}

	public void setSelectAllMed(List<Medicine> selectAllMed) {
		this.selectAllMed = selectAllMed;
	}

	public String getMedScienceName() {
		return medScienceName;
	}

	public void setMedScienceName(String medScienceName) {
		this.medScienceName = medScienceName;
	}

	public List<Medicine> getSelectMedScienceName() {
		return selectMedScienceName;
	}

	public void setSelectMedScienceName(List<Medicine> selectMedScienceName) {
		this.selectMedScienceName = selectMedScienceName;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public List<Medicine> getSelectMedName() {
		return selectMedName;
	}

	public void setSelectMedName(List<Medicine> selectMedName) {
		this.selectMedName = selectMedName;
	}

	public long getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(long medicineId) {
		this.medicineId = medicineId;
	}

	public Medicine getSelectMedId() {
		return selectMedId;
	}

	public void setSelectMedId(Medicine selectMedId) {
		this.selectMedId = selectMedId;
	}

	public Medicine getDeletesMes() {
		return deletesMes;
	}

	public void setDeletesMes(Medicine deletesMes) {
		this.deletesMes = deletesMes;
	}

	public Medicine getUpdatesMed() {
		return updatesMed;
	}

	public void setUpdatesMed(Medicine updatesMed) {
		this.updatesMed = updatesMed;
	}

	public Medicine getAddMed() {
		return addMed;
	}

	public void setAddMed(Medicine addMed) {
		this.addMed = addMed;
	}
	
	@PostConstruct
	public void init()
	{
		addMed=new Medicine();
		addMed.setClinicCenter(new ClinicCenter());
		chosenAllMedicine();
		
	}
	public String insertMedicine()
	{
		InitialContext ic;
		
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.addMedicine(addMed);
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	public String editMedicine(Medicine data)
	{
		this.updatesMed=data;
		
		return null;
	}
	public String updateMedicine()
	{
		InitialContext ic;
		
		try {
			
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.updateMedicine(updatesMed);
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public String removeMedicine(Medicine data)
	{
		this.deletesMes=data;
		
		return null;
	}
	public String deleteMedicine()
	{
		InitialContext ic;
		
		try {
			
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.delMedicine(deletesMes);
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	
public String SelectMedicineId()
{
	InitialContext ic;
	try {
		selectMedId=new Medicine();
		ic=new InitialContext();
		AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
		selectMedId=hp.selectMedicineById(medicineId);
	} catch (NamingException e) {
		// TODO: handle exception
		e.printStackTrace();
	} 
	return null;}


public String chosenMedicineName()
{
	InitialContext ic;
	try {
		selectMedName=new ArrayList<>();
		ic=new InitialContext();
		AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
		selectMedName=hp.selectMedicineByMedName(medName);
		
	} catch (NamingException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return  null;
	}
public String chosenMedicineScienceName()
{
	InitialContext ic;
	try {
		selectMedScienceName=new ArrayList<>();
		ic=new InitialContext();
		AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
		selectMedScienceName=hp.selectMedicineByMedSName(medScienceName);
		
	} catch (NamingException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return  null;
	}
public String chosenAllMedicine()
{
	InitialContext ic;
try {

	selectAllMed=new ArrayList<>();
	ic=new InitialContext();
	AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
	selectAllMed=hp.selectAllMedicine();
	
} catch (NamingException e) {
	// TODO: handle exception
	e.printStackTrace();
}
	return null;}
}
