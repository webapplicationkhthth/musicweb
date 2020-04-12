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
<title><spring:message code="signin.signin" /> | <spring:message
		code="signin.signup" /></title>
</head>
<body>
	<div class="container">
		<div class="form-container">
			<h1>Music Web</h1>
			<h4>
				<spring:message code="signin.connect" />
			</h4>
			<div class="form">
				<div class="method-container">
					<p>
						<spring:message code="signin.method" />
					</p>
				</div>
				<div class="input-container" data-error="">
					<div class="username">
						<i class="fas fa-user"></i> <input type="text"
							placeholder="<spring:message code="signin.displayname" />">
					</div>
					<div class="email">
						<i class="fas fa-envelope"></i> <input type="text"
							placeholder="<spring:message code="signin.email" />">
					</div>
					<div class="password">
						<i class="fas fa-lock lock"></i> <input type="password"
							placeholder="<spring:message code="signin.password" />">
					</div>
					<div class="code">
						<i class="fas fa-user-secret"></i><span>MW-</span><span
							class="counter"><span class="minute"></span><span>:</span><span
							class="second"></span></span> <input type="text"
							placeholder="<spring:message code="signin.confirmcode" />">
					</div>
				</div>
				<div class="button-container">
					<button type="button" style="display: block;">
						<spring:message code="signin.signin" />
					</button>
				</div>
				<div class="link-container">
					<a href="#"><spring:message code="signin.forgot" /></a> <a
						href="#"><spring:message code="signin.signupnow" /></a>
				</div>
			</div>
			<div class="language-container">
				<a href="./?lang=vi">VI</a> <a href="./?lang=en">EN</a>
			</div>
		</div>

		<div class="blur">
		<c:set var="signinMessage"><spring:message code="signin.signin"></spring:message></c:set>
		<c:set var="signupMessage"><spring:message code="signin.signup"></spring:message></c:set>
		<c:set var="signinMessageNow"><spring:message code="signin.signinnow"></spring:message></c:set>
		<c:set var="signupMessageNow"><spring:message code="signin.signupnow"></spring:message></c:set>
		<c:set var="sendcodeMessage"><spring:message code="signin.sendcode"></spring:message></c:set>
		<c:set var="resetMessage"><spring:message code="signin.reset"></spring:message></c:set>
		
		<c:set var="emptyemail"><spring:message code="signin.emptyemail"></spring:message></c:set>
		<c:set var="invalidemail"><spring:message code="signin.invalidemail"></spring:message></c:set>
		<c:set var="doesnotexistemail"><spring:message code="signin.doesnotexistemail"></spring:message></c:set>
		<c:set var="emptypassword"><spring:message code="signin.emptypassword"></spring:message></c:set>
		<c:set var="spacePassword"><spring:message code="signin.spacePassword"></spring:message></c:set>
		<c:set var="emptydisplayname"><spring:message code="signin.emptydisplayname"></spring:message></c:set>
		<c:set var="spacedisplayname"><spring:message code="signin.spacedisplayname"></spring:message></c:set>
		<c:set var="emptycode"><spring:message code="signin.emptycode"></spring:message></c:set>
		<c:set var="invalidcode"><spring:message code="signin.invalidcode"></spring:message></c:set>
		<c:set var="incorrectcode"><spring:message code="signin.incorrectcode"></spring:message></c:set>
		<c:set var="checkemail"><spring:message code="signin.checkemail"></spring:message></c:set>
		<c:set var="recievecode"><spring:message code="signin.recievecode"></spring:message></c:set>
		
		<input hidden="" value="${emptyemail}" class="emptyemail">
		<input hidden="" value="${invalidemail}" class="invalidemail">
		<input hidden="" value="${doesnotexistemail}" class="doesnotexistemail">
		<input hidden="" value="${emptypassword}" class="emptypassword">
		<input hidden="" value="${spacePassword}" class=spacePassword>
		<input hidden="" value="${emptydisplayname}" class="emptydisplayname">
		<input hidden="" value="${spacedisplayname}" class="spacedisplayname">
		<input hidden="" value="${emptycode}" class="emptycode">
		<input hidden="" value="${invalidcode}" class="invalidcode">
		<input hidden="" value="${incorrectcode}" class="incorrectcode">
		<input hidden="" value="${checkemail}" class="checkemail">
		<input hidden="" value="${recievecode}" class=recievecode>
		
		<input hidden="" value="${signinMessage}" class="signinMessage">
		<input hidden="" value="${signupMessage}" class="signupMessage">
		<input hidden="" value="${signinMessageNow}" class="signinMessageNow">
		<input hidden="" value="${signupMessageNow}" class="signupMessageNow"> <input hidden="" value="${sendcodeMessage}" class="sendcodeMessage">
			<input hidden="" value="${resetMessage}" class="resetMessage">
		</div>
		<div class="forget-container">
			<div class="form">
				<div class="method-container">
					<p>
						<spring:message code="signin.forgottitle" />
						<i class="fas fa-times"></i>
					</p>
				</div>
				<div class="input-container-forget" data-error="">
					<div class="email-forget">
						<i class="fas fa-envelope"></i> <input type="text"
							placeholder="<spring:message code="signin.email" />">
					</div>
					<div class="code-forget">
						<i class="fas fa-user-secret"></i><span>MW-</span><span
							class="counter"><span class="minute"></span><span>:</span><span
							class="second"></span></span> <input type="text"
							placeholder="<spring:message code="signin.confirmcode" />">
					</div>
					<div class="password-forget">
						<i class="fas fa-lock lock"></i> <input type="password"
							placeholder="<spring:message code="signin.password" />">
					</div>
				</div>
				<div class="button-container-forget">
					<button type="button" style="display: block;">
						<spring:message code="signin.recievecode" />
					</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>