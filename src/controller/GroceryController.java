package controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import data.SooperDAO;
import data.Sooperiority;

@Controller
public class GroceryController { 

	@Autowired
	SooperDAO sooper;
	
	@ResponseBody
	@RequestMapping("groc/{int}")
	public Sooperiority getOne(@PathVariable("int") int i) {
		Sooperiority soops = sooper.getByID(i);
		return soops;
	}
	
	@ResponseBody
	@RequestMapping("groc")
	public List<Sooperiority> getAll() {
		
		return sooper.getAll();
	}
	
	@ResponseBody
	@RequestMapping(path = "groc", method = RequestMethod.PUT)
	public Boolean createEntry(@RequestBody Sooperiority soopy) {
		System.out.println("In the method");
		System.out.println(soopy.getStoreName());
		double total = soopy.getAmount();
		List<Sooperiority> soopers = sooper.getAll();
		for (Sooperiority soops: soopers) {
			total = (soops.getAmount() + total);
		}
		float finaltotal = (float)total;
		soopy.setTotal(finaltotal);
		return sooper.newEntry(soopy);
	}
	
	@ResponseBody
	@RequestMapping(path = "groc", method = RequestMethod.DELETE)
	public Boolean deleteEntry(@RequestBody String id) {
		System.out.println(id);
		Sooperiority soops1= sooper.getByID(Integer.parseInt(id));
		
//		double oldamount= soops1.getAmount();
//		double newamount;
//		List <Sooperiority> soops = sooper.getAll();
//		for (Sooperiority soopers : soops) {
//			total = (soopers.getAmount() - oldamount);
//		}
		
		sooper.removeEntry(Integer.parseInt(id));

		return true;
	}
	
	
}
