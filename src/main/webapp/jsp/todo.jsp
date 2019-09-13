<html>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

    <script src="${pageContext.request.contextPath}/js/todo.js"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>
    <div class="container">

        <!-- Input Task -->
        <div class="task-container">
            <input type="text" id="task" class="form-control" />
            <div class="dropdown">
                <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Category
                    <span class="caret"></span></button>
                <ul class="dropdown-menu" id="category">
                    <li><a id="low">Low</a></li>
                    <li><a id="medium">Medium</a></li>
                    <li><a id="high">High</a></li>
                </ul>
            </div>
            <button type="button" class="btn btn-default" id="add-button"> <b>+ Add </b> </button>
            <button type="button" class="btn btn-default" id="save-button"> <b>Save Tasks</b> </button>
        </div>
        <ul class="list-group" id="task-list">
                <!-- <li class="list-group-item list-group-item-success">First item</li>
                <li class="list-group-item list-group-item-info">Second item</li>
                <li class="list-group-item list-group-item-warning">Third item</li>
                <li class="list-group-item list-group-item-danger">Fourth item</li> -->
        </ul>
    </div>
    <!-- List of Tasks -->
    <!-- <div class="container">
     </div> -->
</body>


</html>