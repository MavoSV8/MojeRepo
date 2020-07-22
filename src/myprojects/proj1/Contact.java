package myprojects.proj1;

public class Contact {
    int phoneNum;
    String Name;


    public Contact(int num,String fName)
    {
    phoneNum = num;
    Name = fName;


    }

    public String getName() {
        return Name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setFirstName(String firstName) {
        Name = firstName;
    }
    public void setPhoneNum(int Num) {
        phoneNum = Num;
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
