<%@page import="bean.taikhoanbean"%>
<%@page import="bean.sanphambean"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Trang chủ</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="htmenu">Home</a></li>
      <li><a href="htgioController">Giỏ hàng</a></li>
      <li><a href="lichsuMHController">Lịch sử mua hàng</a></li>
    </ul>
    <form class="navbar-form navbar-left" action="htmenu">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="" name="txtfind">
      </div>
      <button type="submit" class="btn btn-default">Search</button>
    </form>
    <ul class="nav navbar-nav navbar-right">
      
		<% taikhoanbean kh=(taikhoanbean)session.getAttribute("dn");
		if(kh!=null){
		   
		%>
		 <li><a href="#">Xin chao: <%=kh.getHoTen()%> </a></li>
		 <li><a href="dangxuatController"><span class="glyphicon glyphicon-user"></span> Đăng Xuất</a></li>
           <%}else{ %>
           <li><a href="dangky.jsp"><span class="glyphicon glyphicon-user"></span> Đăng ký</a></li>
			<li><a href="#" data-toggle="modal" data-target="#myModal">

           <span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>
              <%  if(session.getAttribute("kt")!=null && session.getAttribute("kt").toString().equals("0")){%>
             		 <script>alert('Dang nhap sai');</script>
              <%} %>
           <%} %>
    </ul>
  </div>
</nav>
<!-- Button Đăng nhập -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
 <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Đăng nhập hệ thống</h4>
        </div>
        <div class="modal-body">
  				<form action="ktdnController" method="post">
 				<label>Tài khoản</label><br>
  				<input type="text" id="TenDN" name="TenDN"><br>
  				<label>Mật khẩu</label><br>
  				<input type="passWord" id="Matkhau" name="Matkhau"><br>
  				<input name="btlog" value="Đăng nhập" type="submit">
				</form>
  			</div>
      </div>
    </div>
 </div>
<%
 response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	ArrayList<loaibean> dsloai =(ArrayList<loaibean>)request.getAttribute("dsloai");
     ArrayList<sanphambean> ds=(ArrayList<sanphambean>)request.getAttribute("dssanpham"); 
 %>
 <table width="1000" align="center">
    
    <tr> 
       <td valign="top" width="200">
       		<table class="table table-hover">
       		<%for(loaibean loai:dsloai){%>
       			<tr>
       			<td>
        		<a href="htmenu?ml=<%=loai.getMaLoaiSanPham() %>&find="<%=request.getParameter("txtfind")%>> <%=loai.getTenLoaiSanPham()%>  </a>
        		</td>
        		</tr>
            <%} %> 
       		</table>
        </td>
         <td valign="top" width="600"> 
              <table class="table table-hover">
                  <%
                  int n=ds.size();
                  for(int i=0;i<n;i++) {
                    sanphambean s=ds.get(i);
                  %>
<tr>
                       <td>
                            <img src=<%=s.getAnh() %>><br>
                             <a href="giohangController?ms=<%=s.getMaSP()%>&ts=<%=s.getTenSanPham()%>&tg=<%=s.getAnh()%>&gia=<%=s.getGiaCa()%>">
                             <img src="mua.jpg">
                             </a> 
                             <br>
                             <%=s.getTenSanPham() %> <br>
                             <%=s.getGiaCa()%> <br>
     
							<%i++;
                         if(i<n){
                        	 s=ds.get(i);
                         
                       %><td>
                            <img src=<%=s.getAnh() %>><br>
                             <a href="giohangController?ms=<%=s.getMaSP()%>&ts=<%=s.getTenSanPham()%>&tg=<%=s.getAnh()%>&gia=<%=s.getGiaCa()%>">
                             <img src="mua.jpg">
                             </a> 
                             <br>
                             <%=s.getTenSanPham() %> <br>
                             <%=s.getGiaCa()%> <br>
                       </td>
                       <%} %>
                       <%i++;
                         if(i<n){
                        	 s=ds.get(i);
                         
                       %><td>
                            <img src=<%=s.getAnh() %>><br>
                             <a href="giohangController?ms=<%=s.getMaSP()%>&ts=<%=s.getTenSanPham()%>&tg=<%=s.getAnh()%>&gia=<%=s.getGiaCa()%>">
                             <img src="mua.jpg">
                             </a> 
                             <br>
                             <%=s.getTenSanPham() %> <br>
                             <%=s.getGiaCa()%> <br>
                       </td>
                       <%} %>
                    </tr>
                  <%} %>
              </table>
              </td> 
         
</tr>
</table>
</body>
</html>