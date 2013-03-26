<#assign tenantUrlPart = '' />
<#if contextData.tenantKey?has_content>
      <#assign tenantUrlPart = '/' + contextData.tenantKey  />
</#if>

<nav>
	<ul class="menu">
		<li><a href="${rc.getContextUrl('/home.html')}"><@spring.messageText "home" "Home" /></a></li>
		<li><a href="#" class="parent-menu-link"><@spring.messageText "tenant.menu.main" "Tenant" /></a>
			<ul>
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/tenant/set.html')}" class="list-menu-link"><@spring.messageText "tenant.menu.set" "Set" /></a></li>			
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/tenant/list.html')}" class="list-menu-link"><@spring.messageText "tenant.menu.list" "List" /></a></li>
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/tenant/create.html')}" class="form-menu-link"><@spring.messageText "tenant.menu.create" "Create" /></a></li>
			</ul>
		</li>
		<li><a href="#" class="parent-menu-link"><@spring.messageText "people.menu.main" "People & Players" /></a>
			<ul>			
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/people/list.html')}" class="list-menu-link"><@spring.messageText "people.menu.list" "List" /></a></li>
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/people/create.html')}" class="form-menu-link"><@spring.messageText "people.menu.create" "Create" /></a></li>
			</ul>
		</li>			
		<li><a href="#" class="parent-menu-link"><@spring.messageText "season.menu.main" "Season" /></a>
			<ul>			
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/championship/seasonList.html')}" class="list-menu-link"><@spring.messageText "season.menu.list" "List" /></a></li>
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/championship/seasonCreate.html')}" class="form-menu-link"><@spring.messageText "season.menu.create" "Create" /></a></li>
			</ul>
		</li>
		<li><a href="#" class="parent-menu-link"><@spring.messageText "season.menu.main" "Championship" /></a>
			<ul>			
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/championship/championshipList.html')}" class="list-menu-link"><@spring.messageText "championship.menu.list" "List" /></a></li>
				<li><a href="${rc.getContextUrl(tenantUrlPart + '/championship/championshipCreate.html')}" class="form-menu-link"><@spring.messageText "championship.menu.create" "Create" /></a></li>
			</ul>
		</li>				
	</ul>
</nav>