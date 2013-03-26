<#assign tenant = '' />
<#if contextData.tenantKey?has_content>
      <#assign tenant = contextData.tenantKey  />
</#if>
<#assign user = '' />
<#if contextData.user?has_content>
      <#assign user = contextData.user.username  />
</#if>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="UTF-8" />
	<title><@spring.messageText "site.title" "JBasketStats" /></title>
	<link rel="shortcut icon" href="${rc.getContextUrl('/images/favicon.ico')}" />
	<link rel="stylesheet" type="text/css" href="${rc.getContextUrl('/css/main.css')}" />
	<script src="${rc.getContextUrl('/scripts/jquery-1.9.1.min.js')}" type="text/javascript"></script>
	<script src="${rc.getContextUrl('/scripts/jquery-ui-1.10.1.custom.min.js')}" type="text/javascript"></script>
</head>
<body>
	<header role="banner">
		<div class="inner group">
			<span class="site-title"><@spring.messageText "site.title" "JBasketStats" /></span>
			<span class="site-watchword"><@spring.messageText "site.watchword" "Web Application for Basketball Statistics" /></span>
			<#include 'menu.ftl' />
		</div>
		<#if user?has_content>
		<div id="userInfo" class"inner group">
			<span class="tenantInfo">${tenant}</span>
			<span class="userInfo">${user}</span>
		</div>
		</#if>
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