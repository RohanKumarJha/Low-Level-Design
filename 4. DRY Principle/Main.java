public class Main {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        System.out.println(loginForm.validate("rohan.jha0107@gmail.com", "Rishabh@8448"));

        RegistrationForm registrationForm = new RegistrationForm();
        System.out.println(registrationForm.validate("rk0325057@gmail.com", "Rohan.jha"));
    }
}
