package dao;

import static org.junit.Assert.*;

import org.apache.log4j.*; 
import org.junit.*;


public class TestStudent {
	
	private static Logger log = Logger.getLogger(TestStudent.class);
	
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
	public void testStudent() {
//		fail("Not yet implemented");
	}

}
