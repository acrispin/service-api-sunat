package com.unicon.api.sunat.controller;

import com.unicon.api.sunat.beans.EmpresaSunatBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SunatController {

    private static Logger log = LoggerFactory.getLogger(SunatController.class);

    @GetMapping("")
    public EmpresaSunatBean getEmpresaByRuc(@RequestParam(defaultValue = "") String ruc) {
        log.info("listar empresa por ruc: " + ruc);
        if (ruc == null || ruc.isEmpty())
        {
            return new EmpresaSunatBean();
        }
        EmpresaSunatBean empresa = new EmpresaSunatBean(
                "20272209325",
                "PESCA PERU MOLLENDO S.A.",
                "BAJA DEFINITIVA",
                "HABIDO",
                "150122"
        );
        empresa.setTipoVia("AV.");
        empresa.setNombreVia("JOSE PARDO");
        empresa.setCodigoZona("");
        empresa.setTipoZona("");
        empresa.setNumeroDomicilio("601");
        empresa.setInteriorDomicilio("1603");
        empresa.setLote("");
        empresa.setNumeroDepartamento("");
        empresa.setManzana("");
        empresa.setKilometro("");
        return empresa;
    }
}
