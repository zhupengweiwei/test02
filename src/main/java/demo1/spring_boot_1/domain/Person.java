package demo1.spring_boot_1.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class Person {

	private String name;
	@Value("")
	private String email;
}
