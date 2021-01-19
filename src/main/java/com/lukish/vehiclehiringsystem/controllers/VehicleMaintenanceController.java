package com.lukish.vehiclehiringsystem.controllers;

import java.util.Optional;

import com.lukish.vehiclehiringsystem.models.VehicleMaintenance;
import com.lukish.vehiclehiringsystem.services.SupplierService;
import com.lukish.vehiclehiringsystem.services.VehicleMaintenanceService;
import com.lukish.vehiclehiringsystem.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class VehicleMaintenanceController {

	
	@Autowired private VehicleMaintenanceService vehicleMaintenanceService;
	@Autowired private VehicleService vehicleService;
	@Autowired private SupplierService supplierService;

	
	//Get All VehicleMaintenances
	@GetMapping("vehicleMaintenances")
	public String findAll(Model model){		
		model.addAttribute("vehicleMaintenances", vehicleMaintenanceService.findAll());
		model.addAttribute("vehicles", vehicleService.findAll());
		model.addAttribute("suppliers", supplierService.findAll());

		return "vehicleMaintenance";
	}	
	
	@RequestMapping("vehicleMaintenances/findById") 
	@ResponseBody
	public Optional<VehicleMaintenance> findById(Integer id)
	{
		return vehicleMaintenanceService.findById(id);
	}
	
	//Add VehicleMaintenance
	@PostMapping(value="vehicleMaintenances/addNew")
	public String addNew(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceService.save(vehicleMaintenance);
		return "redirect:/vehicleMaintenances";
	}	
	
	@RequestMapping(value="vehicleMaintenances/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceService.save(vehicleMaintenance);
		return "redirect:/vehicleMaintenances";
	}
	
	@RequestMapping(value="vehicleMaintenances/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleMaintenanceService.delete(id);
		return "redirect:/vehicleMaintenances";
	}

}
