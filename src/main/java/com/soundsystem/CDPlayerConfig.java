package com.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by stefanvlahov on 12/9/16.
 */
@Configuration
@ComponentScan(basePackageClasses = Marker.class)
public class CDPlayerConfig {
}
