<%@page import="bean.sanphambean"%>

<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%
 response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	ArrayList<loaibean> dsloai =(ArrayList<loaibean>)request.getAttribute("dsloai");
    ArrayList<sanphambean> dssp=(ArrayList<sanphambean>)request.getAttribute("dssp");
 %>
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
<body>
<h2 class="text-center">Quản lý sản phẩm</h2>
	 <div class="modal-dialog">
                <div class="modal-content">
                    <form action="ThemSP" enctype="multipart/form-data" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add Product</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Name</label>
                                <input name="txtname" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <input type="file" name="file" size="60" >
                            </div>
                            <div class="form-group">
                                <label>Price</label>
                                <input name="txtprice" type="text" class="form-control" required>
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
                            
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
<div class="container"> 
 <table id="cart" class="table table-hover table-condensed"> 
  <thead> 
  <!--  <td><a href="http://hocwebgiare.com/" class="btn btn-warning"><i class="fa fa-angle-left"></i> Thêm sách</a>
    </td>  -->
   <tr> 
    <th style="width:18%">Ảnh</th> 
    <th style="width:30%">Tên sản phẩm</th> 
     <th style="width:22%" class="text-center">Mã loại</th> 
    <th style="width:10%">Giá</th> 
    <th style="width:20%">Lựa chọn</th> 
   
   
 
   </tr> 
  </thead> 
  <tbody>
   <%
                  int n=dssp.size();
                  for(int i=0;i<n;i++) {
                    sanphambean s=dssp.get(i);
                  %>
  <tr> 
   <td data-th="Product"> 
    
     <img src=<%=s.getAnh() %> alt="Sản phẩm 1" class="img-responsive" width="100">
    
     
   </td> 
   <td data-th="Price"><%=s.getTenSanPham()%></td> 
   <td data-th="Price"><%=s.getMaLoaiSanPham()%></td> 
   <td data-th="Price"><%=s.getGiaCa()%></td> 
  
   <td class="actions" data-th="">
    <a href="htsua?masp=<%=s.getMaSP() %>" class="btn btn-info btn-sm">Sửa<i class="fa fa-edit"></i>
    </a>
    <a href="xoaSP?masp=<%=s.getMaSP() %>" class="btn btn-danger btn-sm">Xóa<i class="fa fa-trash-o"></i>
    </a>
   </td> 
  </tr> 
 
  </tbody>
  <%} %>
  <tfoot> 
   
  </tfoot> 
 </table>
</div>
</body>
</html>