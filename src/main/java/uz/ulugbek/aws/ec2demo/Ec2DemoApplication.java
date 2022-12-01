package uz.ulugbek.aws.ec2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ec2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec2DemoApplication.class, args);
	}

}
