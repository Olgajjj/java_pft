package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().contactPage();
        if (app.contact().all().size() == 0){
            app.contact().create(new ContactData().withFirstname("Name").withLastname("Last name").withTitle("Name L.N.").withMobile("7777777").withEmail("mail@box.ru").withGroup("test1"), true);
        }
    }

    @Test//(enabled = false)
    public void testContactModification () {
        Set<ContactData> before = app.contact().all();
        ContactData modifiedContact = before.iterator().next();
        ContactData contact = new ContactData().withId(modifiedContact.getId()).withFirstname("Name1").withLastname("Last name1").withTitle("Name L.N.1").withMobile("77777771").withEmail("mail1@box.ru").withGroup("test1");
        app.contact().modify(contact);
        Set<ContactData> after = app.contact().all();
        Assert.assertEquals(after.size(), before.size());
        before.remove(modifiedContact);
        before.add(modifiedContact);
        Assert.assertEquals(before, after);
    }


}
