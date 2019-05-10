package ood.library.management;

import ood.library.management.enums.AccountStatus;
import ood.library.management.enums.Person;

/**
 * Created by George Fouche on 5/6/19.
 */
public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;
    public boolean resetPassword(){
        return true;
    }
}
