package com.cisco.la.service.Impl;
import java.util.List;
import com.cisco.la.dao.LaRoleDao;
import com.cisco.la.entity.LaRole;
import com.cisco.la.common.Assist;
import com.cisco.la.service.LaRoleService;
public class LaRoleServiceImpl implements LaRoleService{
    private LaRoleDao laRoleDao;
    @Override
    public long getLaRoleRowCount(Assist assist){
        return laRoleDao.getLaRoleRowCount(assist);
    }
    @Override
    public List<LaRole> selectLaRole(Assist assist){
        return laRoleDao.selectLaRole(assist);
    }
    @Override
    public LaRole selectLaRoleByObj(LaRole obj){
        return laRoleDao.selectLaRoleByObj(obj);
    }
    @Override
    public LaRole selectLaRoleById(String id){
        return laRoleDao.selectLaRoleById(id);
    }
    @Override
    public int insertLaRole(LaRole value){
        return laRoleDao.insertLaRole(value);
    }
    @Override
    public int insertNonEmptyLaRole(LaRole value){
        return laRoleDao.insertNonEmptyLaRole(value);
    }
    @Override
    public int insertLaRoleByBatch(List<LaRole> value){
        return laRoleDao.insertLaRoleByBatch(value);
    }
    @Override
    public int deleteLaRoleById(String id){
        return laRoleDao.deleteLaRoleById(id);
    }
    @Override
    public int deleteLaRole(Assist assist){
        return laRoleDao.deleteLaRole(assist);
    }
    @Override
    public int updateLaRoleById(LaRole enti){
        return laRoleDao.updateLaRoleById(enti);
    }
    @Override
    public int updateLaRole(LaRole value, Assist assist){
        return laRoleDao.updateLaRole(value,assist);
    }
    @Override
    public int updateNonEmptyLaRoleById(LaRole enti){
        return laRoleDao.updateNonEmptyLaRoleById(enti);
    }
    @Override
    public int updateNonEmptyLaRole(LaRole value, Assist assist){
        return laRoleDao.updateNonEmptyLaRole(value,assist);
    }

    public LaRoleDao getLaRoleDao() {
        return this.laRoleDao;
    }

    public void setLaRoleDao(LaRoleDao laRoleDao) {
        this.laRoleDao = laRoleDao;
    }

}