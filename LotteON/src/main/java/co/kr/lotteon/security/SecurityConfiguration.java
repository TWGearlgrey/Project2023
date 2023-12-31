package co.kr.lotteon.security;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.logging.Handler;

@Configuration
@RequiredArgsConstructor
public class SecurityConfiguration implements WebMvcConfigurer {
    private final SecurityUserService service;
    private final MyAccessDeniedHandler accessDeniedHandler;
    private final ResourceLoader resourceLoader;


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http    
                // 사이트 위변조 방지 비활성
                .csrf(CsrfConfigurer::disable)
                .formLogin(config -> config.loginPage("/member/login")
                        .defaultSuccessUrl("/",true)
                        .failureUrl("/member/login?success=100")
                        .usernameParameter("uid")
                        .passwordParameter("pass")
                        .permitAll()
                        .successHandler(new LoginSuccessHandler("/")))
                // 로그아웃 설정
                .logout(config -> config
                        .logoutUrl("/member/logout")
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .logoutSuccessUrl("/member/login?success=200"))
                // 자동 로그인 설정
                .rememberMe(httpSecurityRememberMeConfigurer -> httpSecurityRememberMeConfigurer
                        .rememberMeParameter("auto")
                        .alwaysRemember(false)
                        .tokenValiditySeconds(60*60*24*30*3)
                        .key("autoLogin")
                        .userDetailsService(service))
                // 인가 권한 설정
                .authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/cs/**").permitAll()
                        .requestMatchers("/member/**").anonymous()
                        .requestMatchers("/product/**").permitAll()
                        .requestMatchers("/error/**").permitAll()
                        .requestMatchers("/my/**").authenticated()
                        .requestMatchers("/company/**").permitAll()
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/policy/**").permitAll()
                        .requestMatchers("/css/**", "/js/**", "/images/**", "/thumbs/**").permitAll())


                // 에러 처리
                .exceptionHandling(exceptionHandling -> exceptionHandling
                        .authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/member/login"))
                        );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // 가장 강한 비밀번호 암호화
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/thumbs/**")
                .addResourceLocations(resourceLoader.getResource("file:thumbs/"));

    }
}
