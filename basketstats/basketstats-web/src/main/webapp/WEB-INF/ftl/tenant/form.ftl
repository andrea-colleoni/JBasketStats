<#assign tenant = model['tenant'] />
<div id="tenant-form" class="default-form clearfix">
	<h1><#if tenant.id gt 0> <@spring.messageText "tenant.edit.title" "Edit tenant" /> # ${tenant.id}
		<#else><@spring.messageText "tenant.create.title" "New tenant" />
		</#if></h1>
	<h2><@spring.messageText "form.instructions" "Fill out the form below." /></h2>

	<p id="success">Thanks for your message! We will get back to you
		ASAP!</p>
	<form method="post" action="process.html')}">
		<ul id="errors" class="">
			<li id="info">There were some problems with your form
				submission:</li>
			<li>Input
				is incorrect</li>
		</ul>
		<input type="hidden" id="id" name="id" value="${(tenant.id)!'0'}" />
		<label for="name"><@spring.messageText "tenant.name.label" "Name" /><span
			class="required"><@spring.messageText "form.requiredField" "*" /></span></label>
		<input type="text" id="name" name="name" placeholder="Tenant Name" required="required"
			autofocus="autofocus" value="${(tenant.name)!''}" />
		<label for="description"><@spring.messageText "tenant.description.label" "Description" /><span
			class="required"><@spring.messageText "form.requiredField" "*" /></span></label>
		<input type="text" id="description"
			name="description" placeholder="Tenant description (max 200 chars)"
			required="required" autofocus="autofocus" value="${(tenant.description)!''}" />
		<label
			for="siteAdmin"><@spring.messageText "tenant.siteAdmin.label" "Site admin" /></label>
		<input type="checkbox" id="siteAdmin" name="siteAdmin" autofocus="autofocus"
			<#if tenant.siteAdmin>checked="checked"</#if> />
		<span
			id="loading"></span>
		<input type="submit" id="submit-button" value="<@spring.messageText "form.submit.value" "Save" />" />
		<input type="button" id="delete-button" value="<@spring.messageText "form.delete.value" "Delete" />" />
		<p id="req-field-desc">
			<span class="required"><@spring.messageText "form.requiredField" "*" /></span> 
			<@spring.messageText "form.requiredField.description" "indicates a required field" />
		</p>
	</form>
</div>
<div id="dialog" title="<@spring.messageText "form.delete.confirmTitle" "Confirmation Required" />">
  <@spring.messageText "form.delete.confirmText" "Are you sure about deleting the current element?" />
</div>
<script type="text/javascript">
	$(function() {
		$('#delete-button').bind('click',  function(e) {
		    e.preventDefault();
		    $('#dialog').dialog('open');
		});
	});
	
	$('#dialog').dialog({
	   autoOpen: false,
	   modal: true,
	   buttons : {
	        '<@spring.messageText "dialog.confirm.value" "Confirm" />' : function() {
	            window.location = 'delete.html?id=' + $('#id').val();       
	        },
	        '<@spring.messageText "dialog.cancel.value" "Cancel" />' : function() {
	          $(this).dialog('close');
	        }
	      }
	    });
</script>