$(document).ready(function () {
    let categoryLevel = '';
    $("#category").click(function (event) {
        categoryLevel = event.target.id;
        let color = assignColorCategory(categoryLevel);
        $("#add-button").css("background-color", color);
    });

    $("#add-button").click(function () {
        let taskValue = $("#task").val();
        if (taskValue == '' || taskValue == null || taskValue == undefined) {
            alert("Please Enter Task");
            return;
        }
        if (categoryLevel == '') {
            alert("Select Priority Level");
            return;
        }
        let taskAttribute = createTaskAttributes(taskValue, categoryLevel);
        $('#task-list').append($('<li>').attr('class', taskAttribute.classNm).
            text(taskAttribute.text));
    });

    $("#save-button").click(function () {

        let data = [];

        $("#task-list li").each(function (index) {
            let task = $(this).text();
            let className = $(this).attr('class');
            let priority = className.substring(className.lastIndexOf('-') + 1, className.length);
            let item = {
                task: task,
                priority: priority
            }
            data.push(item);
        });
        console.log(JSON.stringify(data));
        
        
        var saveData = $.ajax({
            type: 'POST',
            url: "http://localhost:8443/todo/tasks",
            data: JSON.stringify(data),
            dataType: "text",
            success: function(resultData) { alert("Save Complete") }
      });
      saveData.error(function() { alert("Something went wrong"); });

        /*var xhttp = new XMLHttpRequest();
        xhttp.open("POST", "http://localhost:8443/todo/tasks", true);
        xhttp.setRequestHeader('Access-Control-Allow-Origin', '*');
        xhttp.setRequestHeader('Content-Type', 'application/json');
        xhttp.onreadystatechange = function() {
          if (this.readyState == 4 && this.status == 200) {
            alert(this.responseText);
          }
        };
        xhttp.send(JSON.stringify(data));*/
    });

});

let assignColorCategory = function (categoryLevel) {
    let color = '';
    if (categoryLevel == 'low') {
        color = 'green';
    } else if (categoryLevel == 'medium') {
        color = 'yellow';
    } else if (categoryLevel == 'high') {
        color = 'red';
    }
    return color;
}

let createTaskAttributes = function (taskValue, categoryLevel) {
    let className = '';
    if (categoryLevel == 'low') {
        className = 'list-group-item-success';
    } else if (categoryLevel == 'medium') {
        className = 'list-group-item-warning';
    } else if (categoryLevel == 'high') {
        className = 'list-group-item-danger';
    }
    return new TaskAttribute(className, taskValue);
}

function TaskAttribute(classNm, text) {
    this.classNm = 'list-group-item ' + classNm;
    this.text = text;
}
