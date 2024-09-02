package com.lxisoft.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.employee.repository.AddressRepository;


@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepo;
}
