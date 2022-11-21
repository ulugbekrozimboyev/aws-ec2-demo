package uz.ulugbek.aws.ec2demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ec2InstanceInfoDto {

    private String IPAddress;
    private String regionName;
    private String AZName;

}
