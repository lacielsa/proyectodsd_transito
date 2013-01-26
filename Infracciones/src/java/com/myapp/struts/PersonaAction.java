/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.datacontract.schemas._2004._07.servicegenes.Persona;

/**
 *
 * @author JORGE
 */
public class PersonaAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private final static String FAILURE = "failure";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        PersonaForm formPersona = (PersonaForm) form;
        int dni = formPersona.getDni();
        Persona listaDatosPersona = (Persona)listaDatosPersona(String.valueOf(dni));
        
        ArrayList<PersonaForm> perso = new ArrayList<PersonaForm>();
        PersonaForm personal = new PersonaForm();
        personal.setName(listaDatosPersona.getVNombre().getValue());
        personal.setDni(dni);
        personal.setFecNacimiento(listaDatosPersona.getVFecNac().getValue());
        perso.add(personal);
        
        request.setAttribute("lstPersonas", perso);
                
        return mapping.findForward(SUCCESS);
    }

    private static Persona listaDatosPersona(java.lang.String dni) {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        return port.listaDatosPersona(dni);
    }
}
