package com.imooc.demo.service.impl;

import com.imooc.demo.dao.AreaDao;
import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaServiceI {

    @Autowired
    private AreaDao areaDao;

    @Transactional
    @Override
    public boolean addArea(Area area) {
        if (area.getAreaName() != null && area.getAreaName().isEmpty())
        {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.insertArea(area);
                if (effectedNum > 0)
                {
                    return  true;
                }
                else
                {
                    throw new RuntimeException("插入区域信息失败！");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("插入区域信息失败：" + e.getMessage());
            }
        }
        else
        {
            throw new RuntimeException("区域信息不能为空！");
        }
    }
    @Transactional
    @Override
    public boolean modifyArea(Area area) {
        if (area.getAreaId() != null && area.getAreaId() > 0)
        {
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.updateArea(area);
                if (effectedNum >  0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("更新区域信息失败！");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("更新区域信息失败：" + e.getMessage());
            }
        }
        else
        {
            throw new RuntimeException("区域信息不能为空！");
        }
    }
    @Transactional
    @Override
    public boolean removeArea(int areaId) {
        if (areaId > 0)
        {
            try {
                //删除区域信息
                int effectedNum = areaDao.deleteArea(areaId);
                if (effectedNum > 0)
                {
                    return  true;
                }
                else
                {
                    throw new RuntimeException("删除区域信息失败！");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("删除区域信息失败：" + e.getMessage());
            }
        }
        else
        {
            throw new RuntimeException("区域Id不能为空！");
        }
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
