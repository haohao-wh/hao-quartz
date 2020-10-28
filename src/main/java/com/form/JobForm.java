package com.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassNmae JobForm
 * @Discription
 * @Author wh
 * @Date 2020/10/27  16:07
 * @Version 1.0
 */
@Data
public class JobForm {
    private  String jobName;
    private  String groupName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cronDate;
}
