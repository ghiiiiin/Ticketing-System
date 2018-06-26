package com.example.syp.model;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UrgencyTicket {
	   
		@OneToMany(mappedBy = "urgencyTicket")
		@JsonIgnore
	    private List<Ticket> tickets;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String urgencyName;
	    public UrgencyTicket() {
	    	
	    }
	    public UrgencyTicket(List<Ticket> tickets, Long id, String urgencyName) {
			super();
			this.tickets = tickets;
			this.id = id;
			this.urgencyName = urgencyName;
		}

		@Column(length = 50, nullable = false)
	    

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
	        if (!(object instanceof UrgencyTicket)) {
	            return false;
	        }
	        UrgencyTicket other = (UrgencyTicket) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "model.UrgencyTicket[ id=" + id + " ]";
	    }

	    /**
	     * @return the urgencyName
	     */
	    public String getUrgencyName() {
	        return urgencyName;
	    }

	    /**
	     * @param urgencyName the urgencyName to set
	     */
	    public void setUrgencyName(String urgencyName) {
	        this.urgencyName = urgencyName;
	    }

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

}
