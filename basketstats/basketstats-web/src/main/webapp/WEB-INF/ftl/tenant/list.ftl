<div id="tenant-list" class="item-list">
	<table>
		<caption><@spring.messageText "tenant.list.title" "Tenant list" /></caption>
		<thead>
			<tr>
				<th><@spring.messageText "tenant.id.label" "Id" /></th>
				<th><@spring.messageText "tenant.name.label" "Name" /></th>
				<th><@spring.messageText "tenant.siteAdmin.label" "Site admin" /></th>
			</tr>
		</thead>
		<tbody>
			<#list model['allTenants'] as t>
			<tr class="clickableRow" modelId="${t.id}">
				<td><input type="hidden" value="${t.id}" /><span>${t.id}</span></td>
				<td>${t.name}</td>
				<td>${t.siteAdmin?string('Yes', 'No')}</td>
			</tr>
			</#list>
		</tbody>
	</table>
</div>
<script type="text/javascript">
	$(function() {
		$('.clickableRow td').bind('click',  function() {
			window.location = 'get.html?id=' + $(this).parent().attr('modelId');
		});
	});
</script>