package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification () {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().fillContactForm(new ContactData("Name1", "Last name1", "Name L.N.1", "77777771", "mail1@box.ru"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactPage();
    }
}
