package demo.vmware.bulkload;

public class Customer {
    private String guid;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String telephoneNumber;
    private String dateOfBirth;
    private Integer age;
    private String companyEmail;
    private String nationalIdentityCardNumber;
    private String nationalIdentificationNumber;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getNationalIdentityCardNumber() {
        return nationalIdentityCardNumber;
    }

    public void setNationalIdentityCardNumber(String nationalIdentityCardNumber) {
        this.nationalIdentityCardNumber = nationalIdentityCardNumber;
    }

    public String getNationalIdentificationNumber() {
        return nationalIdentificationNumber;
    }

    public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
        this.nationalIdentificationNumber = nationalIdentificationNumber;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "guid='" + guid + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", companyEmail='" + companyEmail + '\'' +
                ", nationalIdentityCardNumber='" + nationalIdentityCardNumber + '\'' +
                ", nationalIdentificationNumber='" + nationalIdentificationNumber + '\'' +
                '}';
    }
}
