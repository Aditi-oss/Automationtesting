package Ex_encapsulation;

public class Lab002 {
    public static void main(String[] args) {
       // Person p1 = new Person(name,"123");
       // p1.getName();
       // p1.setName("aditi");
        //p1.getPhone_number();
        //p1.setPhone_number(90);

    }
}
    //NOT DIRECTLY access to the method this is called as encapsulation
//
    class Person {
        private String name;
        private String phone_number;

        public Person(String name, String phone_number) {
            this.name = name;
            this.phone_number = phone_number;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(String phone_number) {
            this.phone_number = phone_number;
        }
    }



