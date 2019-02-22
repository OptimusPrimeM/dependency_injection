package com.optimusprime.dependency_injection.config;

import com.optimusprime.dependency_injection.examplebeans.FakeDataSource;
import com.optimusprime.dependency_injection.examplebeans.FakeJMSDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig {

    @Value("${optimus.username}")
    String username;

    @Value("${optimus.password}")
    String password;

    @Value("${optimus.dburl}")
    String url;


    @Value("${optimus.jms.username}")
    String jmsUsername;

    @Value("${optimus.jms.password}")
    String jmsPassword;

    @Value("${optimus.jms.url}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource() {

        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(url);

        return fakeDataSource;
    }


    @Bean
    public FakeJMSDataSource fakeJMSDataSource() {

        FakeJMSDataSource fakeJMSDataSource = new FakeJMSDataSource();
        fakeJMSDataSource.setUsername(jmsUsername);
        fakeJMSDataSource.setPassword(jmsPassword);
        fakeJMSDataSource.setDburl(jmsUrl);

        return fakeJMSDataSource;
    }

}
