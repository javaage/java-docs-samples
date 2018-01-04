package com.cisco.la.service.Impl;
import java.util.List;
import com.cisco.la.dao.LaCourseDao;
import com.cisco.la.entity.LaCourse;
import com.cisco.la.common.Assist;
import com.cisco.la.service.LaCourseService;
public class LaCourseServiceImpl implements LaCourseService{
    private LaCourseDao laCourseDao;
    @Override
    public long getLaCourseRowCount(Assist assist){
        return laCourseDao.getLaCourseRowCount(assist);
    }
    @Override
    public List<LaCourse> selectLaCourse(Assist assist){
        return laCourseDao.selectLaCourse(assist);
    }
    @Override
    public LaCourse selectLaCourseByObj(LaCourse obj){
        return laCourseDao.selectLaCourseByObj(obj);
    }
    @Override
    public LaCourse selectLaCourseById(Object id){
        return laCourseDao.selectLaCourseById(id);
    }
    @Override
    public int insertLaCourse(LaCourse value){
        return laCourseDao.insertLaCourse(value);
    }
    @Override
    public int insertNonEmptyLaCourse(LaCourse value){
        return laCourseDao.insertNonEmptyLaCourse(value);
    }
    @Override
    public int insertLaCourseByBatch(List<LaCourse> value){
        return laCourseDao.insertLaCourseByBatch(value);
    }
    @Override
    public int deleteLaCourseById(Object id){
        return laCourseDao.deleteLaCourseById(id);
    }
    @Override
    public int deleteLaCourse(Assist assist){
        return laCourseDao.deleteLaCourse(assist);
    }
    @Override
    public int updateLaCourseById(LaCourse enti){
        return laCourseDao.updateLaCourseById(enti);
    }
    @Override
    public int updateLaCourse(LaCourse value, Assist assist){
        return laCourseDao.updateLaCourse(value,assist);
    }
    @Override
    public int updateNonEmptyLaCourseById(LaCourse enti){
        return laCourseDao.updateNonEmptyLaCourseById(enti);
    }
    @Override
    public int updateNonEmptyLaCourse(LaCourse value, Assist assist){
        return laCourseDao.updateNonEmptyLaCourse(value,assist);
    }

    public LaCourseDao getLaCourseDao() {
        return this.laCourseDao;
    }

    public void setLaCourseDao(LaCourseDao laCourseDao) {
        this.laCourseDao = laCourseDao;
    }

}