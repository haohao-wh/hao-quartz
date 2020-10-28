package com.quarzt;

import com.config.ApplicationContextUtil;
import com.service.UserService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * @ClassNmae aa
 * @Discription
 * @Author wh
 * @Date 2020/10/27  15:42
 * @Version 1.0
 */
public class OrderTimeOutJob implements Job {


    @Override
    public void execute(JobExecutionContext context) {
        //获取任务名
        String taskName = context.getJobDetail().getKey().getName();
        System.out.println("taskName->" + taskName);
        //todo:处理执行任务时的业务代码
        UserService appLogService = (UserService) ApplicationContextUtil.getBean("userServiceImpl");
        appLogService.hello(taskName);
    }
}
