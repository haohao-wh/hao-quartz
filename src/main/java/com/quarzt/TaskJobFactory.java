package com.quarzt;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassNmae aa
 * @Discription
 * @Author wh
 * @Date 2020/10/27  15:37
 * @Version 1.0
 */
@Component
public class TaskJobFactory extends AdaptableJobFactory {
    @Autowired
    AutowireCapableBeanFactory capableBeanFactory;


    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        //调用父类的方法
        Object jobInstance = super.createJobInstance(bundle);
        //进行注入
        capableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }


}
