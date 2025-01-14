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

				<div class="form-group">
					<label>번호</label> <input class="form-control" name='bno'
						value="${board.bno }" readonly="readonly">
				</div>
				<div class="form-group">
					<label>제목</label> <input class="form-control" name='title'
						value="${board.title }" readonly="readonly">
				</div>
				<div class="form-group">
					<label>내용</label>
					<textarea class="form-control" rows="3" name='content'
						readonly="readonly">${board.content }</textarea>
				</div>
				<div class="form-group">
					<label>작성자</label> <input class="form-control" name='writer'
						value="${board.writer }" readonly="readonly">
				</div>
				<button data-oper='modify' class="btn btn-default"
					onclick="location.href='/board/modify?bno=${board.bno }'">수정</button>
				<button data-oper='list' class="btn btn-info"
					onclick="location.href='/board/list'">목록</button>

			</div>
			<!-- end panel-body -->
		</div>
		<!-- end panel -->
	</div>
	<!-- end col -->
</div>
<!-- end row -->

<%@include file="../includes/footer.jsp"%>

