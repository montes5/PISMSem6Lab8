package userbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String loginPlaceholder = "Логин";
    private String passwordPlaceholder = "Пароль";

    public String getLoginPlaceholder() {
        return loginPlaceholder;
    }

    public void setLoginPlaceholder(String loginPlaceholder) {
        this.loginPlaceholder = loginPlaceholder;
    }

    public String getPasswordPlaceholder() {
        return passwordPlaceholder;
    }

    public void setPasswordPlaceholder(String passwordPlaceholder) {
        this.passwordPlaceholder = passwordPlaceholder;
    }

}
