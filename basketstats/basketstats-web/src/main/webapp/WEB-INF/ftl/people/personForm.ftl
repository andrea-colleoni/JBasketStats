<#assign person = model['person'] />
<div id="person-form" class="default-form clearfix">
	<h1><#if person.id gt 0> <@spring.messageText "person.edit.title" "Edit person" /> # ${person.id}
		<#else><@spring.messageText "person.create.title" "New person" />
		</#if></h1>
	<h2><@spring.messageText "form.instructions" "Fill out the form below." /></h2>

	<form method="post" action="process.html">
		<ul id="errors" class="">
			<li id="info">There were some problems with your form
				submission:</li>
			<li>Input
				is incorrect</li>
		</ul>
		<input type="hidden" id="id" name="id" value="${(person.id)!'0'}" />
		<label for="name"><@spring.messageText "person.name.label" "Name" /><span
			class="required"><@spring.messageText "form.requiredField" "*" /></span></label>
		<input type="text" id="name" name="name" placeholder="Name" required="required"
			autofocus="autofocus" value="${(person.name)!''}" />
		<label for="surname"><@spring.messageText "person.surname.label" "Surname" /><span
			class="required"><@spring.messageText "form.requiredField" "*" /></span></label>
		<input type="text" id="surname" name="surname" placeholder="Surname" required="required"
			autofocus="autofocus" value="${(person.surname)!''}" />	
		<label for="fullname"><@spring.messageText "person.fullname.label" "Full name" /><span
			class="required"><@spring.messageText "form.requiredField" "*" /></span></label>
		<input type="text" id="fullname" name="fullname" placeholder="Full name" required="required"
			autofocus="autofocus" value="${(person.fullname)!''}" />				
		<label for="email"><@spring.messageText "person.email.label" "E-mail" /><span
			class="required"><@spring.messageText "form.requiredField" "*" /></span></label>
		<input type="text" id="email" name="email" placeholder="Person's e-mail" required="required"
			autofocus="autofocus" value="${(person.email)!''}" />	
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
	var fullNameEdited = false;
	
	$(function() {
		$('#delete-button').bind('click',  function(e) {
		    e.preventDefault();
		    $('#dialog').dialog('open');
		});
		$('#name').bind('change',  function(e) {
		    updateFullname();
		});	
		$('#surname').bind('change',  function(e) {
		    updateFullname();
		});	
		$('#fullname').bind('keyup',  function(e) {
		    fullNameEdited = true;
		});			
	});
	
	function updateFullname() {
		if (!fullNameEdited) {
			$('#fullname').val($('#name').val() + ' ' + $('#surname').val());
		}
	}
	
	$('#dialog').dialog({
	   autoOpen: false,
	   modal: true,
	   buttons : {
	        '<@spring.messageText "dialog.confirm.value" "Confirm" />' : function() {
	            window.location = '../delete/' + $('#id').val() + '.html';       
	        },
	        '<@spring.messageText "dialog.cancel.value" "Cancel" />' : function() {
	          $(this).dialog('close');
	        }
	      }
	    });
</script>