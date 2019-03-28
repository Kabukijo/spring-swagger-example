package application.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.entity.Vehicle;
import io.swagger.annotations.ApiOperation;

//http://localhost:8080/swagger-ui.html#/vehicle-control
@RestController
@RequestMapping(value = "vehicles")
public class VehicleControl {

	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	@ApiOperation(value = "Return a list of vehicles")
	public @ResponseBody ResponseEntity<List<Vehicle>> getAll() {
		return new ResponseEntity<>(
				Arrays.asList(new Vehicle("1", "", "white", 2000), new Vehicle("2", "", "black", 2005)), HttpStatus.OK);
	}

}
