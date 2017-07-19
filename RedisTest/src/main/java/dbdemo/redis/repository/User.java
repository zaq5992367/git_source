package dbdemo.redis.repository;

import java.util.Date;
import java.util.List;

public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Date createdate;
	private Deparment deparment;
	private List<Role> roles;
	
	public User(Long id, String name, Date createdate, Deparment deparment, List<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.createdate = createdate;
		this.deparment = deparment;
		this.roles = roles;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Deparment getDeparment() {
		return deparment;
	}

	public void setDeparment(Deparment deparment) {
		this.deparment = deparment;
	}
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", createdate=" + createdate + "]";
	}
	
	

}
