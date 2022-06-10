
public class Verification {

    static void verificationLoginAndParol (String login, String password, String confirmPassword) {
        try {
            verificationLogin(login);
            verificationPassword(password, confirmPassword);
        }
        catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        catch (WrongLoginException e) {
        System.out.println(e.getMessage());
        }
    }

    static void verificationLogin(String login) {
        if (login.length() > 20) {
            throw new WrongLoginException("Login more 20 characters");
        } else {
            if (login.matches("^[a-zA-Z0-9_]+$")) {
                System.out.println("Login is correct");
            } else {
                throw new WrongLoginException("Login has not correct characters");
            }
        }
    }

    static void verificationPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() > 20) {
            throw new WrongPasswordException("Password more 20 characters");
        } else {
            if (!password.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongPasswordException("Password has not correct characters");
            } else {
                if (!password.equals(confirmPassword)) {
                    throw new WrongPasswordException("Password is not equals ConfirmPassword");
                }
                else {
                    System.out.println("Password is correct");
                }
            }
        }
    }
}
