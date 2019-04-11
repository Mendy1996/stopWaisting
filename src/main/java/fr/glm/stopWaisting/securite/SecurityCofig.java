package fr.glm.stopWaisting.securite;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityCofig extends WebSecurityConfigurerAdapter   {
	
	//préciser d'utiliser le datasource de l'application
	@Autowired
	private DataSource dataSource;

	/**
	 * définir comment va recuperer ou chercher les utilisateurs
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/**
		
		 // on suppose que les utilisateurs sont stockes en mémoire
		 
		//Ajoutez le format de stockage du mot de passe, pour le texte brut, ajoutez {noop}
		auth.inMemoryAuthentication().withUser("admin").password("{noop}1234").roles("ADMIN","USER");
		auth.inMemoryAuthentication().withUser("user").password("{noop}1234").roles("USER");
		 * 
		 */
		//pour spring securie la colonne devrait normalement s'apeler pricipal et pareil pour le mot de passe
		//lors de l'authentification il vérifie si la raison social existe et determiner le role de l'utilisateur.
		//préciser l'encodage du mot de passe qu'il est codé en MD5
		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select raison_sociale as principal,mot_de_pass as credentials,active from utilisateur where raison_sociale=?")
		.authoritiesByUsernameQuery("select user_name as principal,profil_name as role from utilisateur_profil where  user_name=?").rolePrefix("ROLE_");
	}
	
	/**
	 * définir les stategies ou les regles de sécurités
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//on spécifie qu'on veut une authentification basé sur un formulaire avec une structure par default
		//on peut rajouter .loginPage pour customiser sa propos page de connexion
		http.formLogin().loginPage("/login");
		//Sécuriser les ressources de l'application
		//on préciser les roles qui ont acces aux differentes pages ou ressources
		http.authorizeRequests().antMatchers("/stopWasting").hasRole("magasin");
		//si le profil n'a pas le droit d'y acceder 
		http.exceptionHandling().accessDeniedPage("/403");
		//lors du logout vider le cookie contenant la idssesion et l'invalider jusqu'a la prochaine connexion
		http
		.logout()
		.logoutSuccessUrl("/login")
		.invalidateHttpSession(true)
		.deleteCookies("JSESSIONID");
		
	}
	
}
