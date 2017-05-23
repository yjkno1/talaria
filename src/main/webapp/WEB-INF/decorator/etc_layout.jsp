<%
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader("Expires",0);
response.setHeader("Cache-Control", "no-cache");
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><spring:message code="comm.canaria.title"/></title>
		<meta name="description" content="">
		<meta name="author" content="">
		<META http-equiv="Expires" content="-1">
		<META http-equiv="Pragma" content="no-cache">
		<META http-equiv="Cache-Control" content="No-Cache">

		<!-- http://davidbcalhoun.com/2010/viewport-metatag -->
		<meta name="HandheldFriendly" content="True">
		<meta name="MobileOptimized" content="320">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<style>
		/* Ajax Loader styles */
		.ajax_loader {background: url("<c:url value="/resources/img/spinner_squares_circle.gif"/>") no-repeat center center transparent;width:100%;height:100%;}
		.blue-loader .ajax_loader {background: url("<c:url value="/resources/img/ajax-loader_blue.gif"/>") no-repeat center center transparent;}
		.alignRight {text-align: right;}

		</style>

		<!-- Basic Styles -->
		<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
		<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/font-awesome.min.css"/>'>

		<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/panorama-production.css"/>'>
		<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/panorama-skins.css"/>'>

		<!-- FAVICONS -->
		<link rel="shortcut icon" href="<c:url value="/resources/img/favicon/favicon.ico"/>" type="image/x-icon">
		<link rel="icon" href="<c:url value="/resources/img/favicon/favicon.ico"/>" type="image/x-icon">

		<!-- GOOGLE FONT -->
<!-- 		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700"> -->

		<!-- easyUi jquery -->
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/easyui/themes/default/easyui.css"/>">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/easyui/themes/icon.css"/>">
	</head>
	<body> <!-- possible classes: minified, fixed-ribbon, fixed-header, fixed-width-->
		<!-- HEADER -->
		<header id="header">
			<jsp:include page="header_layout.jsp"/>
		</header>
		<!-- END HEADER -->

		<!-- MENU -->

		<!-- END MENU -->

		<!-- MAIN PANEL -->
		<div id="main2" role="main">

			<!-- MAIN CONTENT -->

            <div id="content">
				<sitemesh:write property='body' />
            </div>
            <!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN PANEL -->
		<script type="text/javascript">
			$(function(){
				var curUrl = document.location.href;
				if( curUrl.indexOf("searchCustom") > -1 ){
					$("#searchCustom").addClass('active');
				}else if( curUrl.indexOf("searchEvent") > -1){
					$("#searchEvent").addClass('active');
				}else if( curUrl.indexOf("report") > -1){
					$("#spreadsheet").addClass('active');
				}
		 		$("div[id=hide-menu]").hide();
			});

		</script>
	</body>
</html>