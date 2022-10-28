package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        try {

          if (password == null || repeatPassword == null || password.length() < 10

                  || repeatPassword.length() < 10

                  || password.equals(repeatPassword) == false) {

              throw new PasswordValidationException("Wrong passwords");

          }

        } catch (RuntimeException e) {

              throw new PasswordValidationException("Wrong passwords");
        }
    }
}
