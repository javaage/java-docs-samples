package com.cisco.la.service.Impl;
import java.util.List;
import com.cisco.la.dao.LaGoldenSampleDao;
import com.cisco.la.entity.LaGoldenSample;
import com.cisco.la.common.Assist;
import com.cisco.la.service.LaGoldenSampleService;
public class LaGoldenSampleServiceImpl implements LaGoldenSampleService{
    private LaGoldenSampleDao laGoldenSampleDao;
    @Override
    public long getLaGoldenSampleRowCount(Assist assist){
        return laGoldenSampleDao.getLaGoldenSampleRowCount(assist);
    }
    @Override
    public List<LaGoldenSample> selectLaGoldenSample(Assist assist){
        return laGoldenSampleDao.selectLaGoldenSample(assist);
    }
    @Override
    public LaGoldenSample selectLaGoldenSampleByObj(LaGoldenSample obj){
        return laGoldenSampleDao.selectLaGoldenSampleByObj(obj);
    }
    @Override
    public LaGoldenSample selectLaGoldenSampleById(Object id){
        return laGoldenSampleDao.selectLaGoldenSampleById(id);
    }
    @Override
    public int insertLaGoldenSample(LaGoldenSample value){
        return laGoldenSampleDao.insertLaGoldenSample(value);
    }
    @Override
    public int insertNonEmptyLaGoldenSample(LaGoldenSample value){
        return laGoldenSampleDao.insertNonEmptyLaGoldenSample(value);
    }
    @Override
    public int insertLaGoldenSampleByBatch(List<LaGoldenSample> value){
        return laGoldenSampleDao.insertLaGoldenSampleByBatch(value);
    }
    @Override
    public int deleteLaGoldenSampleById(Object id){
        return laGoldenSampleDao.deleteLaGoldenSampleById(id);
    }
    @Override
    public int deleteLaGoldenSample(Assist assist){
        return laGoldenSampleDao.deleteLaGoldenSample(assist);
    }
    @Override
    public int updateLaGoldenSampleById(LaGoldenSample enti){
        return laGoldenSampleDao.updateLaGoldenSampleById(enti);
    }
    @Override
    public int updateLaGoldenSample(LaGoldenSample value, Assist assist){
        return laGoldenSampleDao.updateLaGoldenSample(value,assist);
    }
    @Override
    public int updateNonEmptyLaGoldenSampleById(LaGoldenSample enti){
        return laGoldenSampleDao.updateNonEmptyLaGoldenSampleById(enti);
    }
    @Override
    public int updateNonEmptyLaGoldenSample(LaGoldenSample value, Assist assist){
        return laGoldenSampleDao.updateNonEmptyLaGoldenSample(value,assist);
    }

    public LaGoldenSampleDao getLaGoldenSampleDao() {
        return this.laGoldenSampleDao;
    }

    public void setLaGoldenSampleDao(LaGoldenSampleDao laGoldenSampleDao) {
        this.laGoldenSampleDao = laGoldenSampleDao;
    }

}