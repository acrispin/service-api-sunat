package com.unicon.api.sunat.service;

import com.unicon.api.commons.beans.sunat.EmpresaSunatBean;
import com.unicon.api.sunat.dao.SunatDao;
import org.springframework.stereotype.Service;

@Service
public class SunarService implements ISunatService {

    @Override
    public EmpresaSunatBean obtenerEmpresaPorRuc(String ruc) {
        EmpresaSunatBean empresa = new SunatDao().selectById(ruc);
        if (empresa == null) {
            empresa = new EmpresaSunatBean();
        }
        return empresa;
    }
}
