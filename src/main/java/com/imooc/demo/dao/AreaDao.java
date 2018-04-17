package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * AreaDao
 */
public interface AreaDao {

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);

    /**
     * 根据Id列出具体区域
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 列出所有区域
     * @return
     */
    List<Area> queryArea();
}
