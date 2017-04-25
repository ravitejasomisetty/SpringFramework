import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javaspring.javaconfig.AppConfig;
import com.javaspring.javaconfig.CDPlayer;
import com.javaspring.javaconfig.CompactDisc;

/**
 * 
 */

/**
 * @author Raviteja
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class CDPlayerTest {

	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer player;
	
	@Test
	public void beansAreNotNull() {
		assertNotNull(cd);
		assertNotNull(player);
	}
	
	@Test
	public void cdIsNotNull(){
		assertNotNull(player.getCD());
	}

}
