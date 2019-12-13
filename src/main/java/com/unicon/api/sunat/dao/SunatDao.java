package com.unicon.api.sunat.dao;

import com.unicon.api.commons.beans.sunat.EmpresaSunatBean;
import com.unicon.api.commons.db.dao.DaoApplication;
import com.unicon.api.commons.db.dao.enums.EConnectionType;
import com.unicon.api.sunat.mapper.ISunatMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

@Log4j2
public class SunatDao extends DaoApplication<EmpresaSunatBean, ISunatMapper> {

    @Override
    protected Class<EmpresaSunatBean> getClassType() {
        return EmpresaSunatBean.class;
    }

    @Override
    protected Logger getLogger() {
        return log;
    }

    @Override
    protected EConnectionType getConnectionType() {
        return EConnectionType.SINGLE;
    }

    @Override
    protected Class<ISunatMapper> getMapperType() {
        return ISunatMapper.class;
    }
}
