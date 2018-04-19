package cn.leejean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class Application {
    @RequestMapping("/")
    public String home() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("<center>");
    	sb.append("<h2>沁园春·雪</h2>");
    	sb.append("作者-毛泽东<br>");
    	sb.append("北国风光，千里冰封，万里雪飘。<br>");
    	sb.append("望长城内外，惟余莽莽；大河上下，顿失滔滔。<br>");
    	sb.append("山舞银蛇，原驰蜡象，欲与天公试比高。<br>");
    	sb.append("须晴日，看红装素裹，分外妖娆。<br>");
    	sb.append("江山如此多娇，引无数英雄竞折腰。<br>");
    	sb.append("惜秦皇汉武，略输文采；唐宗宋祖，稍逊风骚。<br>");
    	sb.append("一代天骄，成吉思汗，只识弯弓射大雕。<br>");
    	sb.append("俱往矣，数风流人物，还看今朝。<br>");
    	sb.append("</center>");
        return sb.toString();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
