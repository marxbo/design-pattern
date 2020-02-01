package com.pattern.structure.decorator.upgrade;

import com.pattern.structure.decorator.old.ILoginOldService;

/**
 * 新登录接口-增强接口【必须继承旧登录接口】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 16:34
 */
public interface ILoginNewService extends ILoginOldService {

}
