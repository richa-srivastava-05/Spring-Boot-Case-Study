package com.librarysys;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	BookRepo repo;
	
	@Autowired
	AdminRepo arepo;
	
	@Autowired
	UserRepo urepo;
	
		
	@PostMapping("/books")
	public String addBook(@RequestBody Books book) {
		repo.save(book);
		return "Data added successfully";
	}
	
	@GetMapping("/books")
	public List<Books> showBooks()
	{
		return repo.findAll();
	}

	@GetMapping("/books/{bid}")
	public Optional<Books> showBook(@PathVariable("bid") int bid)
	{
		return repo.findById(bid);
	}
	
	@PutMapping("/books")
	public String updateBook(@RequestBody Books book) {
		repo.save(book);
		return "Data modified successfully";
	}
	
	@DeleteMapping("/books/{bid}")
	public String deleteBook(@PathVariable("bid") int bid) {
		 repo.deleteById(bid);  
		 return "Data deleted successfully.";
	}
	
	@PostMapping("/admin")
	public String addAdmin(@RequestBody Admin_Table admin) {
		arepo.save(admin);
		return "Data added successfully";
	}
	
	@GetMapping("/admin")
	public List<Admin_Table> showAdmin()
	{
		return arepo.findAll();
	}

	@GetMapping("/admin/{aid}")
	public Optional<Admin_Table> showAdmin(@PathVariable("aid") int aid)
	{
		return arepo.findById(aid);
	}
	
	@PutMapping("/admin")
	public String updateAdmin(@RequestBody Admin_Table admin) {
		arepo.save(admin);
		return "Data modified successfully";
	}
	
	@DeleteMapping("/admin/{aid}")
	public String deleteAdin(@PathVariable("aid") int aid) {
		 arepo.deleteById(aid);  
		 return "Data deleted successfully.";
	}
	
	@PostMapping("/user")
	public String addUser(@RequestBody Users_Table admin) {
		urepo.save(admin);
		return "Data added successfully";
	}
	
	@GetMapping("/user")
	public List<Users_Table> showUser()
	{
		return urepo.findAll();
	}

	@GetMapping("/user/{uid}")
	public Optional<Admin_Table> showUser(@PathVariable("uid") int uid)
	{
		return arepo.findById(uid);
	}
	
	@PutMapping("/user")
	public String updateUser(@RequestBody Users_Table user) {
		urepo.save(user);
		return "Data modified successfully";
	}
	
	@DeleteMapping("/user/{uid}")
	public String deleteUser(@PathVariable("uid") int uid) {
		 urepo.deleteById(uid);  
		 return "Data deleted successfully.";
	}

}
