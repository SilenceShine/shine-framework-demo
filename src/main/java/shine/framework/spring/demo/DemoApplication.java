package shine.framework.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shine.framework.util.log.LogUtil;

/**
 * @author SilenceShine
 * @since 1.0
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DemoApplication.class, args);
            LogUtil.info(DemoApplication.class, "启动成功!");
        } catch (Exception e) {
            LogUtil.error(DemoApplication.class, "启动失败:{}", e.getMessage());
        }
    }

}
