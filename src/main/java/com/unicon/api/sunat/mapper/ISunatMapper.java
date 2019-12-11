package com.unicon.api.sunat.mapper;

import com.unicon.api.sunat.beans.EmpresaSunatBean;

public interface ISunatMapper {

    EmpresaSunatBean selectById(String ruc);

}
