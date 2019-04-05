package ch.tagcloud.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class TagCloudApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TagCloudApplication.class);
    }
    
    private static Logger logger = LogManager.getLogger(TagCloudApplication.class);

    public static void main(String[] args) throws Exception {
    	logger.info("Starting Spring Boot application..");
        SpringApplication.run(TagCloudApplication.class, args);
    }
}
