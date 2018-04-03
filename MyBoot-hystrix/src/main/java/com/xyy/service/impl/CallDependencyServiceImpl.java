package com.xyy.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xyy.service.CallDependencyService;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * CallDependencyServiceImpl
 * com.xyy.service.impl
 * service 具体方法明确fallbackMethod
 * @author Xander
 * @Date 2018-04-03 下午2:28
 * The word 'impossible' is not in my dictionary.
 */
@Component
public class CallDependencyServiceImpl implements CallDependencyService{

    private Random random = new Random();
    /**
     * 模拟获取用户信息(通过网络调用)
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public String mockGetUserInfo(){
        int randomInt= random.nextInt(10) ;
        if(randomInt<8){  //模拟调用失败情况
            throw new RuntimeException("call dependency service fail.");
        }else{
            return "UserName:ceshi;number:"+randomInt;
        }
    }

    public String fallback(){
        return "some exception occur call fallback method.";
    }
}
