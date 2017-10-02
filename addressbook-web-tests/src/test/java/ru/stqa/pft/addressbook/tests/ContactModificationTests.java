package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification () {
        app.getNavigationHelper().gotoContactPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Name", "Last name", "Name L.N.", "7777777", "mail@box.ru", "test1"), true);
        }
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Name1", "Last name1", "Name L.N.1", "77777771", "mail1@box.ru", "test1"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactPage();
    }
}
