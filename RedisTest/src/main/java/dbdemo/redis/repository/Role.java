package dbdemo.redis.repository;

import java.io.Serializable;


/**
 * Created by LIUKUNLIN on 2017/7/12.
 */

public class Role implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private long id;
    private String name;

    public Role() {

    }

    public Role(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}
    
    
}
