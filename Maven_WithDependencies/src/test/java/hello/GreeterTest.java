package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

	@Test
	public void greeterSaysHello() {
		assertThat(Greeter.sayHello(), containsString("Hello"));
	}

}