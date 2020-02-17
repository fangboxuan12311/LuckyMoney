package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

//@RestController=@Controller+@ResponseBody
@Controller
//@ResponseBody //全局返回字符串
@RequestMapping("/hello")//全局
public class HelloController {

    /*//Value("${minMoney}") //单个配置时用@value，多个配置时用LimlitConfig对象
    private BigDecimal minMoney;

    //@Value("${maxMoney}")
    private BigDecimal maxMoney;

    //@Value("${description}")
    private String description;*/
    @Autowired
    private LimitConfig limitConfig;
    //@GetMapping({"/hello", "/hi"})//访问hi和hello 显示同样的内容
    //@GetMapping("/say") 浏览器 Postman都可以访问
    //@PostMapping("/say") 用Postman软件访问
    //@RequestMapping("/say")//即支持GetMapping 又支持PostMapping，但不支持这样

    //@RequestMapping(value = "/hello",method = RequestMethod.GET) 1.xx版本的写法
    @ResponseBody//ResponseBody,say方法返回字符串
    /*@GetMapping("/say/{id}")//获取url参数 方法一 Website:http://localhost:8081/luckymoney/hello/say/100 输出id=100
    public String say(@PathVariable("id" )Integer id){*/
    /*@GetMapping("/say")//获取url参数 方法二 Website http://localhost:8081/luckymoney/hello/say?id=100 输出id=100
    public String say(@RequestParam("id" )Integer id){*/
    @PostMapping("/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0")Integer id){//非必传
        //return "Description:  "+limitConfig.getDescription();//@ResponseBody返回字符串
        //return "index";
        return "id: "+id;
    }

    //@GetMapping("/hello2")
   // public String sayy(){
     //   return "index";//没有@ResponseBody还要有thymeleaf依赖返回到index.html模板
        //Website http://localhost:8081/luckymoney/hello2
        //Not http://localhost:8081/luckymoney/hello2/index
        //Neither http://localhost:8081/luckymoney/index
   // }
   /*获取请求中的参数:@PathVariable url中的数据 @RequestParam获取请求参数的值*/
}
