package dao;

import static org.junit.Assert.*;

import org.apache.log4j.*; 
import org.junit.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import antlr.collections.List;
import cuc.AppConfigMain;
import cuc.sture.domain.Person;
import cuc.sture.domain.Student;
import cuc.sture.repository.PersonRepository;
import cuc.sture.repository.StudentRepository;


public class TestRepositoryCrud {
	
	private static Logger log = Logger.getLogger(TestRepositoryCrud.class);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		log.debug("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log.debug("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		log.debug("setUP");
	}

	@After
	public void tearDown() throws Exception {
		log.debug("tearDown");
	}

//	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCRUD() {
//		fail("Not yet implemented");
		ConfigurableApplicationContext ctx = SpringApplication.run(AppConfigMain.class);
		 
	    StudentRepository stuRepo = ctx.getBean(StudentRepository.class);
//	    myService.doStuff();
	    stuRepo.save(new Student("20010101-test", "chen-test"));
	    
	    log.info("save student success .. ");
	    
	    PersonRepository personRepo = ctx.getBean(PersonRepository.class);
//	    myService.doStuff();
	    personRepo.save(new Person("Zheng", "CHEN"));
	    
	    java.util.List<Student> list = stuRepo.findByStuId("20010101-test");
	    
	    if (list.size() != 0){
	    	Student getStu = list.get(0);
	    	log.info("get student(for update) success .. "  + getStu.toString());
	    	getStu.setStuId("20010101-update");
	    	getStu.setName("chen-update");
	    	stuRepo.save(getStu);
	    	log.info("update student success .. " + getStu.toString());
	    }
	    else{
	    	log.warn("get student failed .. ");
	    }
	    
	    list = stuRepo.findByStuId("20010101-test");
	    
	    if (list.size() != 0){
	    	 Student delStu  = list.get(0);
	    	log.info("get student(for del) success .. "  + delStu.toString());
	    	stuRepo.delete(delStu);
	    	log.info("delete student success .. " + delStu.toString());
	    }
	    else{
	    	log.warn("del student not found .. ");
	    }
	    
	    
	}

}
