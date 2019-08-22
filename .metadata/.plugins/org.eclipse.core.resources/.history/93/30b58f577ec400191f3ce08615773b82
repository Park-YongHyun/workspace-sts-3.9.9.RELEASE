<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ajax_ex3</title>
	<script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
</head>

<body>
	<table border="1">
		<thead>
			<tr>
				<th>아이디</th>
				<th>나이</th>
			</tr>
		</thead>
		<tbody id="tbody"></tbody>
	</table>
	
	<script>
		$(function(){
			var key = "a1";
			$.get('http://127.0.0.1:3000/json/ex3.json?key='+key, function(retdata){
				if(retdata.result == 'y'){
					var data = retdata.data;
					var len = data.length;
					for(var i=0; i<len; i++){
						$('#tbody').append(
							'<tr>'+
								'<td>'+data[i].id+'</td>'+
								'<td>'+data[i].age+'</td>'+
							'</tr>'
						);
					}
				}
				else{
					$('#tbody').append('<tr>'+'<td colspan="2">자료가 없습니다.</td></tr>');
				}
			},'json');	
		});
	</script>
</body>
</html>