package com.unicon.api.sunat.mapper;

import com.unicon.api.commons.beans.sunat.EmpresaSunatBean;

public interface ISunatMapper {

    EmpresaSunatBean selectById(String ruc);

}
