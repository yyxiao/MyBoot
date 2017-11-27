package com.xyy;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Scheduler
 * com.xyy
 *
 * @author xiaoyy
 * 测试spring boot 定时器
 * @Date 2017-11-27 上午8:50
 * The word 'impossible' is not in my dictionary.
 */
@Component
public class Scheduler {
    private final Logger logger = Logger.getLogger(this.getClass());

    @Scheduled(cron="0 0/1 * * * ?") //每分钟执行一次
//    @Scheduled(cron="0 0 23 * * ?") //每天23点执行一次
    public void statusCheck() {
        logger.info("每分钟执行一次。开始……");
        //statusTask.healthCheck();
        logger.info("每分钟执行一次。结束。");
    }

    @Scheduled(fixedRate=20000)
    public void testTasks() {
        logger.info("每20秒执行一次。开始……");
        //statusTask.healthCheck();
        logger.info("每20秒执行一次。结束。");
    }
}
