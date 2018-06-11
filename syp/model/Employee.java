package com.example.syp.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Employee implements Serializable{
	 
		@OneToMany(mappedBy = "employee")
		@JsonIgnore
	    private List<Ticket> tickets;

		@OneToOne(mappedBy = "employee")
	    @JsonIgnore
	    private Account account;
		
	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(length = 40, nullable = false)
	    private String employeeName;
	    @Column(length = 30, nullable = false)
	    private String position;
//	    @OneToOne
//	    @JoinColumn(name = "idaccount", referencedColumnName = "id")
//	    private Account account;
	  

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
	        if (!(object instanceof Employee)) {
	            return false;
	        }
	        Employee other = (Employee) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "model.Employee[ id=" + id + " ]";
	    }

	    /**
	     * @return the employeeName
	     */
	    public String getEmployeeName() {
	        return employeeName;
	    }

	    /**
	     * @param employeeName the employeeName to set
	     */
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }


	    /**
	     * @return the account
	     */
//	    public Account getAccount() {
//	        return account;
//	    }
	//
//	    /**
//	     * @param account the account to set
//	     */
//	    public void setAccount(Account account) {
//	        this.account = account;
//	    }

	   
	    /**
	     * @return the tickets
	     */
	    public List<Ticket> getTickets() {
	        return tickets;
	    }

	    /**
	     * @param tickets the tickets to set
	     */
	    public void setTickets(List<Ticket> tickets) {
	        this.tickets = tickets;
	    }


	    /**
	     * @return the position
	     */
	    public String getPosition() {
	        return position;
	    }

	    /**
	     * @param position the position to set
	     */
	    public void setPosition(String position) {
	        this.position = position;
	    }
	   
}
