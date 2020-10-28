package com.manger;

import java.util.Map;

/**
 * @ClassNmae QuartzService
 * @Discription  任务管理
 * @Author wh
 * @Date 2020/10/27  15:40
 * @Version 1.0
 */
public interface QuartzService {
    /**
     * 添加任务可以传参数
     *
     * @param clazz
     * @param jobName
     * @param groupName
     * @param cronExp
     * @param param
     */
    void addJob(Class clazz, String jobName, String groupName, String cronExp, Map<String, Object> param);

    /**
     * 暂停任务
     *
     * @param name
     * @param groupName
     */
    void pauseJob(String name, String groupName);

    /**
     * 恢复任务
     *
     * @param name
     * @param groupName
     */
    void resumeJob(String name, String groupName);

    /**
     * 更新任务
     *
     * @param name
     * @param groupName
     * @param cronExp
     * @param param
     */
    void updateJob(String name, String groupName, String cronExp, Map<String, Object> param);

    /**
     * 删除任务
     *
     * @param name
     * @param groupName
     */
    void deleteJob(String name, String groupName);

    /**
     * 启动所有任务
     */
    void startAllJobs();

    /**
     * 关闭所有任务
     */
    void shutdownAllJobs();
}
