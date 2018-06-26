package com.example.syp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account implements Serializable {
	 	
	 	@OneToOne(mappedBy = "account")
	 	@JsonIgnore
	    private Agent agent;
	

		private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(length = 30, nullable = false, unique = true)
	    private String email;
	    @Column(length = 6, nullable = false)
	    private String password;
	    private StatusAccount statusAccount;
	    private String status;
	    @OneToOne
	    private Employee employee;
	    @ManyToOne
	    private PriorityStatus priorityStatus;
	    
	    

	    @PrePersist 
	    public void request(){
	        
	    	status = "Active";
	        
	        
	    }
		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}

		public PriorityStatus getPriorityStatus() {
			return priorityStatus;
		}

		public void setPriorityStatus(PriorityStatus priorityStatus) {
			this.priorityStatus = priorityStatus;
		}

		
	    
		
		public Account() {
			
		}
		
		 public Account(Long id, String email, String password, StatusAccount statusAccount, Employee employee,
					PriorityStatus priorityStatus) {
				super();
				this.id = id;
				this.email = email;
				this.password = password;
				this.statusAccount = statusAccount;
				this.employee = employee;
				this.priorityStatus = priorityStatus;
			}
		
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
	        if (!(object instanceof Account)) {
	            return false;
	        }
	        Account other = (Account) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "model.Account[ id=" + id + " ]";
	    }

	    /**
	     * @return the password
	     */
	    public String getPassword() {
	        return password;
	    }

	    /**
	     * @param password the password to set
	     */
	    public void setPassword(String password) {
	        this.password = password;
	    }

	    /**
	     * @return the statusAccount
	     */
	    public StatusAccount getStatusAccount() {
	        return statusAccount;
	    }

	    /**
	     * @param statusAccount the statusAccount to set
	     */
	    public void setStatusAccount(StatusAccount statusAccount) {
	        this.statusAccount = statusAccount;
	    }


	    /**
	     * @return the email
	     */
	    public String getEmail() {
	        return email;
	    }

	    /**
	     * @param email the email to set
	     */
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Agent getAgent() {
			return agent;
		}

		public void setAgent(Agent agent) {
			this.agent = agent;
		}

	   
}
