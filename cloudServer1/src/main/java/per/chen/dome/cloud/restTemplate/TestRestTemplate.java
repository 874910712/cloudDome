package per.chen.dome.cloud.restTemplate;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @ClassName TestRestTemplate
 * @Author chengui
 * @date 2020.12.02 22:06
 */
@Configuration
public class TestRestTemplate {

    @Bean
    /*底层使用ribbon进行负载均衡*/
    @LoadBalanced
    protected RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
