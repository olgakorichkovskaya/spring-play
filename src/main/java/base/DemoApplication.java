package base;

import base.profiles.MySettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    @Profile("dev")
    public MySettings embeddedDataSource() {
        return new MySettings("dev");
    }

    @Bean
    @Profile("prod")
    public MySettings jndiDataSource() {
        return new MySettings("prod");
    }
}
