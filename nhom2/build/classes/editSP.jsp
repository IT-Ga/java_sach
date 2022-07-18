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
<%
 response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	ArrayList<loaibean> dsloai =(ArrayList<loaibean>)request.getAttribute("dsloai");
    sanphambean dssp=(sanphambean)request.getAttribute("dssp");
 %>
<body>
	<div class="modal-dialog">
                <div class="modal-content">
                    <form action="suaSP?masp=<%=dssp.getMaSP() %>" enctype="multipart/form-data" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Sửa sản phẩm</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">	
                        	<div class="form-group">
                                <label>Mã sản phẩm</label>
                                <input name="ID" type="text" class="form-control" value="<%=dssp.getMaSP()%>" required readonly>
                            </div>				
                            <div class="form-group">
                                <label>Name</label>
                                <input name="txtname" type="text" class="form-control" required value="<%=dssp.getTenSanPham()%>">
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <input type="file" name="file" size="60" >
                            </div>
                            <div class="form-group">
                                <label>Price</label>
                                <input name="txtprice" type="text" class="form-control" required value="<%=dssp.getGiaCa()%>">
                            </div>
                            
                            <div class="form-group">
                                <label>Category</label>
                                <select name="category" class="form-select" aria-label="Default select example">
                                   <%for(loaibean loai:dsloai){%>
                                        <option value="<%=loai.getMaLoaiSanPham()%>"><%=loai.getTenLoaiSanPham() %></option>
                                   <%} %>
                                </select>
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