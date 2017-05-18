import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application
 * PACKAGE_NAME
 *
 * @author xiaoyy
 * 主函数，包含main函数
 * @Date 2017-05-17 上午10:39
 * The word 'impossible' is not in my dictionary.
 */

@SpringBootApplication
@MapperScan("mapper")
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);

    /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= SpringBoot Start Success =============");
    }

}
