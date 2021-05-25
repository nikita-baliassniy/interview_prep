package ru.geekbrains.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static Builder newBuilder() {
        return new Person().new Builder();
    }

    public class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        private Builder(){
        }

        public Builder addFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder addMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder addLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder addCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder addAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder addPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder addGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder addAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return Person.this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", country='" + country + '\'' +
                    ", address='" + address + '\'' +
                    ", phone='" + phone + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}

