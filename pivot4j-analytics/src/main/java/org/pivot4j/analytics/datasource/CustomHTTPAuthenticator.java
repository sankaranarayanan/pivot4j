package org.pivot4j.analytics.datasource;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;

/**
 *
 * @author elihydltmdo113
 */
public class CustomHTTPAuthenticator extends Authenticator {

    private String username = "";
    private String password = "";
    
    public CustomHTTPAuthenticator(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    
    protected PasswordAuthentication getPasswordAuthentication() {
            // Get information about the request
            String promptString = getRequestingPrompt();
            String hostname = getRequestingHost();
            InetAddress ipaddr = getRequestingSite();
            int port = getRequestingPort();
    // Return the information
            return new PasswordAuthentication(username, password.toCharArray());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
