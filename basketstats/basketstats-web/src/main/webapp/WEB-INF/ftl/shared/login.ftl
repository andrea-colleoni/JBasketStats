<div id="login-form" class="default-form clearfix">
	<h1><@spring.messageText "login.title" "Login" /></h1>
	<h2><@spring.messageText "form.instructions" "Fill out the form below." /></h2>

	<form method="post" action="doLogin.html">
		<ul id="errors" class="">
			<li id="info">There were some problems with your form
				submission:</li>
			<li>Input
				is incorrect</li>
		</ul>
		
		<label for="username"><@spring.messageText "login.username.label" "Username" /><span
			class="required"><@spring.messageText "form.requiredField" "*" /></span></label>
		<input type="text" id="username" name="username" placeholder="Username" required="required"
			autofocus="autofocus" />
					
		<label for="name"><@spring.messageText "login.password.label" "Password" /><span
			class="required"><@spring.messageText "form.requiredField" "*" /></span></label>
		<input type="password" id="password" name="password" placeholder="Password" required="required"
			autofocus="autofocus" />
			
		<span
			id="loading"></span>
			
		<input type="submit" id="submit-button" value="<@spring.messageText "login.submit.value" "Login" />" />
		<p id="req-field-desc">
			<span class="required"><@spring.messageText "form.requiredField" "*" /></span> 
			<@spring.messageText "form.requiredField.description" "indicates a required field" />
		</p>
	</form>
</div>