package com.example.syp.model;


import java.util.Date;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Ticket extends Additional implements Serializable {

		private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @ManyToOne
	    private Employee employee;
	    @Column(length = 40, nullable = false)
	    private String summary ;
	    @Column(length = 500, nullable = true)
	    private String description;
	    @Column(length = 30, nullable = true)
	    private String attachment;
	    @Temporal(javax.persistence.TemporalType.DATE)
	    private Date requesttime;
	    @Column(length = 500, nullable = true)
	    private String schedule;
	    @Column(length = 500, nullable = true)
	    private String schedules;
	    private String follow_up;		
	    @Temporal(javax.persistence.TemporalType.DATE)
	    private Date plan_date;
	    @Temporal(javax.persistence.TemporalType.DATE)
	    private Date actual_date;
	    @ManyToOne
	    private TopicTicket topicTicket;
	    @ManyToOne
	    private Agent agent;
	    @ManyToOne
	    private UrgencyTicket urgencyTicket;
	    @OneToOne
	    @JsonIgnore
	    @JoinColumn(name = "IDFOLLOWUP", referencedColumnName = "id")
	    private FollowUp followUp;
	    @ManyToOne
	    private TicketStatus ticketStatus;
	    
	    
	    @PrePersist //ini untuk perintah ketika insert
	    public void request(){
	        
	        requesttime = new Date();
	        plan_date = new Date();
	        actual_date = new Date();
	        
	        
	        
	    }
	    
	    
//	    @PrePersist
//	    public void insertVIP(){
//	        Employee e = new Employee();
//	        UrgencyTicketDAO udao = new UrgencyTicketDAOImpl();
//	        if(e.getPosition().getLevelPosition(1)){
//	            urgencyTicket = udao.getById(2);
//	        } 
//	    }

	    public Long getId() {
	        return id;
	    }
	    
	    public Ticket() {
	    	
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
	        if (!(object instanceof Ticket)) {
	            return false;
	        }
	        Ticket other = (Ticket) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "model.Ticket[ id=" + id + " ]";
	    }

	    /**
	     * @return the summary
	     */
	    public String getSummary() {
	        return summary;
	    }

	    /**
	     * @param summary the summary to set
	     */
	    public void setSummary(String summary) {
	        this.summary = summary;
	    }

	    /**
	     * @return the description
	     */
	    public String getDescription() {
	        return description;
	    }

	    /**
	     * @param description the description to set
	     */
	    public void setDescription(String description) {
	        this.description = description;
	    }

	    /**
	     * @return the attachment
	     */
	    public String getAttachment() {
	        return attachment;
	    }

	    /**
	     * @param attachment the attachment to set
	     */
	    public void setAttachment(String attachment) {
	        this.attachment = attachment;
	    }


	    public String getFollow_up() {
			return follow_up;
		}


		public void setFollow_up(String follow_up) {
			this.follow_up = follow_up;
		}


		public Date getPlan_date() {
			return plan_date;
		}


		public void setPlan_date(Date plan_date) {
			this.plan_date = plan_date;
		}


		public Date getActual_date() {
			return actual_date;
		}


		public void setActual_date(Date actual_date) {
			this.actual_date = actual_date;
		}



	    /**
	     * @return the topicTicket
	     */
	    public TopicTicket getTopicTicket() {
	        return topicTicket;
	    }

	    /**
	     * @param topicTicket the topicTicket to set
	     */
	    public void setTopicTicket(TopicTicket topicTicket) {
	        this.topicTicket = topicTicket;
	    }

	    /**
	     * @return the urgencyTicket
	     */
	    public UrgencyTicket getUrgencyTicket() {
	        return urgencyTicket;
	    }

	    /**
	     * @param urgencyTicket the urgencyTicket to set
	     */
	    public void setUrgencyTicket(UrgencyTicket urgencyTicket) {
	        this.urgencyTicket = urgencyTicket;
	    }

	    /**
	     * @return the followUp
	     */
	    public FollowUp getFollowUp() {
	        return followUp;
	    }

	    /**
	     * @param followUp the followUp to set
	     */
	    public void setFollowUp(FollowUp followUp) {
	        this.followUp = followUp;
	    }

	    /**
	     * @return the requesttime
	     */
	    public Date getRequesttime() {
	        return requesttime;
	    }

	    /**
	     * @param requesttime the requesttime to set
	     */
	    public void setRequesttime(Date requesttime) {
	        this.requesttime = requesttime;
	    }

	    
	    public String getSchedule() {
			return schedule;
		}


		public Agent getAgent() {
	        return agent;
	    }

	    /**
	     * @param agent the agent to set
	     */
	    public void setAgent(Agent agent) {
	        this.agent = agent;
	    }

	    public String getSchedules() {
			return schedules;
		}


		public void setSchedules(String schedules) {
			this.schedules = schedules;
		}



	    /**
	     * @return the ticketStatus
	     */
	    public TicketStatus getTicketStatus() {
	        return ticketStatus;
	    }

	    /**
	     * @param ticketStatus the ticketStatus to set
	     */
	    public void setTicketStatus(TicketStatus ticketStatus) {
	        this.ticketStatus = ticketStatus;
	    }

	    /**
	     * @return the employee
	     */
	    public Employee getEmployee() {
	        return employee;
	    }

	    /**
	     * @param employee the employee to set
	     */
	    public void setEmployee(Employee employee) {
	        this.employee = employee;
	    }

	    public void setEmployee(int i) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    public void setUrgencyTicket(String string) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    public void setSchedule(String dateFormat) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }



		public Ticket(Long id, Employee employee, String summary, String description, String attachment,
				Date requesttime, String schedule, String schedules, String follow_up, Date plan_date, Date actual_date,
				TopicTicket topicTicket, Agent agent, UrgencyTicket urgencyTicket, FollowUp followUp,
				TicketStatus ticketStatus) {
			super();
			this.id = id;
			this.employee = employee;
			this.summary = summary;
			this.description = description;
			this.attachment = attachment;
			this.requesttime = requesttime;
			this.schedule = schedule;
			this.schedules = schedules;
			this.follow_up = follow_up;
			this.plan_date = plan_date;
			this.actual_date = actual_date;
			this.topicTicket = topicTicket;
			this.agent = agent;
			this.urgencyTicket = urgencyTicket;
			this.followUp = followUp;
			this.ticketStatus = ticketStatus;
		}

	    
}
