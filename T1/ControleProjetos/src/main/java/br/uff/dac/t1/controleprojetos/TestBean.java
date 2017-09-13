package br.uff.dac.t1.controleprojetos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "test", eager = true)
@SessionScoped
public class TestBean {

    public String getMessage() {
        return "Test works!";
    }

}
