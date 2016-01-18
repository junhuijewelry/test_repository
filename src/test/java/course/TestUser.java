package course;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.info.entity.UserInfo;
import com.info.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/application-config.xml")
@WebAppConfiguration
@Transactional
public class TestUser {

	private final static Logger logger = LoggerFactory.getLogger(TestUser.class);
	
	  @Autowired
	private UserService userService;
	
	@Test
    public void selectUserInfo() throws Exception{
		UserInfo userInfo= new UserInfo();
		userInfo.setId(1);
		UserInfo user = userService.selectUserInfoByPrimaryKey(1);
		System.out.println(user);
		logger.info("获取到列表：{}",user);
    }
	
}
