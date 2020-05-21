package com.xintong.cloudother.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {TulingSelector.class})
public class TulingConfig {

}
