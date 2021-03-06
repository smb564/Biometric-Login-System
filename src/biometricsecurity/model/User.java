package biometricsecurity.model;

import java.io.Serializable;

/**
 *
 * @author Supun
 */
public class User implements Serializable{
    private final String username;
    private final AuthType authType;
    private AuthCredintials credintials;

    public User(String username, AuthType authType, float[] fingerHeights, float[] fingerWidths) {
        this.username = username.toLowerCase();
        this.authType = authType;
        this.credintials = new HandAuthCredintials(fingerHeights, fingerWidths);
    }
    
    public User(String userName, AuthType authType){
        this.authType = authType;
        this.username = userName;
        if (authType == AuthType.KEY_STROKE_DYNAMICS){
            credintials = new KeyStrokeAuthCredintials();
        }
    }

    public AuthType getAuthType() {
        return authType;
    }

    public AuthCredintials getCredintials() {
        return credintials;
    }

    public String getUsername() {
        return username;
    }
    
}
