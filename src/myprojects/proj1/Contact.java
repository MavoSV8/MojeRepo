package myprojects.proj1;

public class Contact {
    String phoneNum;
    String Name;


    public Contact(String num,String fName)
    {
    phoneNum = num;
    Name = fName;


    }

    public String getName() {
        return Name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setFirstName(String firstName) {
        Name = firstName;
    }
    public void setPhoneNum(String phoneNum) {
        phoneNum = phoneNum;
    }
    @Override
    public boolean equals(Object contact) {
        Contact newContact = (Contact)contact;
        if(newContact.getName() == this.Name && newContact.getPhoneNum() == this.phoneNum)
        {
            return true;
        }
            return false;
    }

}
