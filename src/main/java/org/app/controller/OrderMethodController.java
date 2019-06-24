package org.app.controller;

import java.util.List;

import org.app.model.OrderMethod;
import org.app.service.IOrderMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
public class OrderMethodController {
	
	@Autowired
	private IOrderMethodService service;
	
	@RequestMapping("/reg")
	public String showReg(ModelMap map) {
	map.addAttribute("orderMethod",new OrderMethod());
		return "OrderMethodRegister";
		
	}
	
	//2.On click submit button in reg from
	
		@RequestMapping(value= "/save",  method=RequestMethod.POST)
		public String saveOder(@ModelAttribute OrderMethod orederMethod , ModelMap  map) {
			
			//Calling service Layer
			Integer id=service.saveOrederMethod(orederMethod);
			String  message= " OrderMethod ' "+id+" ' Saved Successfully" ; 
			map.addAttribute("orderMethod",new OrderMethod());
			map.addAttribute("msg ",message) ;
			return   "OrderMethodRegister";
		}
	

		//3.Fetch all rows from db and send to UI
		@RequestMapping("/all")
		public String getOrderMethod(ModelMap map) {
			List<OrderMethod> ob=service.getAllOrderMethod();
			map.addAttribute("list",ob);
			return "OrderMethodData";
			
		}
		
		@RequestMapping("/delete")
		public String deleteShipment(@RequestParam Integer id, ModelMap map) {	
			// 4.row delete
			service.deleteOrederMethod(id);
			// Fetch new data
		List<OrderMethod> obs=	service.getAllOrderMethod();
		map.addAttribute("list", obs);
		map.addAttribute("msg", "orderMethod '"+id+"'  delete sucessfully ");
			return "OrderMethodData";
		}
		
		
		// 5.show Edit page 
		@RequestMapping("/edit")
		public String  ShowEdit(@RequestParam Integer id,ModelMap map) {
			 OrderMethod om =service.getOneOrderMethod(id);
			 map.addAttribute("orderMethods",om);
			return"OrderMethodEdit";
			
		}
		
		
		//6. do Update 
		@RequestMapping(value="/update", method=RequestMethod.POST)
		public String DoUpdate(@ModelAttribute OrderMethod orderMethod,ModelMap map)   {
			// call service for update
			service.updateOrderMethod(orderMethod);
			//call service for all rows
			List<OrderMethod> obs= service.getAllOrderMethod();	
			// send to UI
			map.addAttribute("list",obs);
			map.addAttribute("msg", " orderMethod '"+orderMethod.getId()+"' update ");
			return "OrderMethodData";
		}
		
		
		//  get oneRow Data based on PK
		@RequestMapping("/view")
		public String ViewOne(@RequestParam Integer id,ModelMap map) {
			
			OrderMethod os= service.getOneOrderMethod(id);
			map.addAttribute("ob",os);
			
			return"OrderMethodViewOne"; 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
