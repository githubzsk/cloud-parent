package com.xintong.cloudkafka;

import com.xintong.cloudkafka.provider.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CloudKafkaApplication {
    @Autowired
    private KafkaProducer product;
    @PostConstruct
    public void init(){
        for(int i=0;i<10;i++){
            product.send("afs"+i);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudKafkaApplication.class, args);
    }

}
