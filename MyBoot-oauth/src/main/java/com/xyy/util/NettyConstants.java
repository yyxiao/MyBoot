package com.xyy.util;

import org.springframework.stereotype.Component;

/**
 * NettyConstants
 * com.xyy.util
 *
 * @author Xander
 * @Description
 * @Date 2019-07-03 09:20
 * The word 'impossible' is not in my dictionary.
 */
@Component
public class NettyConstants {
    /**
     * 最大线程量
     */
    private static final int MAX_THREADS = 1024;
    /**
     * 数据包最大长度
     */
    private static final int MAX_FRAME_LENGTH = 65535;

    public static int getMaxFrameLength() {
        return MAX_FRAME_LENGTH;
    }

    public static int getMaxThreads() {
        return MAX_THREADS;
    }
}
