package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {

    @Test//(enabled = false)
    public void testContactCreation() {
        app.goTo().contactPage();
        Contacts before = app.contact().all();
        ContactData contact = new ContactData().withFirstname("Name").withLastname("Last name").withTitle("Name L.N.").withMobile("7777777").withEmail("mail@box.ru").withGroup("test1");
        app.contact().create(contact, true);
        Contacts after = app.contact().all();
        assertThat(after.size(), equalTo(before.size()+1));
        assertThat(after, equalTo(before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }

}
