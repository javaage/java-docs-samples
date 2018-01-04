package com.cisco.la.service.Impl;
import java.util.List;
import com.cisco.la.dao.LaRlHistoryDao;
import com.cisco.la.entity.LaRlHistory;
import com.cisco.la.common.Assist;
import com.cisco.la.service.LaRlHistoryService;
public class LaRlHistoryServiceImpl implements LaRlHistoryService{
    private LaRlHistoryDao laRlHistoryDao;
    @Override
    public long getLaRlHistoryRowCount(Assist assist){
        return laRlHistoryDao.getLaRlHistoryRowCount(assist);
    }
    @Override
    public List<LaRlHistory> selectLaRlHistory(Assist assist){
        return laRlHistoryDao.selectLaRlHistory(assist);
    }
    @Override
    public LaRlHistory selectLaRlHistoryByObj(LaRlHistory obj){
        return laRlHistoryDao.selectLaRlHistoryByObj(obj);
    }
    @Override
    public LaRlHistory selectLaRlHistoryById(Object id){
        return laRlHistoryDao.selectLaRlHistoryById(id);
    }
    @Override
    public int insertLaRlHistory(LaRlHistory value){
        return laRlHistoryDao.insertLaRlHistory(value);
    }
    @Override
    public int insertNonEmptyLaRlHistory(LaRlHistory value){
        return laRlHistoryDao.insertNonEmptyLaRlHistory(value);
    }
    @Override
    public int insertLaRlHistoryByBatch(List<LaRlHistory> value){
        return laRlHistoryDao.insertLaRlHistoryByBatch(value);
    }
    @Override
    public int deleteLaRlHistoryById(Object id){
        return laRlHistoryDao.deleteLaRlHistoryById(id);
    }
    @Override
    public int deleteLaRlHistory(Assist assist){
        return laRlHistoryDao.deleteLaRlHistory(assist);
    }
    @Override
    public int updateLaRlHistoryById(LaRlHistory enti){
        return laRlHistoryDao.updateLaRlHistoryById(enti);
    }
    @Override
    public int updateLaRlHistory(LaRlHistory value, Assist assist){
        return laRlHistoryDao.updateLaRlHistory(value,assist);
    }
    @Override
    public int updateNonEmptyLaRlHistoryById(LaRlHistory enti){
        return laRlHistoryDao.updateNonEmptyLaRlHistoryById(enti);
    }
    @Override
    public int updateNonEmptyLaRlHistory(LaRlHistory value, Assist assist){
        return laRlHistoryDao.updateNonEmptyLaRlHistory(value,assist);
    }

    public LaRlHistoryDao getLaRlHistoryDao() {
        return this.laRlHistoryDao;
    }

    public void setLaRlHistoryDao(LaRlHistoryDao laRlHistoryDao) {
        this.laRlHistoryDao = laRlHistoryDao;
    }

}