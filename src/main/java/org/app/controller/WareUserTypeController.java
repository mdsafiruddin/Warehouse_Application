package org.app.controller;

import java.util.List;
import org.app.model.WhUserType;
import org.app.service.IWarehouseUserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class WareUserTypeController {
	
	public WareUserTypeController() {
		System.out.println("WareUser Controller");
	}
	
	@Autowired
	private IWarehouseUserTypeService service;
 
	@RequestMapping("/reg")
	public String  ShowReg(ModelMap map) {
		// form backing
		map.addAttribute("whUserType" ,new WhUserType());
		return"WareUserRegister";
		
	}
	
	
	//2.On click submit button in reg from
	
			@RequestMapping(value= "/save",  method=RequestMethod.POST)
			public String saveOder(@ModelAttribute  WhUserType  whUserType , ModelMap  map) {
				
				//Calling service Layer
				Integer id=service.saveWarehouseUserType(whUserType);
				String  message= " WareUser' "+id+" ' Saved Successfully" ; 
				map.addAttribute("whUserType" ,new WhUserType());
				map.addAttribute("msg ",message) ;
				return   "WareUserRegister";
			}
	
			

			//3.Fetch all rows from db and send to UI
			@RequestMapping("/all")
			public String getAllUser(ModelMap map) {
				List<WhUserType>ob=service.getAllWarehouseUserType();
				map.addAttribute("list",ob);
				return "WareUserData";
				
			}
			
			//4 row deleted based on id
			@RequestMapping("/delete")
			public String deleteWareUser(@RequestParam Integer id, ModelMap map) {
				
				// row delete
				service.deleteWarehouseUserType(id);
				// Fetch new data
			List<WhUserType> obs=	service.getAllWarehouseUserType();
			map.addAttribute("list", obs);
			map.addAttribute("msg", "whUserType '"+id+"'  delete sucessfully ");
				return"WareUserData";
			}
			
			
			// 5.show Edit page 
			@RequestMapping("/edit")
			public String  ShowEdit(@RequestParam Integer id,ModelMap map) {
				WhUserType  om =service.getOneWarehouseUserType(id);
				 map.addAttribute("whUserType",om);
				return"WareUserEdit";
				
			}
			
			
			//6. do Update 
			@RequestMapping(value="/update", method=RequestMethod.POST)
			public String DoUpdate(@ModelAttribute WhUserType whUserType,ModelMap map)   {
				// call service for update
				service.updateWarehouseUserType(whUserType);
				//call service for all rows
				List<WhUserType> obs= service.getAllWarehouseUserType();	
				// send to UI
				map.addAttribute("list",obs);
				map.addAttribute("msg", " orderMethod '"+whUserType.getid()+"' update ");
				return"WareUserData";
			}
			
			

		//  7.get oneRow Data based on PK
			@RequestMapping("/view")
			public String ViewOne(@RequestParam Integer id,ModelMap map) {
				
			WhUserType user= service.getOneWarehouseUserType(id);
				map.addAttribute("ob",user);
				return"WareUserViewOne"; 
			}
			
			
			
			
			
			
	
			
			
			
			
			
}
