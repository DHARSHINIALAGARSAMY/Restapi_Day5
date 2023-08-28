package com.skcet.dayfive.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.dayfive.Model.Book;
import com.skcet.dayfive.Service.UserService;

@RestController
public class BookController {

	@Autowired
	UserService ser;


	@PostMapping("addingbook")

	public Book add(@RequestBody Book bb)
	{
	return ser.saveinfo(bb);

	}

	@PostMapping("addnbooks")

	public List<Book> addndetails(@RequestBody List<Book> bb)
	{
	   return ser.savedetails(bb);
	}

	@GetMapping("showbooks")

	public List<Book> show()
	{
	return ser.showinfo();
	}

	@PutMapping("updatebooks")
	public Book modify(@RequestBody Book bb)
	{
	return ser.changeinfo(bb);
	}

	@DeleteMapping("deletebooks")
	public String del(@RequestBody Book bb)
	{
	  ser.deleteinfo(bb);
	  return "Deleted successfully";
	}

	@DeleteMapping("deleteid/{id}")
	public void deletemyid(@PathVariable int id)
	{
	  ser.deleteId(id);

	}
	@DeleteMapping("delparamid")

	public void deletemyparamid(@RequestParam int id)
	{
	  ser.deletepId(id);
	}
}
