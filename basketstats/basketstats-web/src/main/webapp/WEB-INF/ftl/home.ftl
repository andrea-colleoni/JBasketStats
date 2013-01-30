<!-- freemarker macros have to be imported into a namespace.  We strongly
recommend sticking to 'spring' -->
<#import "spring.ftl" as spring />
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head th:fragment="head">
	<meta charset="UTF-8" />
	<title>JBasketStats - Basketball Statistics</title>
	<link rel="shortcut icon" href="images/favicon.ico" />
	<link rel="stylesheet" type="text/css" href="css/main.css" />
	<script src="scripts/jquery-1.8.3.min.js" type="text/javascript"></script>
</head>
<body>
	<header role="banner" >
		<div class="inner group">
			<span class="site-title"><@spring.messageText "site.title" "Title" /></span>
			<span class="site-title"><@spring.messageText "site.watchword" "Watchword"/></span>

			<#include "shared/menu.ftl" />
			
		</div>
	</header>

	<div id="content" class="group" role="main">
		<span><@spring.message "welcome" /></span>
	</div>
	
	<footer role="contentinfo">
		<div class="inner">
			<span class="right"><@spring.message "copyright" /></span>
		</div>
	</footer>
</body>
</html>