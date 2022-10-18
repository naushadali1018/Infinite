package com.BootExample.ServicesImpl;


import com.BootExample.Exception.HnDBankException;
import com.BootExample.Model.CustomerLoginDTO;
import com.BootExample.Repository.CustomerLoginRepo;
import com.BootExample.Services.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {
    @Autowired
    private CustomerLoginRepo customerLoginRepository;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException {
        String toRet = null;
        CustomerLoginDTO customerLoginDTO = customerLoginRepository
                .getCustomerLoginByLoginName(customerLogin.getLoginName());
        if (customerLogin.getPassword().equals(customerLoginDTO.getPassword())){
            toRet = "SUCCESS";
        }else{
            throw new HnDBankException("Service.WRONG_CREDENTIALS");
        }
        return toRet;
    }
}