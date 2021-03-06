<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script>
    function buscarPersona(){
        var popupWin = window.open("consultaPersona.jsp","ConsultaPersonas","center:yes,height=400,width=550,menubar=no,status=yes,resizable=no,scrollbars=yes,left=400, top=100, screenX=50, screenY=100");
    }
    
    function buscarPlaca(){
        var popupWin = window.open("consultaInfracciones.jsp","ConsultaInfracciones","center:yes,height=400,width=550,menubar=no,status=yes,resizable=no,scrollbars=yes,left=400, top=100, screenX=50, screenY=100");
    }
    
</script>
<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" type="text/css" href="styles/advanced.css">
        <link rel="stylesheet" href="styles/skins/aqua/theme.css" type="text/css"/>
        <link rel="stylesheet" href="styles/screen.css" type="text/css">
        <link rel="stylesheet" type="text/css" href="styles/jquery-ui-1.8.custom.css"/>
        <html:base/>
        
        <style type="text/css">
        <!--
        BODY { background: #ffffff url(images/carro.jpg) no-repeat; position: static}
        -->
        </style>
        
        
    </head>
    <body>
        <h1>Consulta de Impuestos</h1>
        <br/>
        <html:form action="/infracciones" style="">

            <table border="0">
                <tbody>
                    <tr>
                        <td> DNI: </td>
                        <td> <html:text property="dni"/><a href="javascript:buscarPersona();"><img src="images/btn_buscar.gif"></img></a> </td>
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
                            <td>&nbsp; <a href="http://10.90.5.151:8080/PracticaJms-war/Consumidor?dni=00119992"><img src="images/generarCorreo.gif" alt="Enviar Correo"></img></a> </td>
                        </tr>
                    </tbody>
                </table>
            </div>

        </html:form>
    </body>
</html:html>
