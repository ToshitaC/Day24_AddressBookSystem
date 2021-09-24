package com.blz;

import java.util.ArrayList;

public interface AddressIF {
    public void operation();

    public void addContact();

    public void displayContents();

    public void editPerson();

    public void deletePerson();

    ArrayList<ContactPerson> getContact();
}
