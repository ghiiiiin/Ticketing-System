package com.example.syp.model;


import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;

@MappedSuperclass


public abstract class Additional {

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updateDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createDate;
   
	private String updateBy;
    private String information;

    public Additional(){
//        CreateDate=new Date();
//        CreateBy="admin";
//        UpdateDate=new Date();
//        UpdateBy="admin";
       
        
    }
    @PrePersist //ini untuk perintah ketika insert
    public void request(){
        
        createDate = new Date();
        
    }
    public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

   
    @PreUpdate
    public void onUpdate(){
        updateDate=new Date();
       // UpdateBy="Admin"; taro di clas main /tescase
    }
    
    
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date UpdateDate) {
        this.updateDate = UpdateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String UpdateBy) {
        this.updateBy = UpdateBy;
    }

    

    /**
     * @return the information
     */
    public String getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(String information) {
        this.information = information;
    }
       
}
