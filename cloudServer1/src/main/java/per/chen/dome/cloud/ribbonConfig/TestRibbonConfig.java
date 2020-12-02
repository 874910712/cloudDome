package per.chen.dome.cloud.ribbonConfig;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @ClassName TestRibbonConfig
 * @Author chengui
 * @date 2020.12.02 22:11
 */
@Configuration
public class TestRibbonConfig {


    @Bean
    //随机负载均衡策略
    public RandomRule randomRule(){
        return new RandomRule();
    }

    @Bean
    //随机负载均衡策略
    public AvailabilityFilteringRule availabilityFilteringRule(){
        return new AvailabilityFilteringRule();
    }


}
