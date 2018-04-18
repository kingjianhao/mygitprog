package test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.log4j.Logger;  
import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;
import com.kingfly.domain.Shseat;
import com.kingfly.domain.SourceFile;
import com.kingfly.service.IPickupFileService;
import com.kingfly.service.IShseatService;
import com.kingfly.utils.FenkuUtil;  
 
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  

public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private IShseatService shseatService = null;  
    @Resource  
    private IPickupFileService pickupFileService = null;  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        Shseat user = shseatService.getShseatByShSeatNo("20419"); 
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
    }
    
    @Test  
    public void test2() {  
    	shseatService.addShseat("20959", "junit 你好啊3");
        Shseat user = shseatService.getShseatByShSeatNo("20959"); 
        logger.info(JSON.toJSONString(user));  
    }
    
    @Test  
    public void test3() {  
    	String fileType="xydata";
        List<SourceFile> result = pickupFileService.getSourceFileListByFileType(fileType);
        //List<SourceFile> result = pickupFileService.getSourceFileList();
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());
        for(int i=0;i<result.size();i++) {
        	logger.info(JSON.toJSONString(result.get(i)));
        }
    }
    
    @Test
    public void test4() {
    	//logger.info(9+DateFormatUtils.format(Calendar.getInstance(), "MMdd").substring(2));
    	//logger.info(DateFormatUtils.format(Calendar.getInstance(), "MMdd"));
    	String fileName="abcsj.MDD";
    	logger.info(fileName.replaceAll("MDD", FenkuUtil.getHexdateString()));
    	logger.info(fileName);

    }
    
    @Test
    public void test5() {
    	pickupFileService.initFileList();
    	//logger.info(DateFormatUtils.format(Calendar.getInstance(), "MMdd"));
    }
}
