package com.chbase.android.demo.weight.callbacks.databuilders;
import com.chbase.android.simplexml.things.types.base.Address;
import com.chbase.android.simplexml.things.types.base.CodableValue;
import com.chbase.android.simplexml.things.types.base.Contact;
import com.chbase.android.simplexml.things.types.base.Email;
import com.chbase.android.simplexml.things.types.base.Name;
import com.chbase.android.simplexml.things.types.base.Person;
import com.chbase.android.simplexml.things.types.base.Phone;
import com.chbase.android.simplexml.things.types.dates.DateTime;
import com.chbase.android.simplexml.things.types.referral.Referral;
import com.chbase.android.simplexml.things.types.referral.Task;

import java.util.Calendar;


public class ReferralBuilder extends HealthDataBuilder<Referral>  {

    @Override
    public String getTypeId() {
        return Referral.typeId;
    }

    @Override
    public Referral buildItem() {
        Referral item = new Referral();
        item.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
        item.setType(new CodableValue("Consult"));
        item.setReason(new CodableValue("Induced malaria"));

        Person person = new Person();

        Name name = new Name();
        name.setFirst("John");
        name.setLast("Doe");
        name.setFull("John Doe");
        person.setName(name);

        person.setOrganization("Dunder Mifflin");

        person.setProfessionalTraining("Java Developer");
        person.setId("12345");
        person.setType(new CodableValue("Provider"));

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

        person.setContact(contact);

        item.setReferredBy(person);
        item.setReferredTo(person);

        Task task = new Task();
        task.setBusinessStatus(new CodableValue("Specimen collected"));
        task.setTaskReason(new CodableValue("Referral"));
        task.setCreatedDate(DateTime.fromCalendar(Calendar.getInstance()));
        task.setUpdatedDate(DateTime.fromCalendar(Calendar.getInstance()));
        task.setCompletedDate(DateTime.fromCalendar(Calendar.getInstance()));
        task.setStatusReason(new CodableValue("Referral"));
        task.setOwner(person);
        task.setNote("Please collect the specimen");
        item.getTasks().add(task);

        return item;
    }

    @Override
    public String getDisplayString(Referral item) {
        return item.getWhen().toString()+" - "+item.getType().getText()+", "+item.getReason().getText();
    }
}
