<nav>
	<ul class="menu">
		<li><a href="${rc.getContextUrl('/home.html')}"><@spring.messageText "home" "Home" /></a></li>
		<li><a href="#" class="parent-menu-link"><@spring.messageText "tenant.menu.main" "Tenant" /></a>
			<ul>
				<li><a href="${rc.getContextUrl('/tenant/list.html')}" class="list-menu-link"><@spring.messageText "tenant.menu.list" "List" /></a></li>
				<li><a href="${rc.getContextUrl('/tenant/create.html')}" class="form-menu-link"><@spring.messageText "tenant.menu.create" "Create" /></a></li>
			</ul>
		</li>
	</ul>
</nav>