package br.uff.dac.t1.controleprojetos.modelo.br.uff.dac.t1.controleprojetos.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "test", eager = true)
public class TestBean {

    public String getMessage() {
        return "Test works!";
    }

}
