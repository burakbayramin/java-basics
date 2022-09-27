package com.burak.interfaces.interface_irl;

public class ComplexUserCheckService implements IUserCheckService{

    @Override
    public boolean checkService(User user) {
        if (user.getAge() >= 18 && user.getName().startsWith("B")){
            return true;
        }
        return false;
    }
}
