package org.app.controller;

import java.util.List;
import org.app.model.UomModule;
import org.app.service.IUomModuleSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/uom") 
public class UomModulleController {
	@Autowired
	private IUomModuleSrvice service;
	
	@RequestMapping("/reg")
	public String showPage() {
		return"UomRegister";
	}
	
	
	
	//2.On click submit button in reg from
	
			@RequestMapping(value= "/save",  method=RequestMethod.POST)
			public String Uomsave(@ModelAttribute UomModule uomModule , ModelMap  map) {
				
				//Calling service Layer
				Integer id=service.saveUom(uomModule);
				String  message= " uom ' "+id+" ' Saved Successfully" ; 
				map.addAttribute("uomModule",new UomModule());
				map.addAttribute("msg ",message) ;
				return"UomRegister";
			}
			
			
			//3.Fetch all rows from db and send to UI
			@RequestMapping("/all")
			public String getUomMethod(ModelMap map) {
				List<UomModule> ob=service.getAllUom();
				
				map.addAttribute("list",ob);
				
				return "UomData";
				
			}
			

			@RequestMapping("/delete")
			public String deleteUom(@RequestParam Integer id, ModelMap map) {
				
				// 4.row delete
				service.deleteUom(id);
				// Fetch new data
			List<UomModule> obs=	service.getAllUom();
			map.addAttribute("list", obs);
			map.addAttribute("msg", "orderMethod '"+id+"'  delete sucessfully ");
				
				return "UomData";
			}
			
			
			//6. do Update 
			@RequestMapping(value="/update", method=RequestMethod.POST)
			public String DoUpdate(@ModelAttribute UomModule uomModule,ModelMap map)   {
				// call service for update
				service.updateUom(uomModule);
				
				//call service for all rows
				List<UomModule> obs= service.getAllUom();
				// send to UI
				map.addAttribute("list",obs);
				map.addAttribute("msg", " order   '"+uomModule.getId()+"' update ");
				return "UomData";
			}
			
		
			
			
			// 8. get oneRow Data based on PK
			@RequestMapping("/view")
			public String ViewOne(@RequestParam Integer id,ModelMap map) {
				
				UomModule om= service.getOneUom(id);
				map.addAttribute("ob",om);
				return"UomViewOne"; 
			}
			
			
			
			
			
			

}
