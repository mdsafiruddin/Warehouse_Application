package org.app.controller;




import java.util.List;
import org.app.model.ShipmentType;
import org.app.service.IShipmentTypeService;
import org.app.view.ShipmentTypeExcelView;
import org.app.view.ShipmentTypePdfView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

   @Controller
    @RequestMapping("/shipment")
   public class ShipmentTypeController {
	
	@Autowired
	private IShipmentTypeService service;
	
	public ShipmentTypeController(){
		System.out.println("Shipment Controler");
	}
	
	@RequestMapping("/reg")
	public String showReg(ModelMap map) {
		map.addAttribute("shipmentType",new ShipmentType());
		return "ShipmentTypeRegister";
		
	}
	
	
	//2.On click submit button in reg from
	@RequestMapping(value= "/save",  method=RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType shipmentType , ModelMap  map) {
		
		//Calling service Layer
		Integer id=service.saveShipmentType(shipmentType);
		String  message= " Shipment ' "+id+" 'Saved Successfully" ; 
		map.addAttribute("shipmentType", new ShipmentType());
		map.addAttribute("msg ",message) ;
		return   "ShipmentTypeRegister"; 
	}
	
	
	
	//3.Fetch all rows from db and send to UI
	@RequestMapping("/all")
	public String getAllShipments(ModelMap map) {
		List<ShipmentType> ob=service.getAllShipments();
		map.addAttribute("list",ob);
		return "ShipmentTypeData";	
	}
	
	//4 row deleted based on id
	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam Integer id, ModelMap map) {
		
		// row delete
		service.deleteShipmentType(id);
		// fetech new data
	List<ShipmentType> obs=	service.getAllShipments();
	map.addAttribute("list", obs);
	map.addAttribute("msg", "shipmentType '"+id+"'  delete sucessfully ");
		return"ShipmentTypeData";
	}
	
	
	@RequestMapping("/edit")
	public String showEdit( @RequestParam Integer id, ModelMap map) {
      ShipmentType st= service.getOneShipment(id);
       map.addAttribute("shipmenttype",st);
       return"ShipmentTypeEdit";

	}
	
	//6. do Update 
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String DoUpdate(@ModelAttribute ShipmentType shipmentType ,ModelMap map)   {
		// call service for update
		service.updateShipment(shipmentType);
		
		//call service for all rows
		List<ShipmentType> obs= service.getAllShipments();
		// send to UI
		map.addAttribute("list",obs);
		map.addAttribute("msg", "shipmentType  '"+shipmentType.getId()+"' update ");
		return"ShipmentTypeData";
	}
	
	
	
	//  7.get oneRow Data based on PK
	@RequestMapping("/view")
	public String ViewOne(@RequestParam Integer id,ModelMap map) {
		
	ShipmentType t= service.getOneShipment(id);
		map.addAttribute("ob",t);
		
		return"ShipmentTypeViewOne"; 
	}
	
	// 8.Excel Export
	@RequestMapping("/excel")
	 public ModelAndView ShowExcel() {
		List<ShipmentType> obs=service.getAllShipments();
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		m.addObject("list", obs);
		return m;
		 
	 }
	
	// 8.PDFExport
		@RequestMapping("/pdf")
		 public ModelAndView ShowPdf() {
			List<ShipmentType> obs=service.getAllShipments();
			ModelAndView m=new ModelAndView();
			m.setView(new ShipmentTypePdfView() );
			m.addObject("list", obs);
			return m;
	
		}
		
	/*	@RequestMapping("/pdf")
		public ModelAndView showPdf(
				@RequestParam(value = "id",required = false)Integer id
				)
		{
			ModelAndView m=new ModelAndView();
			m.setView(new ShipmentTypePdfView());

			if(id!=null) { //exactly one row
				ShipmentType s=service.getOneShipment(id);
				m.addObject("list", Arrays.asList(s));
			}else { //all rows
				List<ShipmentType> obs=service.getAllShipments();
				m.addObject("list", obs);
			}

			return m;
		
		}
		
		*/
		
		
		
}
