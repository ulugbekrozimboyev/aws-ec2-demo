package uz.ulugbek.aws.ec2demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ulugbek.aws.ec2demo.dto.Ec2InstanceInfoDto;
import uz.ulugbek.aws.ec2demo.service.Ec2InstanceService;

@RestController
@RequestMapping("/")
public class HomeController {

    private Ec2InstanceService ec2InstanceService;

    public HomeController(Ec2InstanceService ec2InstanceService) {
        this.ec2InstanceService = ec2InstanceService;
    }

    @GetMapping
    public ResponseEntity<Ec2InstanceInfoDto> index(){
        return ResponseEntity.ok(ec2InstanceService.fetchInstanceInfo());
    }

}
