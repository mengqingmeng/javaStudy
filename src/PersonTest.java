import org.junit.*;

import static junit.framework.Assert.*;

/**
 * Created by MQM on 2017,1,1,0001.
 */
public class PersonTest {

	/**
	 * private 本类内使用
	 * default 本包使用
	 * protected	子类可用
	 * public classpath下可用
	 */
	private static Person p;

	/**
	 * @BeforeClass和@Before区别：
	 * @BeforeClass 类加载的时候运行,注解的方法为static方法
	 * @Before 每个方法加载的时候运行,注解的方法不是static方法
	 *
	 * @AfterClass和@After 同上
	 */

	//@BeforeClass
	@Before
	public void beforee(){
		p = new Person();
		System.out.println("init");
	}

	@Test
	public void testEat(){
		p.eat();
	}
	@Test
	public void testRun(){
		p.run();
	}


	//@AfterClass
	@After
	public void after(){
		System.out.println("destory");
	}
}