/**
 * 
 */
package com.javaspring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;

/**
 * @author Raviteja
 *
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.javaspring.javaconfig","com.javaspring.aspects"},
includeFilters=@Filter(type =FilterType.ANNOTATION, value = Aspect.class))
public class TrackCounterConfig {
	
}
