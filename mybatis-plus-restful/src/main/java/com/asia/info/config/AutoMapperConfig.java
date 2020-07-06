package com.asia.config;

import com.github.dreamyoung.mprelation.AutoMapper;
import org.springframework.context.annotation.Bean;

//@Configuration
public class AutoMapperConfig {
	@Bean
	public AutoMapper autoMapper() {
		return new AutoMapper(new String[] { "com.asia.po"});
	}
}
