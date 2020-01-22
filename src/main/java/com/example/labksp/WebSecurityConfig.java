package com.example.labksp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
    //    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSource ds() {
//        return DataSourceBuilder.create().build();
//    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().csrf().ignoringAntMatchers("/androidreg").and()
                .authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/images/**","/","/index","/second_page","/registration","/androidreg","/json123","/json","/json222").permitAll()
                .antMatchers("/tables").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username,password,active from usr where username =?")
                .authoritiesByUsernameQuery("select u.username, ur.roles from usr u inner join user_role  ur on u.id = ur.user_id where u.username=? ");
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password(passwordEncoder().encode("1234")).
                roles("ADMIN");
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
