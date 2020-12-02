package per.chen.dome.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @ClassName ErrorController
 * @Author chengui
 * @date 2020.10.22 15:33
 */
@RestController
public class ErrorController {


    @RequestMapping(value = "/fallback")
    public Object fallback () {
        Map<String , Object> result = new HashMap<>();
        result.put("code" , 0);
        result.put("msg" , "服务器繁忙");
        result.put("state" , false);
        return result;
    }





}
