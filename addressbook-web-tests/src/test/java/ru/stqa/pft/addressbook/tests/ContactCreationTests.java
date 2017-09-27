package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Name", "Last name", "Name L.N.", "7777777", "mail@box.ru"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToContactPage();
    }

}
