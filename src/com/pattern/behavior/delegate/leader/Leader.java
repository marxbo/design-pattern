package com.pattern.behavior.delegate.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * 领队-委派者
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/31 23:26
 */
public class Leader {

    private Map<String, ITarget> targets = new HashMap<>();

    {
        targets.put("加密", new TargetA());
        targets.put("登录", new TargetB());
    }

    /**
     * 领队自己不干活，委派给小弟
     *
     * @param command
     */
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
