<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" type="text/css" href="styles/advanced.css">
        <link rel="stylesheet" href="styles/skins/aqua/theme.css" type="text/css"/>
        <link rel="stylesheet" href="styles/screen.css" type="text/css">
        <link rel="stylesheet" type="text/css" href="styles/jquery-ui-1.8.custom.css"/>
        <html:base/>
    </head>
    <body style="background-color: white">
        <html:form action="/infracciones">

            <table border="0">
                <tbody>
                    <tr>
                        <td> DNI: </td>
                        <td> <html:text property="dni" /><a href="consultaPersona.jsp"><img src="images/btn_buscar.gif"></img></a> </td>
                    </tr>
                    <tr>
                        <td> Placa: </td>
                        <td> <html:text property="placa" /><a href="consultaInfracciones.jsp"><img src="images/btn_buscar.gif"></img></a> </td>
                    </tr>
                    <tr>
                        <td>&nbsp; </td>
                        <td><html:submit value="Buscar"/></td>
                    </tr>
                </tbody>
            </table>
                    <br/>
                    <div id="divTablaInfracciones" class="cuerpoFormContenedorTablaLineal">
                <table border="1">
                    <caption>Lista Impuestos</caption>
                    <thead>
                        <tr>
                            <th>Nombres</th>
                            <th>DNI</th>
                            <th>Codigo</th>
                            <th>Impuesto</th>
                            <th>Fecha Vencimiento</th>                            
                            <th> Correo </th>
                        </tr>
                    </thead>
                    <tbody id="tbPersona">
                        <%--<c:if test="${lstPersonas != null && lstPersonas.size > 0}">
                            <c:forEach var="persona" items="${lstPersonas}">
                                <tr>
                                    <td>${persona.name}</td>
                                    <td>${persona.apellido}</td>
                                    <td>${persona.dni}</td>
                                    <td>${persona.fecNacimiento}</td>
                                    <td>&nbsp; <a href=""><img src="images/generarCorreo.gif"></img></a> </td>
                                </tr>
                            </c:forEach>
                        </c:if>--%>
                        <tr>
                            <td>Roxana Cardenas Segovia</td>
                            <td>45675449</td>
                            <td>IM-154</td>
                            <td>Deuda 1</td>
                            <td>05/05/2013</td>
                            <td>&nbsp; <a href=""><img src="images/generarCorreo.gif" alt="Enviar Correo"></img></a> </td>
                        </tr>
                    </tbody>
                </table>
            </div>

        </html:form>
    </body>
</html:html>
