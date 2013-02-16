<%-- 
    Document   : consultaInfracciones
    Created on : 24/01/2013, 12:28:09 AM
    Author     : JORGE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<script>
    function cargarInfraccion(infraccion){
        window.opener.InfraccionesForm.placa.value = infraccion;
        window.close();
    }
    
</script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Infracciones</title>
        
        <link rel="stylesheet" type="text/css" href="styles/advanced.css">
        <link rel="stylesheet" href="styles/skins/aqua/theme.css" type="text/css"/>
        <link rel="stylesheet" href="styles/screen.css" type="text/css">
        <link rel="stylesheet" type="text/css" href="styles/jquery-ui-1.8.custom.css"/>
    </head>
    <body>
        <h1>Consulta de Infracciones</h1>
        
        <html:form action="/infracciones">
            <table border="0">
                <tbody>
                    <tr>
                        <td colspan="2"><bean:write name="InfraccionesForm" property="error" filter="false"/>&nbsp;</td>
                    </tr>
                    <tr>
                        <td> Placa: </td>
                        <td> <html:text property="placa" /> </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><html:submit value="Buscar"/></td>
                    </tr>
                </tbody>
            </table>
            <br/>
            <div id="divTablaInfracciones" class="cuerpoFormContenedorTablaLineal">
                <table border="1">
                    <caption>Lista Infracciones</caption>
                    <thead>
                        <tr>
                            <th>Placa</th>
                            <th>Marca</th>
                            <th>Modelo</th>
                            <th>Fecha Fabricacion</th>
                            <th> -- </th>
                        </tr>
                    </thead>
                    <tbody id="tbInfracciones">
                        <c:if test="${lstInfracciones != null && lstInfracciones.size > 0}">
                            <c:forEach var="infraccion" items="${lstInfracciones}">
                                <tr>
                                    <td>${infraccion.placa}</td>
                                    <td>${infraccion.marca}</td>
                                    <td>${infraccion.modelo}</td>
                                    <td>${infraccion.fecFabrica}</td>
                                    <td><input type="radio" onclick="javascript:cargarPersona(${persona.dni});"/> </td>
                                </tr>
                            </c:forEach>
                        </c:if>
                    </tbody>
                </table>
            </div>
        </html:form>
    </body>
</html>
