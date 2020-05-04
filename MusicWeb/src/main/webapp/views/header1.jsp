<%@ include file="library.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <div class="container"> -->
		<div class="header">
			<div class="blur"></div>
			<div class="header-top">
				<span class="logo">MusicWeb</span>
				<div class="header-top-left">
					<i class="fas fa-bars toggle-header-text-btn"></i>
					<div class="search-container">
						<i class="fas fa-search search-icon"></i> <input type="text"
							placeholder="Nhập tên bài hát, ca sĩ hoặc mv...">
					</div>
					<div class="profile-container">
						<div class="profile-left">
							<span><i class="fas fa-user"></i></span>
							<div>
								<p class="log-in">Đăng nhập</p>
								<p class="log-out">Nguyen Lam Thanh</p>
								<p class="log-out">Tai khoan thường</p>
							</div>
						</div>
						<div class="profile-right">
							<i class="fas fa-chevron-down"></i>
						</div>
						<div class="profile-toggle">
							<div class="profile-toggle-top">
								<p class="log-out">
									<i class="far fa-user"></i>Nhạc cá nhân
								</p>
								<p>
									<i class="fas fa-sign-out-alt"></i>Đăng xuất
								</p>
							</div>
							<div class="profile-toggle-bottom">
								<a href="#" target="_blank" class="buy-vip">Mua VIP ngay</a>
							</div>
						</div>
					</div>
				</div>

			</div>
			<div class="header-text">
				<a href="javascript:void(0)"><i class="far fa-caret-square-down header-text-expand-btn"></i></a> <a href="#"
					class="close-header-text-btn"><i class="fas fa-times"></i></a> <a
					href="#">Trang trủ</a> <a href="#">Mới phát hành</a> <a href="#">Top
					100</a> <a href="#">Chủ đề</a> <a href="#">MV</a> <a href="#">Album</a>
				<a href="#">Nghệ sĩ</a> <a href="#" class="log-out">Nhạc cá nhân</a>
				<a href="#" target="_blank" class="buy-vip">Mua VIP ngay</a>
			</div>
		</div>
	<!-- 	</div> -->
</body>
</html>