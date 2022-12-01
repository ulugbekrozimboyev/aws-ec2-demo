package uz.ulugbek.aws.ec2demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "AwsCheckIpService", url = "http://checkip.amazonaws.com/")
public interface AwsCheckIpService {

    @GetMapping
    String getIpAddress();

}
