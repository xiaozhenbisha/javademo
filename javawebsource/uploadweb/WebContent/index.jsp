<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
var i = 2;
$(function() {
    //新增附件案例的点击事件
    $("#addFile") .click( function() {
        $(this) .parent() .parent() .before(
        "<tr class=\"file\">" +
        "<td>请选择上传的第 " +  i + " 个文件:</td>" +
        "<td><input type=\"file\" name=\"file" + i + "\" /></td></tr>" +
        "<tr class=\"desc\">" +
        "<td>请第" +  i + "个上传的文件的描述:</td>" +
        "<td><input type=\"text\" name=\"desc" + i + "\" />" +
        "<button type=\"button\" id=\"delete" + i + "\">删除</button>" +
        "</td></tr>");
        i++;
        //获取到生成的删除按钮
        $("#delete" + (i - 1)) .click( function() {
            var $tr = $(this).parent() .parent();
            $tr.prev("tr").remove();
            $tr.remove();
            //删除了中间的tr节点,我们要对所有的tr的节点,重新的排序,name值file1,file2....连续的
            $(".file") .each( function(index) {
                var count = index + 1;
                $(this)
                    .find( "td:first") .text( "请选择上传的第 " + count + " 个文件:");
                $(this) .find( "td:last input") .attr( "name", "file" + count);
            });

              $(".desc").each(function(index) {
                  var count = index + 1;
                  $(this).find("td:first").text("请第" +count +"个上传的文件的描述:");
                  $(this).find("td:last input").attr("name","desc" +count);
              });
          });
     });
});
</script>
<style>
tr {
	height: 45px;
	line-height: 45px;
}

table {
	margin-left: 30px;
}
}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/upload.up" method="post" enctype="multipart/form-data">
		<table>
			<c:if test="${not empty errorMsg}">
			<tr>
				<td colspan="2" style="color: red; font-weight: bolder;" >${errorMsg}</td>
			</tr>
			</c:if>
			<tr class="file">
				<td>请选择上传的第 1 个文件:</td>
				<td><input type="file" name="file1" /></td>
			</tr>
			<tr class="desc">
				<td>请第1个上传的文件的描述:</td>
				<td><input type="text" name="desc1" /></td>
			</tr>
			<tr>
				<td><input style="float: right;" type="submit" value="点击上传文件" /></td>
				<td><button type="button" id="addFile">点击新增加一个附件</button></td>
			</tr>
		</table>
	</form>

	<br>
	<br>
	<br>
	<br> 已经上传的文件:<br><br>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>id</td>
			<td>老名字</td>
			<td>大小</td>
			<td>描述</td>
			<td>上传日期</td>
			<td>删除/下载</td>
		</tr>
		<c:forEach var="uf" items="${upfiles}">
			<tr>
				<td>${uf.id }</td>
				<td>${uf.oldFileName }</td>
				<td>${uf.fileSize }</td>
				<td>${uf.desc }</td>
				<td>${uf.saveTime }</td>
				<td><a href="${pageContext.request.contextPath}/deleteFile.up?id=${uf.id}">删除</a> | <a href="${pageContext.request.contextPath}/downloadFile.up?id=${uf.id}">下载</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>