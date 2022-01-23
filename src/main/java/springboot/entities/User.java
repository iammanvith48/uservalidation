package springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {
	@Min(value=1,message="id must be equal or greater than 1")
	@Max(value=10,message="id value must be less than or equal to 10")
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@NotNull
	@Size(min=5,message="first name must be atleast 5 charecters")
	@Size(max=20,message="first name must be atmax 20 charecters")
	@Column(name="firstname")
    private String firstname;
	@NotNull
	@Size(min=5,message="last name must be atleast 5 charecters")
	@Size(max=20,message="last name must be atmax 20 charecters")
	@Column(name="lastname")
    private String lastname;
    public User() {
    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    


}
