
package com.clinicCenter.Bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.bean.AdmainBusinessBeanRemote;
import model.entity.ClinicCenter;
import model.entity.Dose;

public class adminDoseClass {
	private Dose addDose;
	private Dose updatesDose;
	private Dose deletesDose;
	private long doseID;
	private Dose selectDoseId;
	private String dosesName;
	private List<Dose> selectDosesName;
	private List<Dose> SelectAllDoses;
	
	
	
	
	

	public List<Dose> getSelectAllDoses() {
		return SelectAllDoses;
	}

	public void setSelectAllDoses(List<Dose> selectAllDoses) {
		SelectAllDoses = selectAllDoses;
	}

	public String getDosesName() {
		return dosesName;
	}

	public void setDosesName(String dosesName) {
		this.dosesName = dosesName;
	}

	public List<Dose> getSelectDosesName() {
		return selectDosesName;
	}

	public void setSelectDosesName(List<Dose> selectDosesName) {
		this.selectDosesName = selectDosesName;
	}

	public Dose getSelectDoseId() {
		return selectDoseId;
	}

	public void setSelectDoseId(Dose selectDoseId) {
		this.selectDoseId = selectDoseId;
	}

	public long getDoseID() {
		return doseID;
	}

	public void setDoseID(long doseID) {
		this.doseID = doseID;
	}

	
	public Dose getUpdatesDose() {
		return updatesDose;
	}

	public void setUpdatesDose(Dose updatesDose) {
		this.updatesDose = updatesDose;
	}

	public Dose getDeletesDose() {
		return deletesDose;
	}

	public void setDeletesDose(Dose deletesDose) {
		this.deletesDose = deletesDose;
	}

	public Dose getAddDose() {
		return addDose;
	}

	public void setAddDose(Dose addDose) {
		this.addDose = addDose;
		
	}
	
	@PostConstruct
	public void init()
	{
		addDose=new Dose();
		addDose.setClinicCenter(new ClinicCenter());
		chosenAllDose();
		

	}
	public String insertDose()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.addDose(addDose);
			
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	public String editDose(Dose data)
	{
		this.updatesDose=data;
		return null;
	}
	public String updateDose()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.updateDose(updatesDose);
			
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public String removeDose(Dose data)
	{
		this.deletesDose=data;
		return null;
	}
	
	public String deleteDose()
	{
		InitialContext ic;
		try {
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			hp.delDose(deletesDose);
			
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public String chosenDoseId()
	{
		InitialContext ic;
		try {
			selectDoseId=new Dose();
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			selectDoseId=hp.selectDoseById(doseID);
			
			
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String chosenDoseName()
	{
		InitialContext ic;
		try {
            selectDosesName=new ArrayList<>();
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			selectDosesName=hp.selectByDoseName(dosesName);
			
			
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String chosenAllDose()
	{
		InitialContext ic;
		try {
			SelectAllDoses=new ArrayList<>();
			ic=new InitialContext();
			AdmainBusinessBeanRemote hp=(AdmainBusinessBeanRemote) ic.lookup("model.bean.AdmainBusinessBeanRemote");
			SelectAllDoses=hp.selectAllDose();
			
			
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	

}
