package com.main.admin.entities;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="user_info")
public class UserInfo implements Serializable{

    /** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Integer id;
    
    @Column(name="first_name", length=10)
    private String firstName;
    
    @Column(name="last_name",length=10)
    private String lastName;
    
    @Column(name="city",length=10)
    private String city;
    
    @Column(name="mobile_number",length=10)
    private String mobileNumber;
    
    @Column(length=1)
    private String status;
    
    @Column(name="dob")
    private LocalDate dob;
    
    @Column(name="created_date")
    private LocalDate createdDate;
    
    @Column(name="created_time")
    private LocalTime createdTime;
    
    @Column(name="updated_date")
    private LocalDate updatedDate;
    
    @Column(name="updated_time")
    private LocalTime updatedTime;
    
    
    
    
    

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalTime getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(LocalTime updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalTime createdTime) {
		this.createdTime = createdTime;
	}

	/** Default constructor. */
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", mobileNumber=" + mobileNumber + ", status=" + status + ", dob=" + dob + ", createdDate="
				+ createdDate + ", createdTime=" + createdTime + ", updatedDate=" + updatedDate + ", updatedTime="
				+ updatedTime + "]";
	}

	
}
