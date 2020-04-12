window.addEventListener("DOMContentLoaded", function() {
	var inputs = document.querySelectorAll(".input-container input");
	var inputsForget = document.querySelectorAll(".input-container-forget input");
	var links = document.querySelectorAll(".link-container a");
	var signInUpBtn = document.querySelector(".button-container button");
	var inputContainer = document.querySelector(".input-container");
	var inputContainerForget = document.querySelector(".input-container-forget");
	var closeBtn = document.querySelector(".forget-container p i");
	var sendCodeBtn = document.querySelector(".button-container-forget button");
	var locks = document.querySelectorAll(".lock");
	var spacePattern = /[ \t]+/g;
	var emailPattern = /[a-zA-Z0-9]+@gmail.com/g;
	var checkSignUp = 1; // 1: chưa nhập mã, 2 : đang trong quá trình nhập mã
	var timerCode;
	var checkMail = false;

	for (var i = 0; i < inputs.length; i++) {
		inputs[i].addEventListener("focus", function() {
			clearAfterSelector();
			this.parentElement.classList.add("focused");
		});
		
		inputs[i].addEventListener("keyup", function() {
			inputContainer.classList.remove("error");
		});	
	}
	
	for (var i = 0; i < inputsForget.length; i++) {
		inputsForget[i].addEventListener("focus", function() {
			clearAfterSelector();
			this.parentElement.classList.add("focused");
		});
		
		inputsForget[i].addEventListener("keyup", function() {
			inputContainerForget.classList.remove("error");
		});	
	}

	window.addEventListener("click", function(e) {
		var className = e.target.parentNode.classList[0];
		if (className != "username" && className != "email"
				&& className != "password" && className != "code" && className != "email-forget"
					&& className != "password-forget" && className != "code-forget")
			clearAfterSelector();
	});
	
	closeBtn.addEventListener("click", function() {
		resetTimer(1);
		
		document.querySelector(".form-container .form").style.opacity = "1";
		document.querySelector(".form-container h4").style.opacity = "1";
		document.querySelector(".forget-container").style.top = "-100%";
		document.querySelector(".code-forget").classList.remove("signUp");
		document.querySelector(".code").classList.remove("signUp");
		document.querySelector(".password-forget").classList.remove("signUp");
		
		checkSignUp = 1;
		sendCodeBtn.textContent = document.querySelector(".recievecode").value;
		checkMail = false;
	});

	links[0].addEventListener("click", function() {
		document.querySelector(".form-container .form").style.opacity = "0";
		document.querySelector(".form-container h4").style.opacity = "0";
		document.querySelector(".forget-container").style.top = "50%";
		
		resetTimer(0);
		checkMail = false;
	});

	links[1].addEventListener("click", function() {
		var usernameContainer = document.querySelector(".username");
		if (usernameContainer.classList.contains("signUp")) {
			resetTimer(0);
			this.textContent = document.querySelector(".signupMessageNow").value;
			signInUpBtn.textContent = document.querySelector(".signupMessage").value;
			
			
		} else {
			resetTimer(0);
			this.textContent = document.querySelector(".signinMessageNow").value;
			signInUpBtn.textContent = document.querySelector(".signinMessage").value;
		}
		usernameContainer.classList.toggle("signUp");
		signInUpBtn.classList.toggle("signUp");
		checkMail = false;
	});
	
	sendCodeBtn.addEventListener("click", function() {
		if(checkSignUp == 1) {
			if (!isEmpty(document.querySelector(".email-forget input").value.trim())) {
				if (document.querySelector(".email-forget input").value.trim().match(emailPattern) != null) {
					document.querySelector(".email-forget input").value = document.querySelector(".email-forget input").value.trim();
					if (document.querySelector(".email-forget input").value == "1@gmail.com") {
						console.log(1);
						counter(1);
						checkSignUp = 2;
						if(document.querySelector(".password-forget").classList.contains("signUp")) {
							if (!isEmpty(document.querySelector(".password-forget input").value.trim())) {
								if (!hasSpace(document.querySelector(".password-forget input").value)) {
									alert("Your password is rested");
									closeBtn.click();
								} else {
									inputContainerForget.dataset.error = document.querySelector(".spacepassword").value;;
									inputContainerForget.classList.add("error");
								}
							} else {
								inputContainerForget.dataset.error = document.querySelector(".emptyepassword").value;;
								inputContainerForget.classList.add("error");
							}
						}
					} else {
						inputContainerForget.dataset.error = document.querySelector(".doesnotexistemail").value;;
						inputContainerForget.classList.add("error");
					}
				} else {
					inputContainerForget.dataset.error = document.querySelector(".invalidemail").value;;
					inputContainerForget.classList.add("error");
				}
			} else {
				inputContainerForget.dataset.error = document.querySelector(".emptyemail").value;;
				inputContainerForget.classList.add("error");
			}
		} else {
			checkCode(1);
		}
	});

	signInUpBtn.addEventListener("click", function() {
		if(checkSignUp == 1) {
			if (this.classList.contains("signUp")) {
				checkInputContainer(0, inputContainer);
			} else {
				checkInputContainer(1, inputContainer);
			}
		} else {
			checkCode(0);
			alert("Sign up successfully");
			links[1].click();
		}
	});
	
	for (var i = 0; i < locks.length; i++) {
		locks[i].addEventListener("click", function(){
			if(this.classList.contains("fa-unlock")) {
				this.classList.remove("fa-unlock");
				this.parentNode.querySelector("input").type = "password";
			} else {
				this.classList.add("fa-unlock");
				this.parentNode.querySelector("input").type = "text";
			}
		});
	}
	
	function resetTimer(isForget) {
		if (isForget) {
			name = "code-forget";
		} else {
			name = "code"
		}
		document.querySelector(`.${name}`).classList.remove("signUp");
		document.querySelector(`.${name} .minute`).textContent = "";
		document.querySelector(`.${name} .second`).textContent = "";
		document.querySelector(`.${name} input`).value = "";
		checkSignUp = 1;
		clearInterval(timerCode);
		inputContainer.classList.remove("error");
		inputContainerForget.classList.remove("error");
	}
	
	function checkCode(isForget) {
		var name = "";
		var object = inputContainer;
		if(isForget == 1) {
			name = "-forget";
			object = inputContainerForget;
		}
		if (!isEmpty(document.querySelector(`.code${name} input`).value)) {
			if (!hasSpace(document.querySelector(`.code${name} input`).value)) {
				if (parseInt(document.querySelector(`.code${name} input`).value) == 123456) {
//					console.log(`Correct code`);
					var code = 123456;
					resetTimer(1);
					document.querySelector(`.code${name}`).classList.add("signUp");
					checkSignUp = 1;
					sendCodeBtn.textContent = document.querySelector(".resetMessage").value;
					document.querySelector(`.code${name} input`).value = 123456;
					document.querySelector(`.password${name}`).classList.add("signUp");
				} else {
					object.dataset.error = document.querySelector(".incorrectcode").value;;
					object.classList.add(`error`);
				}
			} else {
				object.dataset.error = document.querySelector(".invalidcode").value;;
				object.classList.add(`error`);
			}
		} else {
			object.dataset.error = document.querySelector(".emptycode").value;;
			object.classList.add(`error`);
		}
	}
	
	function checkInputContainer(isSignIn, inputContainer) {
		var validUserName = false;
		if (isSignIn) {
			validUserName = true;
		} else {
			if (!isEmpty(document.querySelector(".username input").value)) {
				if (!hasSpace(document.querySelector(".username input").value)) {
					validUserName = true;
				} else {
					inputContainer.dataset.error = document.querySelector(".spacedisplayname").value;;
					inputContainer.classList.add("error");
					validUserName = false;
				}
			} else {
				inputContainer.dataset.error = document.querySelector(".emptydisplayname").value;;
				inputContainer.classList.add("error");
				validUserName = false;
			}
		}
		
		if (validUserName) {
			if (!isEmpty(document.querySelector(".email input").value.trim())) {
				if (document.querySelector(".email input").value.trim().match(emailPattern) != null) {
					document.querySelector(".email input").value = document.querySelector(".email input").value.trim();
					if (document.querySelector(".email input").value == "1@gmail.com" && isSignIn) {
						if (!isEmpty(document.querySelector(".password input").value.trim())) {
							if (!hasSpace(document.querySelector(".password input").value)) {
								if (isSignIn) {
									alert("Sign In successfully");
									inputContainer.classList.remove("error");
									checkMail = false;
								}
							} else {
								inputContainer.dataset.error = document.querySelector(".spacePassword").value;;
								inputContainer.classList.add("error");
							}
						} else {
							inputContainer.dataset.error = document.querySelector(".emptypassword").value;;
							inputContainer.classList.add("error");
						}
					} else {
						if(isSignIn) {
							inputContainer.dataset.error = document.querySelector(".doesnotexistemail").value;;
							inputContainer.classList.add("error");
						} else {
							if (!isEmpty(document.querySelector(".password input").value.trim())) {
								if (!hasSpace(document.querySelector(".password input").value)) {
									inputContainer.classList.remove("error");
									checkSignUp = 2;
									counter(0);
								} else {
									inputContainer.dataset.error = document.querySelector(".spacePassword").value;;
									inputContainer.classList.add("error");
								}
							} else {
								inputContainer.dataset.error = document.querySelector(".emptypassword").value;;
								inputContainer.classList.add("error");
							}
						}
					}
				} else {
					inputContainer.dataset.error = document.querySelector(".invalidemail").value;
					inputContainer.classList.add("error");
				}
			} else {
				inputContainer.dataset.error = document.querySelector(".emptyemail").value;
				inputContainer.classList.add("error");
			}
		}
	}
	
	function counter(isForget) {
		var minute = 1;
		var second = 59;
		var name;
		var object;
		if (isForget) {
			name = "code-forget";
			object = inputContainerForget;
		} else {
			name = "code"
			object = inputContainer;
		}
		if(!checkMail) {
			object.dataset.error = document.querySelector(".checkemail").value;
			object.classList.add("error");
			sendCodeBtn.textContent = document.querySelector(".sendcodeMessage").value;
			checkMail = true;
		}
		document.querySelector(`.${name}`).classList.add("signUp");
		document.querySelector(`.${name} .minute`).textContent = minute;
		document.querySelector(`.${name} .second`).textContent = second;
		timerCode = setInterval(function() {
			document.querySelector(`.${name} .minute`).textContent = minute;
			document.querySelector(`.${name} .second`).textContent = second--;
			if(second == -1){
				minute--;
				second = 59
			}
			if(minute == -1) {
				document.querySelector(`.${name} .minute`).textContent = "";
				document.querySelector(`.${name} .second`).textContent = "";
				document.querySelector(`.${name}`).classList.remove("signUp");
				document.querySelector(`.${name} input`).value = "";
				signInUpBtn.disabled = false;
				checkSignUp = 1;
				clearInterval(timerCode);
				inputContainer.classList.remove("error");
				inputContainerForget.classList.remove("error");
				document.querySelector(".email-forget input").readOnly = false;
			}
		}, 1000);
	}

	function isEmpty(string) {
		string = string.replace(spacePattern, "");
		return string.length == 0 ? true : false;
	}
	
	function hasSpace(string) {
		return string.match(spacePattern)!=null?true:false;
	}

	function clearAfterSelector() {
		for (var j = 0; j < inputs.length; j++) {
			inputs[j].parentElement.classList.remove("focused");
		}
		for (var j = 0; j < inputsForget.length; j++) {
			inputsForget[j].parentElement.classList.remove("focused");
		}
	}
});