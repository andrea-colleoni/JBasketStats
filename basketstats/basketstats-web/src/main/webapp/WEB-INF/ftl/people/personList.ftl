<div id="person-list" class="item-list">
	<table>
		<caption><@spring.messageText "person.list.title" "Person list" /></caption>
		<thead>
			<tr>
				<th><@spring.messageText "person.id.label" "Id" /></th>
				<th><@spring.messageText "person.fullname.label" "Name" /></th>
				<th><@spring.messageText "person.email.label" "Email" /></th>
			</tr>
		</thead>
		<tbody>
			<#list model['allPersons'] as p>
			<tr class="clickableRow" modelId="${p.id}">
				<td><input type="hidden" value="${p.id}" /><span>${p.id}</span></td>
				<td>${p.fullname}</td>
				<td>${p.email}</td>
			</tr>
			</#list>
		</tbody>
	</table>
</div>
<script type="text/javascript">
	$(function() {
		$('.clickableRow td').bind('click',  function() {
			window.location = '${rc.getContextUrl('/people')}/get/' + $(this).parent().attr('modelId') + '.html';
		});
	});
</script>