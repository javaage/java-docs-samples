package com.cisco.la.service.Impl;
import java.util.List;
import com.cisco.la.dao.LaCrsHistoryDao;
import com.cisco.la.entity.LaCrsHistory;
import com.cisco.la.common.Assist;
import com.cisco.la.service.LaCrsHistoryService;
public class LaCrsHistoryServiceImpl implements LaCrsHistoryService{
    private LaCrsHistoryDao laCrsHistoryDao;
    @Override
    public long getLaCrsHistoryRowCount(Assist assist){
        return laCrsHistoryDao.getLaCrsHistoryRowCount(assist);
    }
    @Override
    public List<LaCrsHistory> selectLaCrsHistory(Assist assist){
        return laCrsHistoryDao.selectLaCrsHistory(assist);
    }
    @Override
    public LaCrsHistory selectLaCrsHistoryByObj(LaCrsHistory obj){
        return laCrsHistoryDao.selectLaCrsHistoryByObj(obj);
    }
    @Override
    public LaCrsHistory selectLaCrsHistoryById(Object id){
        return laCrsHistoryDao.selectLaCrsHistoryById(id);
    }
    @Override
    public int insertLaCrsHistory(LaCrsHistory value){
        return laCrsHistoryDao.insertLaCrsHistory(value);
    }
    @Override
    public int insertNonEmptyLaCrsHistory(LaCrsHistory value){
        return laCrsHistoryDao.insertNonEmptyLaCrsHistory(value);
    }
    @Override
    public int insertLaCrsHistoryByBatch(List<LaCrsHistory> value){
        return laCrsHistoryDao.insertLaCrsHistoryByBatch(value);
    }
    @Override
    public int deleteLaCrsHistoryById(Object id){
        return laCrsHistoryDao.deleteLaCrsHistoryById(id);
    }
    @Override
    public int deleteLaCrsHistory(Assist assist){
        return laCrsHistoryDao.deleteLaCrsHistory(assist);
    }
    @Override
    public int updateLaCrsHistoryById(LaCrsHistory enti){
        return laCrsHistoryDao.updateLaCrsHistoryById(enti);
    }
    @Override
    public int updateLaCrsHistory(LaCrsHistory value, Assist assist){
        return laCrsHistoryDao.updateLaCrsHistory(value,assist);
    }
    @Override
    public int updateNonEmptyLaCrsHistoryById(LaCrsHistory enti){
        return laCrsHistoryDao.updateNonEmptyLaCrsHistoryById(enti);
    }
    @Override
    public int updateNonEmptyLaCrsHistory(LaCrsHistory value, Assist assist){
        return laCrsHistoryDao.updateNonEmptyLaCrsHistory(value,assist);
    }

    public LaCrsHistoryDao getLaCrsHistoryDao() {
        return this.laCrsHistoryDao;
    }

    public void setLaCrsHistoryDao(LaCrsHistoryDao laCrsHistoryDao) {
        this.laCrsHistoryDao = laCrsHistoryDao;
    }

}