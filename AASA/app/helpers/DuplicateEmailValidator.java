package helpers;

import models.Anggota;
import play.data.validation.Constraints;
import play.libs.F;

/**
 * Created with IntelliJ IDEA.
 * User: jordan
 * Date: 9/30/13
 * Time: 12:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class DuplicateEmailValidator extends Constraints.Validator<String> {

    @Override
    public boolean isValid(String email) {
        return (Anggota.findByEmail(email)==null);
    }

    @Override
    public F.Tuple<String, Object[]> getErrorMessageKey() {
        return F.Tuple("error.invalid", new Object[]{});
    }
}
