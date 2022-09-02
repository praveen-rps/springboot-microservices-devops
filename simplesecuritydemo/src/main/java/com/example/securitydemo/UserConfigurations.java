package com.example.securitydemo;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class UserConfigurations extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(NoOpPasswordEncoder.getInstance())
		.usersByUsernameQuery("select username,password,enabled from users where username=?")
		.authoritiesByUsernameQuery("select  username,role from users where username=?");
		
		
	}
	
	
	
	/*
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
		.withUser("praveen")
		.password("kumar")
		.roles("admin")
		.and()
		.withUser("sunil")
		.password("12345")
		.roles("user");
	}
	*/
	
	
	@Bean
	public PasswordEncoder getPassowordEncode() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/post").hasAnyRole("admin","user")
		.antMatchers("/details").hasAnyRole("admin","user")
		.antMatchers("/delete").hasRole("admin")
		.antMatchers("/display").hasRole("admin")
		.antMatchers("/contact").permitAll()
		.and().csrf().disable().formLogin().and().httpBasic();
		
	}
	
}
