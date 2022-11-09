package com.jadm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JadmBbookInPrdApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(JadmBbookInPrdApplication.class, args);
    }
}
