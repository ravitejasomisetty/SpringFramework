/**
 * 
 */
package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Raviteja
 *
 */

@RestController
public class GreetingController {
	private static final String greetingTemplate = "Hello %s";
	private final AtomicLong id = new AtomicLong();

	@RequestMapping(value = "/greeting",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
		return new Greeting(id.incrementAndGet(),String.format(greetingTemplate, name));		
	}
}
