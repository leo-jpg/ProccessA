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
        SELECT id_rol, descripcion FROM rol 
    </sql:query> 
        <sql:query dataSource="${dataSource}" var="tipo2">
        SELECT id_unidad, descripcion FROM unidad_interna 
    </sql:query> 
    <form action="procesoUsuario" method="POST">
        <div class="form-group">
            <label>Usuario:</label>
            <input type="text" name="txtUser" placeholder="Ej: admin123" minlength="3" maxlength="15" required="" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Contraseña:</label>
            <input type="password" name="txtPass"  minlength="3" maxlength="15" required="" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Nombre:</label>
            <input type="text" name="txtNombre" placeholder="Ej: Juan" minlength="3" maxlength="15" required="" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Apellido</label>
            <input type="text" name="txtApellido" placeholder="Ej: admin123" minlength="3" maxlength="15" required="" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Rol:</label>
            <select name="cboRol" id="cboRol" class="form-control">
                <c:forEach var="tipos" items="${tipo.rows}">
                    <option value="${tipos.id_rol}">${tipos.descripcion}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label>Dirección:</label>
            <input type="text" name="txtDireccion" placeholder="Ej: SanSiro #123" minlength="3" maxlength="15" required="" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Rut:</label>
            <input type="text" name="txtRut" placeholder="Ej: 11111111-k" minlength="9" maxlength="10" required="" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Email:</label>
            <input type="email" name="txtEmail" placeholder="Ej: juanperez@gmail.com" minlength="7" maxlength="20" required="" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Unidad:</label>
            <select name="cboUnidad" id="cboUnidad" class="form-control">
                <c:forEach var="tipos" items="${tipo2.rows}">
                    <option value="${tipos.id_unidad}">${tipos.descripcion}</option>
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
