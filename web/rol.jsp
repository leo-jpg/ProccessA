<%-- 
    Document   : unidadInterna
    Created on : 03-oct-2019, 23:45:51
    Author     : RepjA
--%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="dataSource" driver="oracle.jdbc.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:XE" user="TASK" password="admin"></sql:setDataSource>
    <sql:query dataSource="${dataSource}" var="tipo">
        SELECT id_jerarquia, descripcion FROM jerarquia 
    </sql:query> 
    <form action="procesoRol" method="POST">
        <div class="form-group">
            <label>Descripción:</label>
            <input type="text" name="txtDescripcion" placeholder="Ej: Administrador" minlength="3" maxlength="15" required="" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Jerarquia:</label>
            <select name="cboJerarquia" id="cboJerarquia" class="form-control">
                <c:forEach var="tipos" items="${tipo.rows}">
                    <option value="${tipos.id_jerarquia}">${tipos.descripcion}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group text-center">
            <input type="submit" name="btnAccion" value="Agregar" class="btn btn-primary"/>
            <input type="reset" name="btnAccion" value="Limpiar" class="btn btn-danger"/>
        </div>
    </form>
    <c:if test="${msjOK != null}">
        <div class="alert alert-success">
            <strong>Correcto!</strong> ${msjOK}.
        </div>
    </c:if>
    <c:if test="${msjNO != null}">
        <div class="alert alert-danger">
            <strong>Error!</strong> ${msjNO}.
        </c:if>   
    </table>
</body>
</html>
