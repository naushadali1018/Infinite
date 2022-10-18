package com.BootExample.Services;

import com.BootExample.Exception.HnDBankException;
import com.BootExample.Model.CustomerLoginDTO;
import org.springframework.stereotype.Service;

public interface CustomerLoginService {
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException;

}