package com.okay.family.service.impl;

import com.okay.family.common.bean.pubdata.DelDataBean;
import com.okay.family.common.bean.pubdata.PubDataBean;
import com.okay.family.mapper.PubDataMapper;
import com.okay.family.service.IPubDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PubDataServiceImpl implements IPubDataService {


    PubDataMapper pubDataMapper;

    @Autowired
    public PubDataServiceImpl(PubDataMapper pubDataMapper) {
        this.pubDataMapper = pubDataMapper;
    }

    @Override
    public List<PubDataBean> getEnvDatas(int uid, int environment) {
        return null;
    }

    @Override
    public List<PubDataBean> getAllDatas(int uid) {
        List<PubDataBean> allDatas = pubDataMapper.getAllDatas(uid);
        return allDatas;
    }

    @Override
    public int addData(PubDataBean bean) {
        int add = pubDataMapper.add(bean);
        return add;
    }

    @Override
    public int delData(DelDataBean bean) {
        int i = pubDataMapper.delData(bean);
        return i;
    }

    @Override
    public int updateData(PubDataBean bean) {
        int i = pubDataMapper.updateData(bean);
        return i;
    }


}
