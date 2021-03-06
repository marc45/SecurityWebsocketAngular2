package com.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * User information for Spring Security Authentication
 *
 * */
public class User implements UserDetails, Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -8317788343943280009L;

	/**
	 * Username.
	 * */
    private String username;

	/**
	 * Password.
	 * */
    private String password;

	/**
	 * Account expired.
	 * */
    private boolean accountNonExpired;

	/**
	 * Account locked.
	 * */
    private boolean accountNonLocked;

	/**
	 * Expired Credentials.
	 * */
    private boolean credentialsNonExpired;

	/**
	 * Enabled users.
	 * */
    private boolean enabled;

	/**
	 * Get username.
	 * @return String
	 * */
    public String getUsername() {
        return username;
    }

	/**
	 * Set username.
	 * @param username String
	 * */
    public void setUsername(String username) {
        this.username = username;
    }

	/**
	 * Get password.
	 * @return String
	 * */
    public String getPassword() {
        return password;
    }

	/**
	 * Set password.
	 * @param password String
	 * */
    public void setPassword(String password) {
        this.password = password;
    }

	/**
	 * Return if the account is expired.
	 * @return boolean
	 * */
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

	/**
	 * Set if the account is expired.
	 * @param accountNonExpired boolean
	 * */
    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

	/**
	 * Return if the account is locked.
	 * @return boolean
	 * */
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

	/**
	 * Set if the account is locked.
	 * @param accountNonLocked boolean
	 * */
    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

	/**
	 * Return if the credentials are expired.
	 * @return boolean
	 * */
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

	/**
	 * Set if the credentials are expired.
	 * @param credentialsNonExpired boolean
	 * */
    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

	/**
	 * Return if the user is enabled.
	 * @return boolean
	 * */
    public boolean isEnabled() {
        return enabled;
    }

	/**
	 * Set if the user is enabled.
	 * @param enabled boolean
	 * */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// Dummy
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		return roles;
	}
}
