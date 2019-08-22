<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="../includes/header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">게시글 읽기</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">게시글 읽기</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
			
				<form action="/board/modify" role="form" method="post">
				
					<div class="form-group">
						<label>번호</label> <input class="form-control" name='bno'
							value="${board.bno }" readonly="readonly">
					</div>
					<div class="form-group">
						<label>제목</label> <input class="form-control" name='title'	value="${board.title }">
					</div>
					<div class="form-group">
						<label>내용</label>
						<textarea class="form-control" rows="3" name='content'>${board.content }</textarea>
					</div>
					<div class="form-group">
						<label>작성자</label> <input class="form-control" name='writer'
							value="${board.writer }" readonly="readonly">
					</div>
					
					<button type="submit" class="btn btn-default">수정</button>
					<button type="submit" class="btn btn-danger">삭제</button>
					<button type="submit" class="btn btn-info">목록</button>
						
				</form>
			</div>
			<!-- end panel-body -->
		</div>
		<!-- end panel -->
	</div>
	<!-- end col -->
</div>
<!-- end row -->

<%@include file="../includes/footer.jsp"%>

<script>
$(document).ready(function(){
	
	var formObj=$("form");
	
	$(".btn-default").on("click",function(){	//수정		
		formObj.submit();
	});
	$(".btn-danger").on("click",function(){		//삭제
		formObj.attr("action","/board/remove");
		formObj.submit();
	});
	$(".btn-info").on("click",function(){		//목록
		history.replaceState({},null,null);
		formObj.attr("action","/board/list");
		formObj.attr("method","get");
		formObj.empty();			//bno 같은 변수들 제거
		formObj.submit();
	});
	
});
</script>





