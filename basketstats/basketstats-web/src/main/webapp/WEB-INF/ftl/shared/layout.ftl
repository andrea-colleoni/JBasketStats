<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head th:fragment="head">
<meta charset="UTF-8" />
<title>JBasketStats - Basketball Statistics</title>
<link rel="shortcut icon" th:href="@{/images/favicon.ico}"
	href="images/favicon.ico" />
<link rel="stylesheet" type="text/css" href="css/main.css"
	th:href="@{/css/main.css}" />
	<script th:src="@{/scripts/jquery-1.8.3.min.js}" type="text/javascript"></script>
</head>
<body>
	<header role="banner" th:fragment="header">
		<div class="inner gropu">
			<span th:utext="#{site.title}" class="site-title">JBasketStats</span>
			<span th:utext="#{site.watchword}" class="site-title">JBasketStats</span>

			<nav th:fragment="menu">
				<ul class="menu">
					<li><a href="home.html" th:href="@{/home.html}">Home</a></li>
					<li><a href="#" class="parent-menu-link" th:utext="#{tenant.menu.main}">Tenant</a>
						<ul>
							<li><a href="tenant/list.html" class="list-menu-link"
								th:href="@{/tenant/list.html}" th:utext="#{tenant.menu.list}">Tenant list</a></li>
							<li><a href="tenant/create.html" class="form-menu-link"
								th:href="@{/tenant/create.html}" th:utext="#{tenant.menu.create}">Create tenant</a></li>
						</ul></li>
				</ul>
			</nav>
		</div>
	</header>

	<div id="content" class="group" role="main">
		<span>The content</span>
	</div>

	<footer role="contentinfo" th:fragment="footer">
		<div class="inner">
			<span class="right" th:utext="#{copyright}">&copy; 2013 - Colleoni.INFO</span>
		</div>
	</footer>
</body>
</html>