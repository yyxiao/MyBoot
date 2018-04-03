package com.xyy.service;

/**
 * CallDependencyService
 * <p>
 * com.xyy.service
 *
 * @author Xander
 * @Date 2018-04-03 下午2:28
 * You have to believe in yourself. That‘s the secret of success.
 */
public interface CallDependencyService {

    public String mockGetUserInfo();

    public String fallback();
}
