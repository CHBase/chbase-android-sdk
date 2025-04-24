package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.Address;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.Contact;
import com.chbase.android.simplexml.things.types.base.Email;
import com.chbase.android.simplexml.things.types.base.Name;
import com.chbase.android.simplexml.things.types.base.Person;
import com.chbase.android.simplexml.things.types.base.Phone;


public class PersonBuilder extends HealthDataBuilder<Person>  {

    @Override
    public String getTypeId() {
        return Person.typeId;
    }

    @Override
    public Person buildItem() {
        Person item = new Person();

        Name name = new Name();
        name.setFirst("John");
        name.setLast("Doe");
        name.setFull("John Doe");
        item.setName(name);

        item.setOrganization("Dunder Mifflin");

        item.setProfessionalTraining("Java Developer");
        item.setId("12345");
        item.setType(new CodableValue("Provider"));

        Contact contact = new Contact();

        Address address = new Address();
        address.getStreet().add("1234 Main Street");
        address.setCity("Scranton");
        address.setPostcode("10001");
        address.setCountry("US");
        contact.getAddress().add(address);

        Phone phone = new Phone();
        phone.setNumber("555-555-5555");
        contact.getPhone().add(phone);

        Email email = new Email();
        email.setAddress("john.mclean@examplepetstore.com");
        contact.getEmail().add(email);

        item.setContact(contact);

        return item;
    }

    @Override
    public String getDisplayString(Person item) {
        return item.getName().getFull()+", "+item.getOrganization()+", "+item.getContact().getEmail().get(0).getAddress();
    }
}
