package com.cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chunchun.xu on 2017/2/7.
 */
@Controller
@ResponseBody
@RequestMapping("/test")
public class ConfigController {
	@RequestMapping("/getProfile")
	public String getProfile() {
		return "ss";
	}
}
