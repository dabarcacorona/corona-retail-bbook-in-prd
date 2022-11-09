package com.jadm.scheduler;

import java.io.FileWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.http.HttpEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jadm.repository.BbookEnvioPrdRepository;
import com.jadm.service.BbookService;

@Component
public class ScheduledTasks {
	
    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    @Autowired
    private BbookService bbookservice;
	
  
    @Scheduled(cron = "${cron.expression}")
    public void scheduledBbook() throws InterruptedException {   	
    	LOG.info("{} : Generacion periodica para el envio de Productos  - {}", 
                dateTimeFormatter.format(LocalDateTime.now()));  

    	// Date exceptions  	
    	LocalDate today = LocalDate.now();
    	int count = 0;
    	
            bbookservice.EnvioPrd();
        
    }  // fin scheduledBulkUpdateWithFixedDelay()       

}
