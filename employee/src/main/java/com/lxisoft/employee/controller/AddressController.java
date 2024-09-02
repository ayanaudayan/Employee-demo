package com.lxisoft.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.employee.service.AddressService;



@RestController
public class AddressController {
	@Autowired
	AddressService addressService;
}
