package com.bankingapplicaton;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
		.antMatchers("/balance").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("/about").permitAll()
		.antMatchers("/contact").permitAll()	
		.and().formLogin()
		.and().httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
		.withUser("pushpa").password("pushpa").authorities("Admin").and()
		.withUser("nishu").password("nishu").authorities("User").and()
		.withUser("santhoshini").password("santhoshini").authorities("User").and()
		.withUser("gayatri").password("gayatri").authorities("User").and()
		.withUser("pavani").password("pavani").authorities("User").and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}	
}
