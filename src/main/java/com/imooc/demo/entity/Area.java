package com.imooc.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Area {
    //主键ID
    private Integer areaId;
    //名称
    private String areaName;
    //权重
    private  Integer priority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;

}
