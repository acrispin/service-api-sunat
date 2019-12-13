package com.unicon.api.sunat.service;

import com.unicon.api.commons.beans.sunat.EmpresaSunatBean;

public interface ISunatService {

    EmpresaSunatBean obtenerEmpresaPorRuc(String ruc);

}
