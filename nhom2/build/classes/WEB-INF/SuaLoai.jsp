<%@page import="bean.sanphambean"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"><script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    	
<script src="js/jquery-1.11.1.min.js"></script>   
   <style type="text/css">.table&amp;amp;gt;tbody&amp;amp;gt;tr&amp;amp;gt;td, .table&amp;amp;gt;tfoot&amp;amp;gt;tr&amp;amp;gt;td {  
vertical-align: middle;
}
 
@media screen and (max-width: 600px) { 
table#cart tbody td .form-control { 
width:20%; 
display: inline !important;
} 
 
.actions .btn { 
width:36%; 
margin:1.5em 0;
} 
 
.actions .btn-info { 
float:left;
} 
 
.actions .btn-danger { 
float:right;
} 
 
table#cart thead {
display: none;
} 
 
table#cart tbody td {
display: block;
padding: .6rem;
min-width:320px;
} 
 
table#cart tbody tr td:first-child {
background: #333;
color: #fff;
} 
 
table#cart tbody td:before { 
content: attr(data-th);
font-weight: bold; 
display: inline-block;
width: 8rem;
} 
 
table#cart tfoot td {
display:block;
} 
table#cart tfoot td .btn {
display:block;
}
}</style>
</head>
<body>
 <%
 response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	loaibean dsloai =(loaibean)request.getAttribute("cList");
	
	%>
<body>
	<div class="modal-dialog">
                <div class="modal-content">
                    <form action="SuaLoai"  method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Thêm loại</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">	
                         <div class="form-group">
                                <label>Name</label>
                                <input name="ml" type="text" class="form-control" required readonly value="<%=dsloai.getMaLoaiSanPham()%>">
                            </div>				
                            <div class="form-group">
                                <label>Name</label>
                                <input name="TenLoai" type="text" class="form-control" required value="<%=dsloai.getTenLoaiSanPham()%>">
                            </div>
                     
                        </div>
                        <div class="modal-footer">
                            
                            <input type="submit" class="btn btn-success" value="Sửa">
                        </div>
                    </form>
                </div>
            </div>
</body>
</html>