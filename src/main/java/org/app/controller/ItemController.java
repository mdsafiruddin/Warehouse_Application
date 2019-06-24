package org.app.controller;

import java.util.List;

import org.app.model.Item;
import org.app.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private IItemService service;
	
	@RequestMapping("/reg")
	public String ItemShow(ModelMap map) {
		map.addAttribute("item",new Item());
		return"ItemRegister";
	}

	//2.On click submit button in reg from
	
			@RequestMapping(value= "/save",  method=RequestMethod.POST)
			public String saveItem(@ModelAttribute Item m , ModelMap  map) {
				
				//Calling service Layer
				Integer id=service.ItemSave(m);
				String  message= " item ' "+id+" ' Saved Successfully" ; 
				map.addAttribute("item",new Item());
				map.addAttribute("msg ",message) ;
				return"ItemRegister";
			}
	
			//3.Fetch all rows from db and send to UI
			@RequestMapping("/all")
			public String getItemMethod(ModelMap map) {
				List<Item> ob=service.getAllItem();
				map.addAttribute("list",ob);
				return "ItemData";
				
			}
			
			
			// 4.row delete
			@RequestMapping("/delete")
			public String deleteItem(@RequestParam Integer Id, ModelMap map) {
				// call delete method
				service.deleteItem(Id);
				// Fetch new data
			List<Item> obs=	service.getAllItem();
			map.addAttribute("list", obs);
			map.addAttribute("msg", "item '"+Id+"'  delete sucessfully ");
				return "ItemData";
			}
	
			
			
			// 5.show Edit page 
			@RequestMapping("/edit")
			public String  ItemEdit(@RequestParam Integer id,ModelMap map) {
				Item t =service.getOneItem(id);
				 map.addAttribute("item",t);
				return"ItemEdit";
				
			}
			

			//6. do Update 
			@RequestMapping(value="/update", method=RequestMethod.POST)
			public String DoUpdate(@ModelAttribute Item item,ModelMap map)   {
				// call service for update
				service.ItemUpdate(item);
				
				//call service for all rows
				List<Item> obs= service.getAllItem();
				// send to UI
				map.addAttribute("list",obs);
				map.addAttribute("msg", " item '"+item.getid()+"' update ");
				return "ItemData";
			}
			
		//  get oneRow Data based on PK
			@RequestMapping("/view")
			public String ViewOne(@RequestParam Integer id,ModelMap map) {

				Item m= service.getOneItem(id);
				map.addAttribute("ob",m);
				return"ItemViewOne"; 
			}
			
			
			
			
			
			
			
			
}
