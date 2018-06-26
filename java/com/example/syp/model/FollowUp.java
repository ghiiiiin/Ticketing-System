package com.example.syp.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;


@Entity
public class FollowUp {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 500, nullable = false)
    private String detailFollowUp;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date planDate;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date actualDate;
    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FollowUp)) {
            return false;
        }
        FollowUp other = (FollowUp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.FollowUp[ id=" + id + " ]";
    }

    /**
     * @return the detailFollowUp
     */
    public String getDetailFollowUp() {
        return detailFollowUp;
    }

    /**
     * @param detailFollowUp the detailFollowUp to set
     */
    public void setDetailFollowUp(String detailFollowUp) {
        this.detailFollowUp = detailFollowUp;
    }

    /**
     * @return the planDate
     */
    public Date getPlanDate() {
        return planDate;
    }

    /**
     * @param planDate the planDate to set
     */
    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    /**
     * @return the actualDate
     */
    public Date getActualDate() {
        return actualDate;
    }

    /**
     * @param actualDate the actualDate to set
     */
    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }
}
