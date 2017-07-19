package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import dbdemo.redis.repository.Deparment;
import dbdemo.redis.repository.RedisConfig;
import dbdemo.redis.repository.Role;
import dbdemo.redis.repository.User;
import dbdemo.redis.repository.UserRedis;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RedisConfig.class})
public class RedisTest {
    private static Logger logger = LoggerFactory.getLogger(RedisTest.class);
    
    @Autowired
    UserRedis userredis;
    
    @Before
    public void setup(){
    	Deparment deparmenter = new Deparment();
    	deparmenter.setName("开发部");
    	
    	Role role = new Role();
    	role.setName("admin");
    	
    	User user = new User();
    	user.setName("user");
    	user.setCreatedate(new Date());
    	user.setDeparment(deparmenter);
    	List<Role> roles = new ArrayList<Role>();
    	roles.add(role);
    	user.setRoles(roles);
    	
    	userredis.delete(this.getClass().getName()+":userByname:"+user.getName());
    	userredis.add(this.getClass().getName()+":userByname:"+user.getName(), 10L, user);
    }
    
    @Test
    public void get(){
    	User user = userredis.get(this.getClass().getName()+":userByname:user");
    	Assert.notNull(user);
    	System.out.println(user);
    }

}
