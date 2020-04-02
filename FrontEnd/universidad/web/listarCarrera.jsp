<%-- 
    Document   : listarCarrera
    Created on : 10-mar-2020, 0:37:30
    Author     : djenanehernandezrodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap/bootstrap-reboot.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/scripts.js" type="text/javascript"></script>
        <title>Lista de Carreras</title>
    </head>
    <body>
        <div>
            <%@include file="menu.jsp" %>
        </div>

        <div class="Container">
            <div>
                <div>
                    <h4>Lista de Carrera</h4>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <select clas="form-control form-control-sm" name="searchType">
                            <option value="searchAll" style="align-content: center">Mostrar todas</option>
                            <option value="searchCodigo" style="align-content: center">Codigo de Carrera</option>
                            <option value="searchNombre" style="align-content: center">Nombre de Carrera</option>
                        </select>
                    </div>
                    <div class="col-sm-4" id="serchDiv">
                        <input type="text" class="form-control" id="searchText" >
                    </div>
                    <div class="col-sm-4" id="searchDiv">
                        <button type="button" class="btn btn-success" id="seacrhButton" onclick="initCarreras()">Buscar</button>
                    </div> 
                </div>
            </div>
            <div class="row">
                 <span style="white-space: pre-line"></span>
                <br/>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="table-responsive">        
                            <table id="tableCarrera" class="table table-striped table-bordered border-info" style="width:100%">
                                <thead>
                                    <tr>
                                        <th style="background-color: #5da17a; color:white; text-align: center">Código </th>
                                        <th style="background-color: #5da17a; color:white; text-align: center">Nombre</th>
                                        <th style="background-color: #5da17a; color:white; text-align: center">Título</th>
                                        <th style="background-color: #5da17a; color:white; text-align: center">Editar</th>
                                        <th style="background-color: #5da17a; color:white; text-align: center">Eliminar</th>
                                </thead>
                                <tbody style="background-color: #CDEBDB;" id="carreraList">
                                </tbody>
                            </table
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
