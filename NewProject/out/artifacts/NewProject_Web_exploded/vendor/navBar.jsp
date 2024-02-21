
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>
<!--search container-->
<%--<div class="container">--%>
<%--    <nav class="navbar bg-body-tertiary">--%>
<%--        <div class="container-fluid">--%>
<%--            <form class="d-flex" role="search">--%>
<%--                <input class="form-control me-2" type="search" placeholder="Поиск" aria-label="Поиск">--%>
<%--                <button class="btn btn-outline-success" type="submit">Поиск</button>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </nav>--%>
<%--</div>--%>

<!--navbar container-->
<div class="container" style="height: 100px">
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Perfume</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Переключатель навигации">
                <span class="navbar-toggler-icon"></span>
            </button>
            <!--search container-->
            <div>
                <nav class="navbar bg-body-tertiary">
                    <div class="container-fluid">
                        <form class="d-flex mt-1" role="search">
                            <input class="form-control me-1" type="search" placeholder="Search" aria-label="Search" style="width: 150px">
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </nav>
            </div>
            <div class="collapse navbar-collapse ms-5" id="navbarNavDropdown">
                <ul class="navbar-nav ms-5">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Top Sales</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">New Sales</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">By Category</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/signIn.jsp">Sign in</a>
                    </li>

                </ul>
            </div>
        </div>
    </nav>
</div>
</body>
</html>
