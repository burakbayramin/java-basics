package com.burak.interfaces.interface_irl;

public class SignUpManager {

    private IUserCheckService iUserCheckService;

    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void signUp(User user){
       if (iUserCheckService.checkService(user)) {
           System.out.println("user signed up " + user.getName());
       }
       else {
           System.out.println("fail to register");
       }
    }
}
