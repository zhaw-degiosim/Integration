package ch.tagcloud.www.model;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Projects {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
	@CreationTimestamp
	private LocalDateTime createDateTime;
    
	@Column
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
	@Column(length = 100, unique=true, nullable = false)
    private String name;
	
	@Column(length = 500, unique=false, nullable = true)
    private String description;
	
	@Column
	@Type(type="date")
	private Date startDate;
	
	@Column
	@Type(type="date")
	private Date endDate;
	
	@Column(length = 40, unique=false, nullable = false)
    private String leader;
	
	@Column(length = 40, unique=false, nullable = false)
    private String employee1;
	
	@Column(length = 40, unique=false, nullable = false)
    private String employee2;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getEmployee1() {
		return employee1;
	}

	public void setEmployee1(String employee1) {
		this.employee1 = employee1;
	}

	public String getEmployee2() {
		return employee2;
	}

	public void setEmployee2(String employee2) {
		this.employee2 = employee2;
	}
	
	
	

}
