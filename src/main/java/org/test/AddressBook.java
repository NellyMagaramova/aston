package org.test;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    private Map<Long, String> phoneMap = new HashMap();

    public Map<Long, String> getPhoneMap() {
        return phoneMap;
    }

    public void setPhoneMap(Map<Long, String> phoneMap) {
        this.phoneMap = phoneMap;
    }

    public void add(Long number, String fio) {
        phoneMap.put(number, fio);
    }

    public void get(String fio) {
        for (Map.Entry<Long, String> entry : phoneMap.entrySet()) {
            if (entry.getValue().equals(fio)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.add(79202520308L, "Nelly Magaramova");
        addressBook.add(79200281319L, "Vera Magaramova");
        addressBook.add(79200270953L, "Aslan Magaramov");
        addressBook.add(79200270954L, "Aslan Magaramov");
        addressBook.get("Aslan Magaramov");
    }
}
