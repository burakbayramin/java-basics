package com.burak.interfaces.interface_irl;

public class AgeUserCheckService implements IUserCheckService{

    @Override
    public boolean checkService(User user) {
            if (user.getAge() >= 18){
                return true;
            }
            return false;

}
}
