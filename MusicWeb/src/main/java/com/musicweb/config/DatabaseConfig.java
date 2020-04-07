package com.musicweb.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.musicweb.model.Account;
import com.musicweb.model.Album;
import com.musicweb.model.Category;
import com.musicweb.model.Category_Sub;
import com.musicweb.model.Category_Sub_Song;
import com.musicweb.model.Contient;
import com.musicweb.model.Favorite;
import com.musicweb.model.Genre;
import com.musicweb.model.Genre_Account;
import com.musicweb.model.Genre_Song;
import com.musicweb.model.Nation;
import com.musicweb.model.Newsfeed;
import com.musicweb.model.Newsfeed_Album;
import com.musicweb.model.Newsfeed_Comment;
import com.musicweb.model.Newsfeed_Comment_Reply;
import com.musicweb.model.Newsfeed_Image;
import com.musicweb.model.Newsfeed_Song;
import com.musicweb.model.Playlist;
import com.musicweb.model.Playlist_Song;
import com.musicweb.model.Song;
import com.musicweb.model.Song_Comment;
import com.musicweb.model.Song_Comment_Reply;
import com.musicweb.model.Vip;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/musicweb?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("nlthanhcse");
		dataSource.setInitialSize(10);
		return dataSource;
	}

	@Bean
	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		// Cho phép hiển thị các câu truy vấn của hibernate trong console
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		properties.put("hibernate.connection.CharSet", "utf8");
		properties.put("hibernate.connection.characterEncoding", "utf8");
		properties.put("hibernate.connection.useUnicode", true);
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.musicweb.model" });
		sessionFactory.setAnnotatedClasses(Vip.class, Contient.class, Nation.class, Account.class, Category.class,
				Category_Sub.class, Category_Sub_Song.class, Genre.class, Genre_Account.class, Genre_Song.class,
				Favorite.class, Playlist.class, Playlist_Song.class, Song.class, Song_Comment.class,
				Song_Comment_Reply.class, Newsfeed.class, Newsfeed_Comment.class, Newsfeed_Comment_Reply.class,
				Newsfeed_Song.class, Newsfeed_Album.class, Newsfeed_Image.class, Album.class);
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	@Bean
	public PlatformTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
		// Không dùng transaction.commit() hay transaction.close() nữa
	}
}
