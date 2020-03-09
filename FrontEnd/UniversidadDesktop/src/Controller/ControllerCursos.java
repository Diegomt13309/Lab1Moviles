/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import ModelView.TablaModelView2;
import View.ViewCursos;
import exceptions.GlobalException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Curso;
import models.Model;

/**
 *
 * @author demil
 */
public class ControllerCursos {

    public ControllerCursos(ViewCursos vc, TablaModelView2 model) {
        model.setTablaCursos(new ArrayList());
        this.domainModel = new Model();
        this.vc = vc;
        this.model = model;
        vc.setController(this);
        vc.setModel(model);
    }

    public boolean insertarCurso(Curso curso) throws Exception {
        return domainModel.AddCurso(curso);
    }

    public void buscar(String a) throws GlobalException, Exception {
        switch (a) {
            case "":
                this.buscarCursos();
                break;
            default:
                this.buscarCodCurso1(a);
        }
    }

    public List<Curso> buscarCursos() throws GlobalException {
        List<Curso> l = domainModel.allCurso();
        model.setTablaCursos(l);
        return l;
    }

    public Curso buscarCodCurso(String cod) throws Exception {
        Curso cur = domainModel.buscarCodCurso(cod);
        return cur;
    }

    public boolean buscarCodCurso1(String cod) throws Exception {
        Curso cur = domainModel.buscarCodCurso(cod);
        if (cur != null) {
            model.getCursos().clear();
            model.agregaCurso(cur);
            model.setTablaCursos(model.getCursos());
            return true;
        }
        model.setTablaCursos(new ArrayList<>());
        return false;
    }

    public boolean updateCurso(Curso cur) throws SQLException, GlobalException {
        return domainModel.updateCurso(cur);
    }
    
    public boolean deleteCurso(String cod) throws SQLException{
        return domainModel.deleteCurso(cod);
    }

    public void enter() {
        this.show();
    }

    public void show() {
        vc.setVisible(true);
    }

    ViewCursos vc;
    Model domainModel;
    TablaModelView2 model;
}