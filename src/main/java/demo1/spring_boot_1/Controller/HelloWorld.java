package demo1.spring_boot_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	@ResponseBody
	@RequestMapping("hello")
	public String hello() {
		String aaa = "dasd";
		return "hellodqwdwqdqwdqwd1111dqwqwdaAAAA";
	}
}
