package com.BootExample.Repository;

import com.BootExample.Model.CustomerLoginDTO;

public interface CustomerLoginRepo {
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
