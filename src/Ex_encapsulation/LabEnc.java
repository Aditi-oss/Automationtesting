package Ex_encapsulation;

import java.net.PasswordAuthentication;

public class LabEnc {
    public static void main(String[] args) {
        //Vwologin v1 = new Vwologin();


//we can use the setter and getter the medthos to get password

    }

    class Vwologin {
        private String Username;
        private String Password;

        public String getUsername() {
            return Username;
        }

        public void setUsername(String username) {
            Username = username;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public Vwologin(String Username, String Password) {
            this.Username = Username;
            this.Password = Password;

//  wrapping of a data under a single unit is known as encapsulation.
            //you need to all variable as private
            //acess modifier we can hide the data on that
            //


        }
    }
}