package uz.ulugbek.aws.ec2demo.service;

import com.amazonaws.util.EC2MetadataUtils;
import org.springframework.stereotype.Service;
import uz.ulugbek.aws.ec2demo.dto.Ec2InstanceInfoDto;

@Service
public class Ec2InstanceService {

    private AwsCheckIpService awsCheckIpService;

    public Ec2InstanceService(AwsCheckIpService awsCheckIpService) {
        this.awsCheckIpService = awsCheckIpService;
    }

    public Ec2InstanceInfoDto fetchInstanceInfo() {

        return new Ec2InstanceInfoDto(
                awsCheckIpService.getIpAddress(),
                EC2MetadataUtils.getEC2InstanceRegion(),
                EC2MetadataUtils.getAvailabilityZone()
        );
    }
}
