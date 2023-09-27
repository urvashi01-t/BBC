package com.finzly.BBC.Controller;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.finzly.BBC.Entity.CustomerBill;
import com.finzly.BBC.Service.BulkUserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("bulk")
public class BulkUserController {
    @Autowired
    BulkUserService bulkUserService;
   
    @PostMapping("/upload")
	public String uploadCustomerData(@RequestParam("file") MultipartFile file) throws Exception {
		List<CustomerBill> customerList = bulkUserService.uploadCustomerData(file);
		 System.out.print("work!");
		return "Uploaded " + customerList.size() + " customer records.";
	}
    
//    @PostMapping("/upload")
//    public String uploadData(@RequestParam("file") MultipartFile file) throws Exception {
//        List<CustomerBill> customerBillList = new ArrayList<>();
//        InputStream inputStream = file.getInputStream();
//        CsvParserSettings setting = new CsvParserSettings();
//        setting.setHeaderExtractionEnabled(true);
//        CsvParser parser = new CsvParser(setting);
//        List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
//
//        parseAllRecords.forEach(record -> {
//            Customer customer = new Customer();
//            CustomerBill customerBill = new CustomerBill();
//
//            customerBill.setBillId(Integer.parseInt(record.getString("billId"))); // Assuming 'billId' is a column in your CSV
//            customerBill.setConsumedUnit(Integer.parseInt(record.getString("consumedUnit"))); // Assuming 'consumedUnit' is a column in your CSV
//
//            // Set other attributes of CustomerBill
//
//            customer.setCustomerId(Integer.parseInt(record.getString("customerId"))); // Assuming 'customerId' is a column in your CSV
//            customer.setName(record.getString("Name")); // Assuming 'Name' is a column in your CSV
//            customer.setLastName(record.getString("LastName")); // Assuming 'LastName' is a column in your CSV
//            customer.setEmail(record.getString("email")); // Assuming 'email' is a column in your CSV
//            customer.setAddress(record.getString("Address")); // Assuming 'Address' is a column in your CSV
//            customer.setPhoneNumber(Integer.parseInt(record.getString("Number"))); // Assuming 'Number' is a column in your CSV
//
//            // Set other attributes of Customer
//
//            customerBill.setCustomerId(customer);
//
//            customerBillList.add(customerBill);
//        });
//
//        // Now you have a list of CustomerBill objects with associated Customer objects
//        // You can pass this list to your service for further processing
//
//        bulkUserService.UploadData(customerBillList);
//
//        return "uploaded!!";
//    }
    
    }