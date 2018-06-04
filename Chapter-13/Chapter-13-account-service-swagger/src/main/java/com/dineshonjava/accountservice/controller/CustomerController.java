/**
 * 
 */
package com.dineshonjava.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dineshonjava.accountservice.domain.Customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
@RequestMapping("/customer")
@Api( value = "/customer", description = "Manage Customer" )
public class CustomerController {
	
	@ApiOperation(value = "Returns Customer Name")
	@ApiResponses(
			value = {
					@ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Return Customer Name")
            }
			)
	@GetMapping("/name")
	public String customerName(@ApiParam(name="name", value="Customer Name") String name){
		return "Arnav Rajput";
	}
	
	@ApiOperation(value = "Returns Customer Object")
	@PostMapping("/name")
	public Customer addCustomerName(@RequestBody Customer customer){
		return new Customer("Aashi Rajput", "admin@dineshonjava.com", "98XXX1223", "Noida");
	}
}
