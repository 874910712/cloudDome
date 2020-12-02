package per.chen.dome.cloud.controller;

/**
 * @Description
 * @ClassName GetStuController
 * @Author chengui
 * @date 2020.10.22 14:58
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.chen.dome.cloud.entity.Student;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/student")
public class GetStuController {


    @GetMapping(value = "/detail")
    public Object getStudent () throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        Student student = new Student();
        //可以看到，我们没有在实体类写get和set方法，但是我们依然可以调用这些方法
        //这就是Lombok插件的好处，只需要在实体类加一个@Data注解
        student.setName("张三");
        student.setSex("男");
        student.setAge(18);
        return student;
    }






}
