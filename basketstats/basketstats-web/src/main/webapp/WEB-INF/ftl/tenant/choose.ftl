<div id="tenant-chioce" class="item-choice">
	<table>
		<thead>
		<tr>
			<th><@spring.messageText "tenant.name.label" "Name" /></th>
		</tr>
		</thead>
		<tbody>
			<#list model['allTenants'] as t>
			<tr>
				<td class="clickableTenant" tenantid="${t.id}">
					${t.name}
				</td>
			</tr>
			</#list>
		</tbody>
	</table>
</div>
<script type="text/javascript">
	$(function() {
		$('.clickableTenant').bind('click',  function() {
			window.location = '${rc.getContextUrl('/tenant')}/set/' + $(this).attr('tenantid') + '.html';
		});
	});
</script>