package com.cisco.la.service.Impl;
import java.util.List;
import com.cisco.la.dao.LaUserDao;
import com.cisco.la.entity.LaUser;
import com.cisco.la.common.Assist;
import com.cisco.la.service.LaUserService;
public class LaUserServiceImpl implements LaUserService{
    private LaUserDao laUserDao;
    @Override
    public long getLaUserRowCount(Assist assist){
        return laUserDao.getLaUserRowCount(assist);
    }
    @Override
    public List<LaUser> selectLaUser(Assist assist){
        return laUserDao.selectLaUser(assist);
    }
    @Override
    public LaUser selectLaUserByObj(LaUser obj){
        return laUserDao.selectLaUserByObj(obj);
    }
    @Override
    public LaUser selectLaUserById(String id){
        return laUserDao.selectLaUserById(id);
    }
    @Override
    public int insertLaUser(LaUser value){
        return laUserDao.insertLaUser(value);
    }
    @Override
    public int insertNonEmptyLaUser(LaUser value){
        return laUserDao.insertNonEmptyLaUser(value);
    }
    @Override
    public int insertLaUserByBatch(List<LaUser> value){
        return laUserDao.insertLaUserByBatch(value);
    }
    @Override
    public int deleteLaUserById(String id){
        return laUserDao.deleteLaUserById(id);
    }
    @Override
    public int deleteLaUser(Assist assist){
        return laUserDao.deleteLaUser(assist);
    }
    @Override
    public int updateLaUserById(LaUser enti){
        return laUserDao.updateLaUserById(enti);
    }
    @Override
    public int updateLaUser(LaUser value, Assist assist){
        return laUserDao.updateLaUser(value,assist);
    }
    @Override
    public int updateNonEmptyLaUserById(LaUser enti){
        return laUserDao.updateNonEmptyLaUserById(enti);
    }
    @Override
    public int updateNonEmptyLaUser(LaUser value, Assist assist){
        return laUserDao.updateNonEmptyLaUser(value,assist);
    }

    public LaUserDao getLaUserDao() {
        return this.laUserDao;
    }

    public void setLaUserDao(LaUserDao laUserDao) {
        this.laUserDao = laUserDao;
    }

}