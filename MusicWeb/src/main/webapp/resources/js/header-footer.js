window.addEventListener("DOMContentLoaded", function() {
	var profile_toggle_btn = document.querySelector(".profile-right i");
	var header_text_btn = document.querySelector(".toggle-header-text-btn");
	var close_header_text_btn = document.querySelector(".close-header-text-btn");
	var blur_element = document.querySelector(".blur");
	var header_text_expand_btn = document.querySelector(".header-text-expand-btn");
	
	
	header_text_btn.addEventListener("click", function() {
		document.querySelector(".header-text").classList.toggle("header-text-appear");
		blur_element.classList.toggle("blur-appear");
	});
	
	close_header_text_btn.addEventListener("click", function() {
		document.querySelector(".header-text").classList.toggle("header-text-appear");
		blur_element.classList.remove("blur-appear");
	});
	
	blur_element.addEventListener("click", function() {
		document.querySelector(".header-text").classList.toggle("header-text-appear");
		this.classList.remove("blur-appear");
	});
	
	profile_toggle_btn.addEventListener("click", function() {
		document.querySelector(".profile-toggle").classList.toggle("profile-toggle-appear");
		document.querySelector(".fa-chevron-down").classList.toggle("fa-chevron-up");
	});
	
	header_text_expand_btn.addEventListener("click", function() {
		document.querySelector(".header-text").classList.toggle("header-text-expand");
		document.querySelector(".fa-caret-square-down").classList.toggle("fa-caret-square-up");
	});
	
	window.addEventListener("click", function(e) {
		if (e.target != profile_toggle_btn) {
			document.querySelector(".profile-toggle").classList.remove("profile-toggle-appear");
			document.querySelector(".fa-chevron-down").classList.remove("fa-chevron-up");
		}
		
		if (e.target != header_text_expand_btn) {
			document.querySelector(".header-text").classList.remove("header-text-expand");
			document.querySelector(".fa-caret-square-down").classList.remove("fa-caret-square-up");
		}
	});
	
	var isLarger = false;
	window.addEventListener("scroll", function() {
		if(this.pageYOffset > document.querySelector(".header").offsetHeight/2) {
			if(!isLarger) {
				document.querySelector(".header").classList.add("sticky-header");
				isLarger = true;
			}
		} else {
			if(isLarger) {
				document.querySelector(".header").classList.remove("sticky-header");
				isLarger = false;
			}
		}
	});
});