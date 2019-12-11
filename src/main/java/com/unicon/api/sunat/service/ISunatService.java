package com.unicon.api.sunat.service;

import com.unicon.api.sunat.beans.EmpresaSunatBean;

public interface ISunatService {

    EmpresaSunatBean obtenerEmpresaPorRuc(String ruc);

}
