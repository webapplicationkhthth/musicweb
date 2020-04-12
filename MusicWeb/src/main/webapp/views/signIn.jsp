<%@ include file="library.jsp"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="static.jsp"></jsp:include>
<link rel="stylesheet"
	href='<c:url value="/resources/css/signIn.css" />'></link>
<script type="text/javascript"
	src="<c:url value="/resources/js/signIn.js" />"></script>
<meta charset="UTF-8">
<title>Sign In | Sign Up</title>
</head>
<body>
	<div class="container">
		<div class="form-container">
			<h1>Music Web</h1>
			<h4>Connect to us</h4>
			<div class="form">
				<div class="method-container">
					<p>Use Email</p>
				</div>
				<div class="input-container" data-error="">
					<div class="username">
						<i class="fas fa-user"></i> <input type="text"
							placeholder="Display name">
					</div>
					<div class="email">
						<i class="fas fa-envelope"></i> <input type="text"
							placeholder="Email">
					</div>
					<div class="password">
						<i class="fas fa-lock"></i> <input type="password"
							placeholder="Password">
					</div>
					<div class="code">
						<i class="fas fa-user-secret"></i><span>MW-</span><span
							class="counter"><span class="minute"></span><span>:</span><span
							class="second"></span></span> <input type="text"
							placeholder="Confirm code">
					</div>
				</div>
				<div class="button-container">
					<button type="button" style="display: block;">Sign in</button>
				</div>
				<div class="link-container">
					<a href="#">Forgot password?</a> <a href="#">Sign in now!</a>
				</div>
			</div>
			<div class="language-container">
				<a href="#">VI</a> <a href="#">EN</a>
			</div>
		</div>

		<div class="blur"></div>
		<div class="forget-container">
			<div class="form">
				<div class="method-container">
					<p>Forgot Password<i class="fas fa-times"></i></p>
				</div>
				<div class="input-container-forget" data-error="">
					<div class="email-forget">
						<i class="fas fa-envelope"></i> <input type="text"
							placeholder="Email">
					</div>
					<div class="code-forget">
						<i class="fas fa-user-secret"></i><span>MW-</span><span
							class="counter"><span class="minute"></span><span>:</span><span
							class="second"></span></span> <input type="text"
							placeholder="Confirm code">
					</div>
					<div class="password-forget">
						<i class="fas fa-lock"></i> <input type="password"
							placeholder="Password">
					</div>
				</div>
				<div class="button-container-forget">
					<button type="button" style="display: block;">Send code</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>