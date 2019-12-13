package com.unicon.api.sunat.controller;

import com.unicon.api.commons.beans.sunat.EmpresaSunatBean;
import com.unicon.api.sunat.service.ISunatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SunatController {

    private static Logger log = LoggerFactory.getLogger(SunatController.class);

    @Autowired
    public ISunatService sunatService;

    @GetMapping("")
    public EmpresaSunatBean getEmpresaByRuc(@RequestParam(defaultValue = "") String ruc) {
        log.info("listar empresa por ruc: " + ruc);
        return sunatService.obtenerEmpresaPorRuc(ruc);
    }
}
