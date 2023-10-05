package com.redhat.appfoundations.camel.quarkus;
import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.olingo.client.core.domain.ClientEntityImpl;


import javax.inject.Named;
import javax.inject.Singleton;
import javax.validation.constraints.Null;

@Singleton
@Named("BirthAggregationStrategy")
public class BirthAggregationStrategy implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        if (oldExchange == null) {
            return newExchange;
        }

        if (oldExchange.getIn().getBody().getClass().equals(Person.class)){
            Person citizien = oldExchange.getIn().getBody(Person.class);
            ClientEntityImpl entity = newExchange.getIn().getBody(ClientEntityImpl.class); 
            // Gender and Concurrency attributes hardcoded --> DEMO
            if (entity != null)  {
            String gender = entity.getProperty("Gender").getValue().toString();
            String concurrency= entity.getProperty("Concurrency").getValue().toString();
            citizien.setGender(gender);
            citizien.setConcurrency(concurrency);            
            }
            oldExchange.getIn().setBody(citizien); 
        }
        if (oldExchange.getIn().getBody().getClass().equals(ClientEntityImpl.class)){
            Person citizien = newExchange.getIn().getBody(Person.class);
            ClientEntityImpl entity = oldExchange.getIn().getBody(ClientEntityImpl.class); 
            // Gender and Concurrency attributes hardcoded --> DEMO
            String gender = entity.getProperty("Gender").getValue().toString();
            String concurrency= entity.getProperty("Concurrency").getValue().toString();
            citizien.setGender(gender);
            citizien.setConcurrency(concurrency);            
            oldExchange.getIn().setBody(citizien); 

        }

        return oldExchange;
    }
}