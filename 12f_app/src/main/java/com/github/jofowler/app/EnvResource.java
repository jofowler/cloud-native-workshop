package com.github.jofowler.app;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvResource {
	private Environment environment;
	@RequestMapping(value = "/get-env", method = RequestMethod.GET)
	public String getEnv(@RequestParam String env) {
	    return "Env" + " " + environment.getProperty(env);
	}
}
