package com.imooc.demo.service;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaServiceI {
    /**
     * 插入区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean removeArea(int areaId);

    /**
     * 根据Id列出具体区域
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 列出所有区域
     * @return
     */
    List<Area> getAreaList();
}
