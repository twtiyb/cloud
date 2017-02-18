package cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chunchun.xu on 2017/2/7.
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserApiController {
	@RequestMapping("/getProfile")
	public String getProfile() {
		return "ss";
	}
}
