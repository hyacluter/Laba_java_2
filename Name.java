public class Name {
    private String lastName;
    private String firstName;
    private String middleName;
    public Name(String firstName) {
        this(null, firstName, null);
    }
    public Name(String firstName, String lastName) {
        this(lastName, firstName, null);
    }
    public Name(String lastName, String firstName, String middleName) {
        this.lastName=lastName;
        this.firstName=firstName;
        this.middleName=middleName;
    }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        if (lastName!=null && !lastName.isEmpty()) sb.append(lastName);
        if (firstName!=null && !firstName.isEmpty()) {
            if (sb.length()>0) sb.append(" ");
            sb.append(firstName);
        }
        if (middleName!=null && !middleName.isEmpty()) {
            if (sb.length()>0) sb.append(" ");
            sb.append(middleName);
        }
        return sb.toString();
    }
}
