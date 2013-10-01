package helpers;

import play.data.validation.Constraints;
import play.libs.F;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 9/30/13
 * Time: 12:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class PasswordValidator extends Constraints.Validator<String> {

    private static PasswordValidator _instance;
    private String password;

    public PasswordValidator()
    {
        password = null;
    }

    public static PasswordValidator getInstance()
    {
        if (_instance==null)
        {
            _instance = new PasswordValidator();
        }
        return _instance;
    }

    @Override
    public boolean isValid(String password) {
        PasswordValidator passwordValidator = PasswordValidator.getInstance();
        if (passwordValidator.getPassword()==null)
        {
            passwordValidator.setPassword(password);
            return true;
        }
        else
        {
            String confirm_password = passwordValidator.getPassword();
            passwordValidator.setPassword(null);
            return password.equals(confirm_password);
        }
    }

    @Override
    public F.Tuple<String, Object[]> getErrorMessageKey() {
        return F.Tuple("error.invalid", new Object[]{});
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
