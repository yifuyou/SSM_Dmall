<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>

	<style type="text/css">
		.img{
			width:90px;
			height:90px;

	/*		background: url("../lib/download.png") no-repeat*/
		}

		.img img{
			width:90px;
			height:90px;
		}

		.title{
			display: flex;
			flex-direction: row;
			justify-content: space-around;
			align-items: center;
			background-image: url("../lib/download.png");
			background-size: 100% 80px;
			border-color: blue;

		}
		.title div{
			flex:1;
		}

.right{
	float: right;
	vertical-align: middle;
}
ul{
	display: flex;
	flex-direction: row;
	margin-right:4em;
}
		ul li{

			margin-inline-start: 0px;
			margin-inline-end: 0px;
			padding-inline-start: 40px;
		}
		ul li a{
			text-decoration: none;
			color:black;
		}
	</style>
</head>
<body>
	<div class="title">
		<div class="img">
			<img src="/lib/download.png" alt="">
		</div>

		<div >
			<h2 align="center">思达薇芯电子</h2>
		</div>

		<div >
			<ul style="list-style: none;padding:0" class="right">
			<li>
				<a href="/use/login.do" target="right">首页</a>
			</li>

			<li>
				<a href="/use/add.do" target="right">查看</a>
			</li>
			<li>
				<a href="/use/update.do" target="right">新增</a>
			</li>
		</ul>
		</div>
	</div>
</body>
</html>