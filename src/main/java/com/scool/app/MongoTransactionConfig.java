
package com.scool.app;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.data.mongodb.MongoDbFactory; 
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = "com.scool.app.dao") 
public class MongoTransactionConfig extends AbstractMongoClientConfiguration{

	@Bean MongoTransactionManager transactionManager(MongoDbFactory dbFactoryMongo)
	{
		return new MongoTransactionManager(dbFactoryMongo); 
		}
	@Override
	protected String getDatabaseName() {
		return "SCOOLBD";
	}

	@Override
	public MongoClient mongoClient() {
		MongoClient mongoClient = MongoClients.create("mongodb://localhost");
		return mongoClient;
	}
}
