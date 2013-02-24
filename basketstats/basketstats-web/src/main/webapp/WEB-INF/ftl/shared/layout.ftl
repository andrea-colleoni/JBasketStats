<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="UTF-8" />
	<title><@spring.messageText "site.title" "JBasketStats" /></title>
	<link rel="shortcut icon" href="${rc.getContextUrl('/images/favicon.ico')}" />
	<link rel="stylesheet" type="text/css" href="${rc.getContextUrl('/css/main.css')}" />
	<link rel="stylesheet" type="text/css" href="${rc.getContextUrl('/css/ui-lightness/jquery-ui-1.10.1.custom.min.css')}" />
	<script src="${rc.getContextUrl('/scripts/jquery-1.9.1.min.js')}" type="text/javascript"></script>
	<script src="${rc.getContextUrl('/scripts/jquery-ui-1.10.1.custom.min.js')}" type="text/javascript"></script>
</head>
<body>
	<header role="banner">
		<div class="inner group">
			<span class="site-title"><@spring.messageText "site.title" "JBasketStats" /></span>
			<span class="site-title"><@spring.messageText "site.watchword" "Web Application for Basketball Statistics" /></span>

			<#include 'menu.ftl' />
		</div>
	</header>

	<div id="content" class="group" role="main">
		<#include model['contentFTL']!'no_content.ftl' />
	</div>

	<footer role="contentinfo">
		<div class="inner">
			<span class="right"><@spring.messageText "copyright" "&copy; 2013 - Colleoni.INFO" /></span>
		</div>
	</footer>
</body>
</html>