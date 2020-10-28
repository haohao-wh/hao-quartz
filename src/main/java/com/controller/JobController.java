package com.controller;

import com.form.JobForm;
import com.quarzt.OrderTimeOutJob;
import com.manger.QuartzService;
import com.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassNmae aa
 * @Discription
 * @Author wh
 * @Date 2020/10/27  15:43
 * @Version 1.0
 */
@RestController
public class JobController {

    @Autowired
    QuartzService service;

    /**
     * 添加新任务
     *
     * @return
     */
    @RequestMapping("/addJob")
    public Object addJob(@RequestBody JobForm jobForm) {
        Map<String, Object> resultMap = new HashMap<>();
//        //任务组名
//        String groupName = "order";
//        //任务名
//        String jobName = "20190724120322389224";
        //CRON表达式
        String cronExp = DateUtil.getCron(jobForm.getCronDate());
        service.addJob(OrderTimeOutJob.class, jobForm.getGroupName(), jobForm.getJobName(), cronExp, null);
        resultMap.put("groupName", jobForm.getGroupName());
        resultMap.put("jobName", jobForm.getJobName());
        resultMap.put("cronExp", cronExp);
        return resultMap;
    }


    /**
     * 删除任务
     *
     * @return
     */
    @RequestMapping("/delJob")
    public Object delJob(@RequestBody JobForm jobForm) {
        Map<String, Object> resultMap = new HashMap<>();
//        //任务组名
//        String groupName = "order";
//        //任务名
//        String jobName = "20190724120322389224";
        service.deleteJob(jobForm.getJobName(), jobForm.getGroupName());
        resultMap.put("groupName", jobForm.getJobName());
        resultMap.put("jobName", jobForm.getJobName());
        return resultMap;
    }
}
