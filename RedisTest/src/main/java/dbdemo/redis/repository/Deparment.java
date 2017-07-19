package dbdemo.redis.repository;

/**
 * Created by LIUKUNLIN on 2017/7/12.
 */

public class Deparment {
    private long id;
    private String name;

    public Deparment() {

    }
    public Deparment(long id, String name) {
        this.id = id;
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
		return "Deparment [id=" + id + ", name=" + name + "]";
	}
    
    
}
