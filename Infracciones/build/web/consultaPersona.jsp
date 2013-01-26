<%-- 
    Document   : consultaPersona
    Created on : 23/01/2013, 11:33:13 PM
    Author     : JORGE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Personas</title>
        <link rel="stylesheet" type="text/css" href="styles/advanced.css">
        <link rel="stylesheet" href="styles/skins/aqua/theme.css" type="text/css"/>
        <link rel="stylesheet" href="styles/screen.css" type="text/css">
        <link rel="stylesheet" type="text/css" href="styles/jquery-ui-1.8.custom.css"/>
    </head>
    <body>
        <h1>Consulta de Personas</h1>
        <html:form action="/persona">
            <table border="0">
                <tbody>
                    <tr>
                        <td colspan="2"><bean:write name="PersonaForm" property="error" filter="false"/>&nbsp;</td>
                    </tr>
                    <tr>
                        <td> DNI: </td>
                        <td> <html:text property="dni" /> </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><html:submit value="Buscar"/></td>
                    </tr>
                </tbody>
            </table>
            <br/>
            <div id="divTablaPersona" class="cuerpoFormContenedorTablaLineal">
                <table border="1">
                    <caption>Lista Personas</caption>
                    <thead>
                        <tr>
                            <th>Nombres y Apellidos</th>
                            <th>DNI</th>
                            <th>Fecha Nacimiento</th>
                            <th> -- </th>
                        </tr>
                    </thead>
                    <tbody id="tbPersona">
                        <c:if test="${lstPersonas != null}">
                            <c:forEach var="persona" items="${lstPersonas}">
                                <tr>
                                    <td>${persona.name}</td>
                                    <td>${persona.dni}</td>
                                    <td>${persona.fecNacimiento}</td>
                                    <td><input type="radio" /> </td>
                                </tr>
                            </c:forEach>
                        </c:if>
                    </tbody>
                </table>
            </div>
        </html:form>
    </body>
</html:html>
